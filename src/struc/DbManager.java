package struc;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by spencesouthard on 4/11/16.
 */
public class DbManager {

    //Decs
    private static DbManager dbManager;
    private HashMap<String, Db> databases = new HashMap<>();
    private String current;

    private DbManager(){

    }

    public static DbManager getInstance(){
        if(dbManager == null){
            dbManager = new DbManager();
        }
        return dbManager;
    }

    public Db currentDatabase(){
        return databases.get(current);
    }

    public boolean createDatabase(String name){

        File theDir = new File("databases/" + name);

        if (!theDir.exists()) {

            try{
                new File("databases/" + name).mkdirs();
            }
            catch(SecurityException se){
                return false;
            }
            return true;
        }

        return false;
    }

    public boolean dropDatabase(String name){

        File folder = new File("databases/" + name);

        if(!folder.exists()){
            return false;
        }

        File[] files = folder.listFiles();
        if(files!=null) { //some JVMs return null for empty dirs
            for(File f: files) {
                if(f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
        return true;
    }

    private void deleteFolder(File folder){

        File[] files = folder.listFiles();
        if(files!=null) { //some JVMs return null for empty dirs
            for(File f: files) {
                if(f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();

    }

    public boolean dropTable(String name) {

        return currentDatabase().dropTable(current, name);

    }


    public int size(){
        return databases.size();
    }

    public void insertColumn(String table, Col col){
        this.currentDatabase().insertColumn(table, col);
    }

    public Relation getTable(String database, String table){
        return databases.get(database).getTable(table);
    }

    public Relation getTable(String table){
        return databases.get(current).getTable(table);
    }

    public Relation select(String table, ArrayList<String> params, ArrayList<String> conditions, ArrayList<String> sets) {

        if(current == null){
            System.out.println("No database selected");
            return null;
        }

        return select(current, table, params, conditions, sets);
    }

    public Relation select(Relation table, ArrayList<String> params, ArrayList<String> conditions, ArrayList<String> sets) {
        return databases.get(current).select(table, params, conditions, sets);
    }

    public Relation select(String database, String table, ArrayList<String> params, ArrayList<String> conditions, ArrayList<String> sets){
        return databases.get(database).select(table, params, conditions, sets);
    }

    public void update(String table, String param, String value, ArrayList<String> conditions, ArrayList<String> sets){
        update(current, table, param, value, conditions, sets);
    }

    public void update(String database, String table, String param, String value, ArrayList<String> conditions, ArrayList<String> sets){
        databases.get(database).update(table, param, value, conditions, sets);
    }

    public void delete(String database, String table, ArrayList<String> conditions, ArrayList<String> sets){
        databases.get(database).getTable(table).delete(conditions, sets);
    }

    public void delete(String table, ArrayList<String> conditions, ArrayList<String> sets){
        databases.get(current).getTable(table).delete(conditions, sets);
    }

    public void insert(String table, ArrayList<String> values){
        databases.get(current).getTable(table).insert(values);
    }

    public void insert(String database, String table, ArrayList<String> values){
        databases.get(database).getTable(table).insert(values);
    }

    public void insert(String table, ArrayList<String> params, ArrayList<String> values){
        databases.get(current).getTable(table).insert(params, values);
    }

    public void insert(String database, String table, ArrayList<String> params, ArrayList<String> values){
        databases.get(database).getTable(table).insert(params, values);
    }

    public void wUpdate(String table, String param, String value, ArrayList<String> conditions, ArrayList<String> sets){
        databases.get(current).getTable(table).wUpdate(param, value, conditions, sets);
    }

    public Relation group(String table, ArrayList<String> params, ArrayList<String> aggregates, ArrayList<String> groupBy){
        return databases.get(current).getTable(table).group(params, aggregates, groupBy);
    }

    public boolean loadDatabase(String name){

        if(databases.containsKey(name)){
            current = name;
            System.out.println("Database loaded");
            System.out.println();
            return false;
        }

        databases.put(name, new Db(name));
        current = name;
        loadXML(name);
        System.out.println("Database " + name + " loaded.");
        System.out.println();

        return true;
    }

    private void loadXML(String databaseName){
        try{
            String fileName = "databases/" + databaseName;
            File dir = new File(fileName);
            File[] directoryListing = dir.listFiles();
            if (directoryListing != null) {

                //For each FILE in the Database Directory
                for (File child : directoryListing) {

                    // Prevents errors from hidden files generated by Windows and Mac operating systems
                    if (child.getName().substring(0, 1).equals(".")){
                        continue;
                    }

                    // Do something with child
                    DocumentBuilderFactory dbFactory
                            = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    Document doc = dBuilder.parse(child);
                    doc.getDocumentElement().normalize();

                    //get the table tag
                    String tableName = doc.getDocumentElement().getNodeName();

                    //create a table in the database obj
                    this.currentDatabase().createTable(tableName);
                    //ArrayList<Column> tempcolumns = Database.tables.get(tableName).columns;

                    //get children node of the table - column tags.
                    NodeList nodeList = doc.getDocumentElement().getChildNodes();

                    //for each column tag.
                    for (int column = 0; column < nodeList.getLength(); column++) {
                        Node fieldTag = nodeList.item(column);

                        //get the column Name.
                        String columnName = fieldTag.getNodeName();

                        if (fieldTag.getNodeType() == Node.ELEMENT_NODE) {
                            //getting the table attributes.
                            Element eElement = (Element) fieldTag;
                            String isNullAllowed = eElement.getAttribute("is_null_allowed");
                            String restriction = eElement.getAttribute("restriction");
                            String restriction2 = eElement.getAttribute("restriction_2");
                            String type = eElement.getAttribute("type");

                            Col col = new Col(columnName,
                                            type,
                                            Integer.parseInt(restriction),
                                            Integer.parseInt(restriction2),
                                            Boolean.parseBoolean(isNullAllowed));

                            //adding the table structure information to the database object.
                            /*tempcolumns.add(new Column(
                                    columnName,
                                    type,
                                    Integer.parseInt(restriction),
                                    Integer.parseInt(restriction2),
                                    isNullAllowed));
*/

                            //get a list of records tags.
                            NodeList recordNodeList
                                    = doc.getDocumentElement().getChildNodes().item(column).getChildNodes();

                            //for each record tag.
                            for (int i = 0; i < recordNodeList.getLength(); i++) {
                                Node recordNode = recordNodeList.item(i);
                                String recordNodeName = recordNode.getNodeName();
                                NodeList specificRecordNode = recordNode.getChildNodes();

                                ArrayList<String> dataArrayList = new ArrayList<String>();
                                String timestampData = null;

                                //for each specific example record0 in each column.
                                for (int j = 0; j < specificRecordNode.getLength(); j++) {
                                    if (specificRecordNode.item(j).getNodeType() == recordNode.ELEMENT_NODE) {
                                        //grab each specific record in each column.
                                        Node dataNodeList = specificRecordNode.item(j);
                                        Element dataElement = (Element) specificRecordNode.item(j);

                                        //get the data from the data tag.
                                        String data = dataElement.getTextContent();
                                        //get the timestamp attribrute.
                                        timestampData = dataElement.getAttribute("timestamp");
                                        dataArrayList.add(data);
                                        col.addRec(data, timestampData);
                                    }
                                }
                                //save the data and timestamp into the Records obj.
                                /*Record records = new Record(timestampData, dataArrayList);
                                Database.tables.get(tableName).records.add(records);*/
                            }

                            currentDatabase().insertColumn(tableName, col);

                        }
                    }

                }
            } else {
                System.out.println("NO DIRECTORY");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Database.database_name = Database.temp_database_name;
    }

    public void saveDatabase(String name){
        saveXML(name);
    }

    private void saveXML(String databaseName){

    }

    public Relation join(Relation r1, Relation r2, String field){
        return databases.get(current).join(r1, r2, field);
    }

    public Relation join(String r1, String r2, String field){

        Relation relation1 = databases.get(current).getTable(r1);
        Relation relation2 = databases.get(current).getTable(r2);

        return databases.get(current).join(relation1, relation2, field);
    }

    public void addDerivedTable(Relation r){
        databases.get(current).addDerivedTable(r);
    }

    public String showDatabases(){
        String dbs = "";

        File file = new File("databases");
        String[] names = file.list();

        for(String name : names)
        {
            dbs += name + "\n";
        }

        return dbs;
    }

    public Relation add(Relation r1, Relation r2){

        HashMap<String, Col> columns = new HashMap<>();
        Relation relation = new Relation();
        ArrayList<String> r1Headers = new ArrayList<>();
        ArrayList<String> r2Headers = new ArrayList<>();
        ArrayList<String> relationHeaders = new ArrayList<>();

        for(Col col : r1.getColumns()){
            Col c = new Col();
            c.copyAttributes(col);
            columns.put(col.getName(), c);
        }

        for(Col col : r2.getColumns()){
            Col c = new Col();
            c.copyAttributes(col);
            columns.put(col.getName(), c);
        }

        // Add these column templates to the table
        for(String key : columns.keySet()){
            relation.insertColumn(columns.get(key));
        }

        // Get header data
        for(Col col : relation.getColumns()){
            relationHeaders.add(col.getName());
        }

        for(Col col : r1.getColumns()){
            r1Headers.add(col.getName());
        }

        for(Col col : r2.getColumns()){
            r2Headers.add(col.getName());
        }

        // Compare rows in tables to add
        for(int i = 0; i < r1.getRecordSize(); i++){
            ArrayList<Rec> recs = r1.getRecordsByRowIndex(i);
            ArrayList<Rec> newRecs = new ArrayList<>();

            for(int j = 0; j < relationHeaders.size(); j++){

                for(int k = 0; k < r1Headers.size(); k++){

                    if(!r1Headers.contains(relationHeaders.get(j))){
                        Rec rec = new Rec();
                        rec.addEntry("null");
                        newRecs.add(rec);
                    }
                    else if(r1Headers.get(k).equals(relationHeaders.get(j))){
                        newRecs.add(recs.get(k));
                    }
                }
            }

            relation.insertRecordsIntoColumns(newRecs);
        }

        for(int i = 0; i < r2.getRecordSize(); i++){
            ArrayList<Rec> recs = r2.getRecordsByRowIndex(i);
            ArrayList<Rec> newRecs = new ArrayList<>();

            for(int j = 0; j < relationHeaders.size(); j++){

                for(int k = 0; k < r2Headers.size(); k++){

                    if(!r2Headers.contains(relationHeaders.get(j))){
                        Rec rec = new Rec();
                        rec.addEntry("null");
                        newRecs.add(rec);
                    }
                    else if(r2Headers.get(k).equals(relationHeaders.get(j))){
                        newRecs.add(recs.get(k));
                    }
                }
            }

            relation.insertRecordsIntoColumns(newRecs);
        }




        return relation;
    }

}
