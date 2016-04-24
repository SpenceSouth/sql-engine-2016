package struc;

import java.io.File;
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

    public void addDerivedTable(Relation r){
        joinedTables.put(r.getName(), r);
    }

    public Relation createTable(String name){
        Relation table = new Relation(name);
        tables.put(name, table);
        return table;
    }

    public Relation getTable(String name){

        if(joinedTables.containsKey(name)){
            return joinedTables.get(name);
        }

        return tables.get(name);
    }

    public boolean dropTable(String database, String name){

        String path = "databases/" + database + "/" + name + ".xml";

        File file = new File(path);

        if(!file.exists()){
            return false;
        }

        file.delete();
        return true;
    }

    public void insertColumn(String table, Col col){
        tables.get(table).insertColumn(col);
    }

    public Relation select(String table, ArrayList<String> params, ArrayList<String> conditions, ArrayList<String> sets){

        if(joinedTables.containsKey(table)){
            return select(joinedTables.get(table), params, conditions, sets);
        }

        if(!tables.containsKey(table)){
            System.out.println("Database does not contain table " + table);
            return null;
        }

        return tables.get(table).select(params, conditions, sets);
    }

    public Relation select(Relation table, ArrayList<String> params, ArrayList<String> conditions, ArrayList<String> sets){
        return table.select(params, conditions, sets);
    }

    public void update(String table, String param, String value, ArrayList<String> conditions, ArrayList<String> sets){
        tables.get(table).update(param, value, conditions, sets);
    }

    public void delete(String table, ArrayList<String> conditions, ArrayList<String> sets){
        tables.get(table).delete(conditions, sets);
    }

    public void insert(String table, ArrayList<String> values){
        tables.get(table).insert(values);
    }

    public void insert(String table, ArrayList<String> params, ArrayList<String> values){
        tables.get(table).insert(params, values);
    }

//    public void wUpdate(String table, String param, String value, ArrayList<String> conditions){
//        tables.get(table).wUpdate(param, value, conditions);
//    }
//
//    public void wSelect(String table, ArrayList<String> params, ArrayList<String> conditions){
//        tables.get(table).wSelect(params, conditions);
//    }
//
//    public Relation group(String table, ArrayList<String> params, ArrayList<String> aggregates, ArrayList<String> conditions, String groupBy, String type){
//        return tables.get(table).group(params, aggregates, conditions, groupBy, type);
//    }

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

    public Relation join(Relation r1, Relation r2, String joinField){

        Relation derivedRelation = new Relation();
        derivedRelation.setName(r1.getName() + "j" + r2.getName());
        Col joinCol1 = new Col();
        Col joinCol2 = new Col();

        // Get Columns for new relation

        for(Col col : r1.getColumns()){
            Col c = new Col();
            c.copyAttributes(col);
            derivedRelation.insertColumn(c);

            if(c.getName().equals(joinField)){
                joinCol1.copyAttributesAndRecords(r1.getColumnByName(col.getName()));
            }

        }

        for(Col col : r2.getColumns()){
            Col c = new Col();
            c.copyAttributes(col);
            derivedRelation.insertColumn(c);

            if(col.getName().equals(joinField)) {
                joinCol2.copyAttributesAndRecords(r2.getColumnByName(col.getName()));
            }

        }

        ArrayList<Integer> r1RowsToBeJoined = new ArrayList<>();
        ArrayList<Integer> r2RowsToBeJoined = new ArrayList<>();

        // Examine the records in each table from a column perspective
        for(int i = 0; i < joinCol1.size(); i++){

            for(int j = 0; j < joinCol2.size(); j++){
                if(joinCol1.getRec(i).getLastEntry().getData().equals(joinCol2.getRec(j).getLastEntry().getData())){
                    r1RowsToBeJoined.add(i);
                    r2RowsToBeJoined.add(j);
                }
            }

        }

        for(int i = 0; i < r1RowsToBeJoined.size(); i++){
            ArrayList<Rec> recs1 = r1.getRecordsByRowIndex(r1RowsToBeJoined.get(i));
            ArrayList<Rec> recs2 = r2.getRecordsByRowIndex(r2RowsToBeJoined.get(i));

            recs1.addAll(recs2);
            derivedRelation.insertRecordsIntoColumns(recs1);
        }

        // Delete the duplicated joined row from the derived relation
        derivedRelation.deleteColumnByName(joinField);

        joinedTables.put(derivedRelation.getName(), derivedRelation);

        return derivedRelation;
    }

    public int size(){
        return tables.size();
    }



}
