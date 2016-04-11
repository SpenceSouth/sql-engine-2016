package struc;

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

    public void insert(String table, Col col){
        tables.get(table).insert(col);
    }

    public void select(String table, Col record){
        tables.get(table).select(record);
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



}
