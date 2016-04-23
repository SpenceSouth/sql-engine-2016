import struc.DbManager;
import struc.Relation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by spencesouthard on 4/21/16.
 */
public class Console {

    //Decs
    private final boolean DEBUG = false;
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

        switch (first.toUpperCase()){

            case "SELECT":
                select(input);
                break;
            case "WSELECT":
                select(input);
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

    private void select(String input){
        String table = "";
        ArrayList<String> params = new ArrayList<>();
        ArrayList<String> conditions = new ArrayList<>();
        ArrayList<String> sets = new ArrayList<>();

        if(!input.toUpperCase().contains("FROM")){
            print("Syntax Error: Missing FROM keyword.");
        }
        else if(input.toUpperCase().contains("JOIN")){

        }
        else if(input.toUpperCase().contains("GROUP BY")){

        }
        else if(input.toUpperCase().contains("GROUPING SETS")){

        }
        else if(input.toUpperCase().contains("ROLLUP")){

        }
        else if(input.toUpperCase().contains("CUBE")){

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
                System.out.println(r);

            }
        }

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
        else if(level.equalsIgnoreCase("table")){
            print("CREATE TABLE not supported yet");
        }
        else{
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
