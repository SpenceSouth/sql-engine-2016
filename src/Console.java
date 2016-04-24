import struc.Col;
import struc.DbManager;
import struc.Relation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by spencesouthard on 4/21/16.
 */
public class Console {

    //Decs
    private final boolean DEBUG = true;
    private DbManager manager;
    private final ArrayList<String> EMPTY_ARRAY = new ArrayList<>();


    public static void main(String arg[]) throws Exception {
        Console console = new Console();

        boolean stop = false;

        while(!stop) {
            stop = console.accept();
        }
    }

    public Console(){
        this.manager = DbManager.getInstance();
    }

    /** Collects data from the console and passes it onto other methods */
    public boolean accept() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" >\t");
        String input = br.readLine();

        capture(input);

        return input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("exit;");
    }

    private void capture(String input){

        // Capture first token to send to appropriate regular expressions
        String first = input.split(" ")[0];

        Relation r;

        switch (first.toUpperCase()){

            case "SELECT":
                r = select(input);
                if(r == null){
                    System.out.println("No data to be returned");
                    break;
                }
                print(select(input).toString());
                break;
            case "WSELECT":
                r = select(input);
                if(r == null){
                    System.out.println("No data to be returned");
                    break;
                }
                print(select(input).toString());
                break;
            case "INSERT":
                insert(input);
                break;
            case "UPDATE":
                update(input);
                break;
            case "WUPDATE":
                update(input);
                break;
            case "DELETE":
                delete(input);
                break;
            case "CREATE":
                create(input);
                break;
            case "DROP":
                drop(input);
                break;
            case "SHOW":
            case "LIST":
                show(input);
                break;
            case "LOAD":
            case "USE":
                use(input);
                break;
            case "SAVE":
            case "COMMIT":
                save(input);
                break;
            case "HELP":
            case "-H":
                System.out.println("Available commands: SELECT, WSELECT, INSERT, UPDATE, WUPDATE, DELETE, CREATE, DROP, " +
                        "SHOW, LIST, LOAD, USE, SAVE, COMMIT");
                break;
            case "EXIT":
            case "EXIT;":
                System.out.println("EXITING....");
                break;
            default:
                System.out.println("Invalid command");

        }

    }

    private Relation select(String input){
        String table = "";
        ArrayList<String> params = new ArrayList<>();
        ArrayList<String> conditions = new ArrayList<>();
        ArrayList<String> sets = new ArrayList<>();
        boolean isEmbedded = false;

        // Check for embedded statement
        Pattern p = Pattern.compile(".* (FROM|from) \\((.*)\\)(.*)");
        Matcher m = p.matcher(input.replace(";",""));

        try {

            while(m.find()) {
                for (int i = 0; i < m.groupCount(); i++) {
                    if (DEBUG) System.out.println("TryGroup " + i + ": " + m.group(i));

                    if (i == 2) {
                        isEmbedded = true;
                    }
                }
            }
        }
        catch (IllegalStateException ise){
            isEmbedded = false;
        }

        if(!input.toUpperCase().contains("FROM")){
            print("Syntax Error: Missing FROM keyword.");
        }
        else if(isEmbedded){

            if(DEBUG)
                print("ENTERING Embedded");

            String embedded = "";

            Pattern pattern = Pattern.compile(".* (FROM|from) \\((.*)\\)(.*)");
            Matcher matcher = pattern.matcher(input.replace(";",""));

            while(matcher.find()) {
                for (int i = 0; i < matcher.groupCount(); i++) {
                    if(DEBUG) System.out.println("Group " + i + ": " + matcher.group(i));

                    if(i == 2){
                        embedded = matcher.group(i);
                    }
                }
            }

            Relation r = select(embedded);
            String name = r.getName();
            name = name + 0;
            r.setName(name);
            manager.addDerivedTable(r);

            String inputWithoutEmbedded = "";

            // Remove embedded clause from input
            inputWithoutEmbedded = input.replaceAll(embedded.trim(), "");
            inputWithoutEmbedded = inputWithoutEmbedded.replaceAll("\\(" + embedded + "\\)", r.getName()).trim();
            inputWithoutEmbedded = inputWithoutEmbedded.replaceAll("\\(\\)", r.getName().trim());

            if(DEBUG)
                print("New input: " + inputWithoutEmbedded);


            return select(inputWithoutEmbedded);
        }
        else if(input.toUpperCase().contains("JOIN")){
            String inputWithoutJoin = "";

            if(DEBUG)
                print("ENTERING JOIN");

            Pattern pattern = Pattern.compile(".* (JOIN|join) (\\w+) (ON|on) (\\w+\\.\\w+) (=) (\\w+\\.\\w+)(.*)");
            Matcher matcher = pattern.matcher(input.replace(";",""));

            // Error out if minimal conditions are not met
            if(matcher.groupCount() != 7){
                print("Syntax error in JOIN");
            }

            String table1 = "";
            String table2 = "";
            String field = "";
            String capture = "";

            while(matcher.find()){
                for(int i = 0; i < matcher.groupCount(); i++){
                    if(DEBUG) System.out.println("Group " + i + ": " + matcher.group(i));

                    if(i != 0){
                        capture += matcher.group(i) + " ";
                    }

                    if(i == 4){
                        table1 = matcher.group(i).split("\\.")[0];
                        field = matcher.group(i).split("\\.")[1];
                    }

                    if(i == 6){
                        table2 = matcher.group(i).split("\\.")[0];
                        if(!field.equals(matcher.group(i).split("\\.")[1])){
                            print("ERROR non matching join columns");
                        }
                    }

                }
            }

            Relation join = manager.join(table1, table2, field);

            // Remove JOIN clause from input
            inputWithoutJoin = input.replaceAll(capture.trim(), "");
            inputWithoutJoin = inputWithoutJoin.replaceAll(table1, join.getName()).trim();

            if(DEBUG)
                print("New input: " + inputWithoutJoin);


            return select(inputWithoutJoin);
        }
        else if(input.toUpperCase().contains("ROLLUP")){

            if (DEBUG)
                print("Entering ROLLUP");

            String groupings = "";
            String aggregates = "";
            final String EMPTY = "";

            Pattern pattern = Pattern.compile("(SELECT|select) (.+) (FROM|from) (\\w+) (GROUP|group) (BY|by) " +
                    "(ROLLUP|rollup) \\((.*)(.*)\\)");
            Matcher matcher = pattern.matcher(input.replace(";", ""));

            while (matcher.find()) {
                for (int i = 1; i < matcher.groupCount(); i++) {

                    try {
                        if (DEBUG) System.out.println("group " + i + ": " + matcher.group(i));
                    }
                    catch (NullPointerException bpe) {

                    }

                    if (i == 2) {
                        aggregates = matcher.group(i);
                    }

                    if (i == 4) {
                        table = matcher.group(i);
                    }

                    if (i == 8) {
                        groupings = matcher.group(i);
                    }

                }

            }

            String[] groupingList = groupings.split(", ");
            ArrayList<String> groupList = new ArrayList<>();

            // Clear parens out of groupList
            for(String item : groupingList){
                if(item.length() > 2)
                    groupList.add(item.substring(1, item.length() - 1));
                else
                    groupList.add(item);
            }

            String group = "";

            while(groupList.size() > 0){

                group += "(";

                for(int i = 0; i < groupList.size(); i++){
                    group += groupList.get(i) + ",";
                }

                group = group.substring(0, group.length()-1);
                group += "), ";
                groupList.remove(groupList.size()-1);

            }

            group += "()";

            String formattedQuery = String.format("SELECT %s FROM %s GROUP BY GROUPING SETS (%s)", aggregates, table, group);

            return select(formattedQuery);

        }
        else if(input.toUpperCase().contains("CUBE")){

            if (DEBUG)
                print("Entering CUBE");

            String groupings = "";
            String aggregates = "";
            final String EMPTY = "";

            Pattern pattern = Pattern.compile("(SELECT|select) (.+) (FROM|from) (\\w+) (GROUP|group) (BY|by) " +
                    "(CUBE|cube) \\((.*)(.*)\\)");
            Matcher matcher = pattern.matcher(input.replace(";", ""));

            while (matcher.find()) {
                for (int i = 1; i < matcher.groupCount(); i++) {

                    try {
                        if (DEBUG) System.out.println("group " + i + ": " + matcher.group(i));
                    }
                    catch (NullPointerException bpe) {

                    }

                    if (i == 2) {
                        aggregates = matcher.group(i);
                    }

                    if (i == 4) {
                        table = matcher.group(i);
                    }

                    if (i == 8) {
                        groupings = matcher.group(i);
                    }

                }

            }

            String[] groupingList = groupings.split(", ");
            ArrayList<String> groupList = new ArrayList<>();

            // Clear parens out of groupList
            for(String item : groupingList){
                if(item.length() > 2)
                    groupList.add(item.substring(1, item.length() - 1));
                else
                    groupList.add(item);
            }

            String group = "(";

            for(int i = 0; i < groupList.size(); i++){
                group += groupList.get(i) + ",";
            }
            group = group.substring(0, group.length()-1);

            group += "), ";

            for(int i = 0; i < groupList.size(); i++){
                group += "(" + groupList.get(i) + "), ";
            }

            group = group.substring(0, group.length()-2);
            group += ", ";


            group += "()";

            String formattedQuery = String.format("SELECT %s FROM %s GROUP BY GROUPING SETS (%s)", aggregates, table, group);

            return select(formattedQuery);

        }
        else if(input.toUpperCase().contains("GROUP BY GROUPING SETS")) {

            if (DEBUG)
                print("Entering GROUPING SETS");

            String groupings = "";
            String aggregates = "";
            final String EMPTY = "";

            Pattern pattern = Pattern.compile("(SELECT|select) (.+) (FROM|from) (\\w+) (GROUP|group) (BY|by) " +
                    "(GROUPING|grouping) (SETS|sets) \\((.*)(.*)\\)");
            Matcher matcher = pattern.matcher(input.replace(";", ""));

            while (matcher.find()) {
                for (int i = 1; i < matcher.groupCount(); i++) {

                    try {
                        if (DEBUG) System.out.println("group " + i + ": " + matcher.group(i));
                    }
                    catch (NullPointerException bpe) {

                    }

                    if (i == 2) {
                        aggregates = matcher.group(i);
                    }

                    if (i == 4) {
                        table = matcher.group(i);
                    }

                    if (i == 9) {
                        groupings = matcher.group(i);
                    }

                }

            }

            String[] groupingList = groupings.split(", ");
            String[] aggregateList = aggregates.split(", ");
            ArrayList<String> ag = new ArrayList<>();

            for (String item : aggregateList) {
                if (item.contains("avg") || item.contains("AVG")) {
                    ag.add("avg");
                    item = item.replace("avg", "").replace("AVG", "");
                    item = item.substring(1, item.length() - 1);
                    params.add(item);
                } else if (item.contains("count") || item.contains("COUNT")) {
                    ag.add("count");
                    item = item.replace("count", "").replace("COUNT", "");
                    item = item.substring(1, item.length() - 1);
                    params.add(item);
                } else if (item.contains("min") || item.contains("MIN")) {
                    ag.add("min");
                    item = item.replace("min", "").replace("MIN", "");
                    item = item.substring(1, item.length() - 1);
                    params.add(item);
                } else if (item.contains("max") || item.contains("MAX")) {
                    ag.add("max");
                    item = item.replace("max", "").replace("MAX", "");
                    item = item.substring(1, item.length() - 1);
                    params.add(item);
                } else if (item.contains("sum") || item.contains("SUM")) {
                    ag.add("sum");
                    item = item.replace("sum", "").replace("SUM", "");
                    item = item.substring(1, item.length() - 1);
                    params.add(item);
                } else {
                    params.add(item);
                    ag.add(EMPTY);
                }
            }

            HashMap<String, String> queries = new HashMap<>();

            ArrayList<String> groupList = new ArrayList<>();
            ArrayList<String> rawAgList = new ArrayList<String>(Arrays.asList(aggregateList));

            // Clear parens out of groupList
            for(String item : groupingList){
                if(item.length() > 2)
                    groupList.add(item.substring(1, item.length() - 1));
                else
                    groupList.add(item);
            }

            String formattedQuery = "SELECT %s FROM %s GROUP BY %s";

            for(int i = 0; i < groupList.size(); i++){

                String projection = "";
                String group = group = groupList.get(i);

                for(int j = 0; j < rawAgList.size(); j++){

                    String[] groupSplit = group.split(",");

                    if(Relation.contains(new ArrayList<String>(Arrays.asList(groupSplit)), rawAgList.get(j))){
                        projection += rawAgList.get(j) + ", ";
                    }
                    else if(rawAgList.get(j).contains("(")){
                        projection += rawAgList.get(j) + ", ";
                    }
                    else{
                        if(DEBUG) System.out.println("Discarding parameter " + rawAgList.get(j));
                    }

                }

                projection = projection.substring(0, projection.length()-2);

                queries.put(group, String.format(formattedQuery, projection, table, group));
                if(DEBUG) System.out.println(queries.get(group));
            }


            ArrayList<Relation> relations = new ArrayList<>();

            for(String key : queries.keySet()){

                relations.add(select(queries.get(key)));

            }

            // Add all the relations until only two are left
            while(relations.size() > 2){
                Relation r1 = relations.remove(0);
                Relation r2 = relations.remove(1);

                Relation r = manager.add(r1, r2);
                relations.add(0, r);
            }

            return manager.add(relations.get(0), relations.get(1));
        }
        else if(input.toUpperCase().contains("GROUP BY")){

            if(DEBUG)
                print("Entering GROUP BY");

            String groupings = "";
            String aggregates = "";
            final String EMPTY = "";

            Pattern pattern = Pattern.compile("(SELECT|select) (.+) (FROM|from) (\\w+) (GROUP|group) (BY|by) (.*)(.*)");
            Matcher matcher = pattern.matcher(input.replace(";",""));

            while (matcher.find()) {
                for(int i = 1; i < matcher.groupCount(); i++) {

                    try {
                        if (DEBUG) System.out.println("group " + i + ": " + matcher.group(i));
                    }
                    catch (NullPointerException bpe){

                    }

                    if(i == 2){
                        aggregates = matcher.group(i);
                    }

                    if(i == 4){
                        table = matcher.group(i);
                    }

                    if(i == 7){
                        groupings = matcher.group(i);
                    }

                }

            }

            String[] groupingList = groupings.split(", |,");
            String[] aggregateList = aggregates.split(", ");
            ArrayList<String> ag = new ArrayList<>();

            for(String item : aggregateList){
                if(item.contains("avg") || item.contains("AVG")){
                    ag.add("avg");
                    item = item.replace("avg", "").replace("AVG","");
                    item = item.substring(1, item.length()-1);
                    params.add(item);
                }
                else if(item.contains("count") || item.contains("COUNT")){
                    ag.add("count");
                    item = item.replace("count", "").replace("COUNT","");
                    item = item.substring(1, item.length()-1);
                    params.add(item);
                }
                else if(item.contains("min") || item.contains("MIN")){
                    ag.add("min");
                    item = item.replace("min", "").replace("MIN","");
                    item = item.substring(1, item.length()-1);
                    params.add(item);
                }
                else if(item.contains("max") || item.contains("MAX")){
                    ag.add("max");
                    item = item.replace("max", "").replace("MAX","");
                    item = item.substring(1, item.length()-1);
                    params.add(item);
                }
                else if(item.contains("sum") || item.contains("SUM")){
                    ag.add("sum");
                    item = item.replace("sum", "").replace("SUM","");
                    item = item.substring(1, item.length()-1);
                    params.add(item);
                }
                else{
                    params.add(item);
                    ag.add(EMPTY);
                }
            }

            if(DEBUG) System.out.println(table);

            return manager.group(table, params, ag, new ArrayList<String>(Arrays.asList(groupingList)));
        }
        // Basic SELECT statement when no special operations are included.  May or may not include a WHERE clause
        else{

            if(DEBUG)
                print("Entering SELECT");

            Pattern pattern = Pattern.compile("(SELECT|select) (.+) (FROM|from) (\\w+)" +
                    "( (WHERE|where) (\\w* (=|>|<|!=) (\"\\w+\"|\\d+))( (((AND|and)|(OR|or)) (\\w* (=|>|<|!=) (\"\\w+\"|\\d+))))*)?");
            Matcher matcher = pattern.matcher(input.replace(";",""));
            while (matcher.find()) {
                for(int i = 1; i < matcher.groupCount(); i++) {
                    if(DEBUG) System.out.println("group " + i + ": " + matcher.group(i));

                    // Capture input elements
                    if(i == 2){
                        String[] split = matcher.group(i).split(",|,\\s");
                        for(String param : split){
                            param = param.trim();

                            if(param.equals("*") || param.equals("ALL")) {

                            }
                            else{
                                params.add(param);
                            }
                        }
                    }
                    else if(i == 4){
                        table = matcher.group(i);
                    }

                    else if(i == 5){

                        if(matcher.group(i) == null){
                            continue;
                        }

                        String[] split = matcher.group(i).split(" ");

                        // Starts at 1 because of the leading space in the WHERE clause
                        for(int j = 1; j < split.length; j+=4){
                            conditions.add(split[j+1].replace("\"","'").trim() + " " + split[j+2].trim() + " " + split[j+3].replace("\"","'").trim());

                            try{
                                sets.add(split[j+4].trim());
                            }
                            catch(Exception ex){

                            }
                        }

                    }

                }

                if(DEBUG){
                    System.out.println(params);
                    System.out.println(table);
                    System.out.println(conditions);
                }

                Relation r = manager.select(table, params, conditions, sets);
                return r;

            }
        }

        return null;

    }

    private void insert(String input){

    }

    private void update(String input){

    }

    private void delete(String input){

    }

    private void create(String input){

        if(input.split(" ").length < 3){
            print("Syntax error in CREATE");
        }

        String level = input.split(" ")[1];
        String name = input.split(" ")[2].replace(";","");

        if(level.equalsIgnoreCase("database")){

            boolean success = manager.createDatabase(name);

            if(success){
                print("DATABASE " + name + " successfully created.");
            }
            else{
                print("DATABASE " + name + " already exists.");
            }

        }
        else if(level.equalsIgnoreCase("table"))
        {
            input = input.replace(";","");
            Pattern pattern = Pattern.compile("(?i)(create table) (\\w+)\\s*(\\()\\s*(.*)(\\))");
            Matcher matcher = pattern.matcher(input);

            String tableName = null;
            ArrayList<Col> colTempList = new ArrayList<>();
            while(matcher.find())
            {
                for(int i = 0; i < matcher.groupCount(); i++)
                {

                    if(i == 1)
                    {
                        tableName = matcher.group(2);
                        if (DEBUG) System.out.println(matcher.group(2));
                    }
                    if (i==3)
                    {
                        if (DEBUG)
                         System.out.println(matcher.group(4));
                        String columns = matcher.group(4);
                        String[] listColumns = columns.split(",");
                        List<String> wordList = Arrays.asList(listColumns);

                        String colName = null;
                        String typeName = null;
                        String nullable = null;
                        for (String e : wordList)
                        {
                            e = e.trim();
                            String[] splited = e.split("\\s+");

                            if (splited.length == 2)
                            {
                                colName = splited[0];
                                typeName = splited[1];
                                nullable = "null";
                            }

                            else if(splited.length == 3)
                            {
                                colName = splited[0];
                                typeName = splited[1];
                                nullable = splited[2];
                            }
                            else if(splited.length == 4)
                            {
                                colName = splited[0];
                                typeName = splited[1];
                                nullable = splited[2] +" " +splited[3];
                            }
                            else
                            {
                                System.out.println("Error: Please check field declarations or commas");
                                return;
                            }

                            //make sure nothing is null before creating table or semantically checking on anything!
                            if(tableName.equals(null) || colName.equals(null)
                                    || typeName.equals(null) || nullable.equals(null))
                            {
                                System.out.println("Error: Null Value");
                                return;
                            }

                            if (typeName.equalsIgnoreCase("date(mm/dd/yyyy)"))
                            {
                                typeName = "date";
                            }

                            //semantics check for null
                            if (nullable.equalsIgnoreCase("null"))
                            {
                                nullable = "true";
                            }
                            else if (nullable.equalsIgnoreCase("not null"))
                            {
                                nullable = "false";
                            }
                            else
                            {
                                System.out.println("Error: Invalid character when declaring NULL or NOT NULL: "+ nullable);
                                return;
                            }

                            //semantics check for type
                            if (!(typeName.equalsIgnoreCase("character")||
                                    typeName.equalsIgnoreCase("integer")||
                                    typeName.equalsIgnoreCase("number")||
                                    typeName.equalsIgnoreCase("date")))
                            {
                                System.out.println("Error: Incorrect type: "+typeName);
                                return;
                            }

                            boolean isNull;
                            if (nullable.equalsIgnoreCase("true"))
                            {
                                isNull = true;
                            }
                            else
                            {
                                isNull = false;
                            }

                            Col column = new Col (colName, typeName, 0, 0, isNull);
                            colTempList.add(column);
                        }
                    }
                }
            }
            manager.currentDatabase().createTable(tableName, colTempList);
        }
        else
        {
            print("Expected DATABASE or TABLE.  Instead found " + level + ".");
        }
    }

    private void drop(String input){

        if(input.split(" ").length < 3){
            print("Syntax error in DROP");
        }

        String level = input.split(" ")[1];
        String name = input.split(" ")[2].replace(";","");

        if(level.equalsIgnoreCase("database")){

            boolean success = manager.dropDatabase(name);

            if(success){
                print("DATABASE " + name + " successfully dropped.");
            }
            else{
                print("DATABASE " + name + " does not exist.");
            }

        }
        else if(level.equalsIgnoreCase("table")){

            boolean success = manager.dropTable(name);

            if(success){
                print("TABLE " + name + " successfully dropped.");
            }
            else{
                print("TABLE " + name + " does not exist.");
            }

        }
        else{
            print("Expected DATABASE or TABLE.  Instead found " + level + ".");
        }

    }

    private void show(String input){

        String item = input.split(" ")[1].replace(";","");

        if(item.equalsIgnoreCase("TABLES")){
            print(manager.currentDatabase().showTables());
        }
        else if(item.equalsIgnoreCase("DATABASES")){
            print(manager.showDatabases());
        }
        else{
            print("Expected DATABASES or TABLES.  Instead found " + item + ".");
        }

    }

    private void use(String input){

        //Only database can be the second idem
        if(!input.split(" ")[1].equalsIgnoreCase("database")){
            print("Expected DATABASE <database>");
        }

        //use should only be of split length 3
        if(input.split(" ").length == 3){
            String database = input.split(" ")[2].replace(";", "");
            manager.loadDatabase(database);
        }
        else{
            print("SYNTAX ERROR: Following USE");
        }

    }

    private void save(String input){

        String database = input.split(" ")[1];
        manager.saveDatabase(database);

    }

    private void print(String s){
        System.out.println(s);
        System.out.println();
    }



}
