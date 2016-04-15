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

        return false;
    }

    public boolean dropDatabase(String name){

        return false;
    }

    public int size(){
        return databases.size();
    }

    public void insert(String table, Col col){
        this.currentDatabase().insert(table, col);
    }

    public Relation getTable(String database, String table){
        return databases.get(database).getTable(table);
    }

    public Relation getTable(String table){
        return databases.get(current).getTable(table);
    }

    public void select(String table, ArrayList<String> params, ArrayList<String> conditions) {
        select(current, table, params, conditions);
    }

    public void select(String database, String table, ArrayList<String> params, ArrayList<String> conditions){
        databases.get(database).select(table, params, conditions);
    }

    public void update(String table, String param, String value, ArrayList<String> conditions){
        update(current, table, param, value, conditions);
    }

    public void update(String database, String table, String param, String value, ArrayList<String> conditions){
        databases.get(database).update(table, param, value, conditions);
    }

    public boolean loadDatabase(String name){
        databases.put(name, new Db(name));
        current = name;
        loadXML(name);
        return false;
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

                            currentDatabase().insert(tableName, col);

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

    private void saveXML(String databaseName){

    }

}
