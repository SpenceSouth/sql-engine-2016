package struc;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by spencesouthard on 4/11/16.
 */
public class Db {

    //Decs
    private String name;
    private HashMap<String, Relation> tables = new HashMap<>();
    private HashMap<String, Relation> joinedTables = new HashMap<>();

    public Db(){

    }

    public Db(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Relation createTable(String name){
        Relation table = new Relation(name);
        tables.put(name, table);
        return table;
    }

    public Relation getTable(String name){
        return tables.get(name);
    }

    public boolean dropTable(String name){

        return false;
    }

    public void insertColumn(String table, Col col){
        tables.get(table).insertColumn(col);
    }

    public Relation select(String table, ArrayList<String> params, ArrayList<String> conditions){
        return tables.get(table).select(params, conditions);
    }

    public Relation select(Relation table, ArrayList<String> params, ArrayList<String> conditions){
        return table.select(params, conditions);
    }

    public void update(String table, String param, String value, ArrayList<String> conditions){
        tables.get(table).update(param, value, conditions);
    }

    public void delete(String table, ArrayList<String> conditions){
        tables.get(table).delete(conditions);
    }

    public void insert(String table, ArrayList<String> values){
        tables.get(table).insert(values);
    }

    public void insert(String table, ArrayList<String> params, ArrayList<String> values){
        tables.get(table).insert(params, values);
    }

    public void wUpdate(String table, String param, String value, ArrayList<String> conditions){
        tables.get(table).wUpdate(param, value, conditions);
    }

    public void wSelect(String table, ArrayList<String> params, ArrayList<String> conditions){
        tables.get(table).wSelect(params, conditions);
    }

    public Relation group(String table, ArrayList<String> params, ArrayList<String> aggregates, ArrayList<String> conditions, String groupBy, String type){
        return tables.get(table).group(params, aggregates, conditions, groupBy, type);
    }

    public String showTables(){

        String list = "";

        for(String key : tables.keySet()){
            list += tables.get(key).getName() + "\n";
        }

        if(list.isEmpty()){
            return "No tables to display";
        }
        else{
            return list;
        }
    }

    public int size(){
        return tables.size();
    }



}
