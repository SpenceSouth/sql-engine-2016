package struc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.Condition;

/**
 * Created by spencesouthard on 4/11/16.
 */
public class Relation {

    //Decs
    private String name;
    private ArrayList<Col> columns = new ArrayList<>();

    public Relation(){

    }

    public Relation(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void insertColumn(Col record){
        columns.add(record);
    }

    public void insert(ArrayList<String> values){

        if(columns.size() != values.size()){
            System.out.println("Mismatch between number of columns and values to be inserted");
        }

        for(int i = 0; i < values.size(); i++){
            columns.get(i).addRec(values.get(i));
        }

    }

    public void insert(ArrayList<String> params, ArrayList<String> values){

        if(columns.size() != values.size()){
            System.out.println("Mismatch between number of columns and values to be inserted");
        }

        for(int i = 0; i < params.size(); i++){

            Col col = getColumnByName(params.get(i));

            col.addRec(values.get(i));

        }

    }

    private Col getColumnByName(String name){
        for(Col col : columns){
            if(col.getName().equals(name)){
                return col;
            }
        }

        return null;
    }


    public void update(String param, String value, ArrayList<String> conditions){

        ArrayList<Col> tempColumns = new ArrayList<>(columns);
        HashSet<Integer> recordsToUpdate = new HashSet<>();
        int numOfRecords = columns.get(0).size();

        // Finds out which records need to be updated
        for (int i = 0; i < numOfRecords; i++) {
            for (Col column : tempColumns) {
                if (predicate(conditions, column.getName(), column.getRec(i).getLastEntry().getData(), false)) {
                    recordsToUpdate.add(i);
                }
            }
        }

        // Updates records
        for(int i = 0; i < numOfRecords; i++){

            for(Col column : tempColumns){

                if(recordsToUpdate.contains(i) && column.getName().equals(param)) {

                    // Update here
                    column.getRec(i).getLastEntry().setData(value);

                }
            }

            System.out.println();
        }
    }

    public boolean delete(ArrayList<String> conditions){

        if(conditions.size() == 0){

            System.out.println();
            int numOfRecords = columns.get(0).size();

            for(Col column : columns){
                column.clear();
            }

        }
        else if(conditions.size() > 0){

            ArrayList<Col> tempColumns = new ArrayList<>(columns);
            HashSet<Integer> recordsToDelete = new HashSet<>();
            int numOfRecords = columns.get(0).size();

            for (int i = 0; i < numOfRecords; i++) {
                for (Col column : tempColumns) {
                    if (predicate(conditions, column.getName(), column.getRec(i).getLastEntry().getData(), false)) {
                        recordsToDelete.add(i);
                    }
                }
            }

            System.out.println(recordsToDelete);

            for(int i = 0; i < numOfRecords; i++){

                for(Col column : tempColumns){

                    if(recordsToDelete.contains(i)){
                        column.deleteRec(i);
                    }

                }
            }

        }
        else{
            System.out.println("Unexpected scenario occurred");
            System.exit(2);
        }



        return false;
    }

    public boolean select(ArrayList<String> params, ArrayList<String> conditions){

        if(params.size() == 0 && conditions.size() == 0){

            // Get header data from columns
            for(Col column : columns){
                System.out.print(column.getName() + "\t");
            }

            System.out.println();
            int numOfRecords = columns.get(0).size();

            for(int i = 0; i < numOfRecords; i++){
                for(Col column : columns){
                    System.out.print(column.getRec(i).getLastEntry().getData() + "\t");
                }

                System.out.println();
            }

        }
        else if(params.size() > 0 && conditions.size() == 0){

            // Get header data from columns
            for(Col column : columns){

                if(!contains(params, column.getName()))
                    continue;

                System.out.print(column.getName() + "\t");
            }

            System.out.println();
            int numOfRecords = columns.get(0).size();

            for(int i = 0; i < numOfRecords; i++){
                for(Col column : columns){

                    if(!contains(params, column.getName()))
                        continue;

                    System.out.print(column.getRec(i).getLastEntry().getData() + "\t");
                }

                System.out.println();
            }

        }
        else if(params.size() == 0 && conditions.size() > 0){

            ArrayList<Col> tempColumns = new ArrayList<>(columns);
            HashSet<Integer> recordsToRemove = new HashSet<>();
            int numOfRecords = columns.get(0).size();

            for (int i = 0; i < numOfRecords; i++) {
                for (Col column : tempColumns) {
                    if (!predicate(conditions, column.getName(), column.getRec(i).getLastEntry().getData())) {
                        recordsToRemove.add(i);
                    }
                }
            }

            // Get header data from columns
            for(Col column : tempColumns){

                System.out.print(column.getName() + "\t");
            }

            System.out.println();

            for(int i = 0; i < numOfRecords; i++){

                for(Col column : tempColumns){

                    if(recordsToRemove.contains(i)){
                        continue;
                    }

                    System.out.print(column.getRec(i).getLastEntry().getData() + "\t");
                }

                System.out.println();
            }

        }
        else if(params.size() > 0 && conditions.size() > 0){

            ArrayList<Col> tempColumns = new ArrayList<>(columns);
            HashSet<Integer> recordsToRemove = new HashSet<>();
            int numOfRecords = columns.get(0).size();

            for (int i = 0; i < numOfRecords; i++) {
                for (Col column : tempColumns) {
                    if (!predicate(conditions, column.getName(), column.getRec(i).getLastEntry().getData())) {
                        recordsToRemove.add(i);
                    }
                }
            }

            // Get header data from columns
            for(Col column : tempColumns){

                if(!contains(params, column.getName()))
                    continue;

                System.out.print(column.getName() + "\t");
            }

            System.out.println();

            for(int i = 0; i < numOfRecords; i++){

                for(Col column : tempColumns){

                    if(!contains(params, column.getName()))
                        continue;

                    if(recordsToRemove.contains(i)){
                        continue;
                    }

                    System.out.print(column.getRec(i).getLastEntry().getData() + "\t");
                }

                System.out.println();
            }

        }
        else{
            System.out.println("Unexpected scenario occurred");
            System.exit(2);
        }



        return false;
    }

    private boolean predicate(ArrayList<String> conditions, String name, String value){
        return predicate(conditions, name, value, true);
    }

    private boolean predicate(ArrayList<String> conditions, String name, String value, boolean defaults){

        for(String condition : conditions){
            String[] split = condition.split(" ");
            String term = split[0];
            String operator = split[1];
            String requirement = split[2];

            // This is the column that we want to compare
            if(term.equals(name)){

                if(operator.equals("=")){
                    return requirement.equals(value);
                }
                // Must be integers or numbers
                else if(operator.equals(">")){
                    int a = Integer.parseInt(value);
                    int b = Integer.parseInt(requirement);

                    return a > b;
                }
                else if(operator.equals("<")){

                    int a = Integer.parseInt(value);
                    int b = Integer.parseInt(requirement);

                    return a < b;

                }
                else if(operator.equals("!=")){

                    return !requirement.equals(value);
                }
                else{
                    System.out.println("Relation.predicate: Unexpected scenario occurred");
                    System.exit(2);
                }

            }

        }

        return defaults;
    }

    private boolean contains(ArrayList<String> list, String term){
        for(String str : list){
            if (str.equals(term)){
                return true;
            }
        }

        return false;
    }

    public void wUpdate(String param, String value, ArrayList<String> conditions){

        ArrayList<Col> tempColumns = new ArrayList<>(columns);
        HashSet<Integer> recordsToUpdate = new HashSet<>();
        int numOfRecords = columns.get(0).size();

        // Finds out which records need to be updated
        for (int i = 0; i < numOfRecords; i++) {
            for (Col column : tempColumns) {
                if (predicate(conditions, column.getName(), column.getRec(i).getLastEntry().getData(), false)) {
                    recordsToUpdate.add(i);
                }
            }
        }

        // Updates records
        for(int i = 0; i < numOfRecords; i++){

            for(Col column : tempColumns){

                if(recordsToUpdate.contains(i) && column.getName().equals(param)) {

                    // Update here
                    column.getRec(i).addEntry(value);

                }
            }

            System.out.println();
        }
    }

    public boolean wSelect(ArrayList<String> params, ArrayList<String> conditions){

        if(params.size() == 0 && conditions.size() == 0){

            // Get header data from columns
            for(Col column : columns){
                System.out.print(column.getName() + "\t");
            }

            System.out.println();
            int numOfRecords = columns.get(0).size();

            for(int i = 0; i < numOfRecords; i++){
                for(Col column : columns){

                    ArrayList<Entry> entries = column.getRec(i).getAllEntries();

                    for(Entry entry : entries){
                        System.out.print(entry.getData() + "\t" + entry.getTimeStamp() + "\t");
                    }
                }

                System.out.println();
            }

        }
        else if(params.size() > 0 && conditions.size() == 0){

            // Get header data from columns
            for(Col column : columns){

                if(!contains(params, column.getName()))
                    continue;

                System.out.print(column.getName() + "\t");
            }

            System.out.println();
            int numOfRecords = columns.get(0).size();

            for(int i = 0; i < numOfRecords; i++){
                for(Col column : columns){

                    if(!contains(params, column.getName()))
                        continue;

                    ArrayList<Entry> entries = column.getRec(i).getAllEntries();

                    for(Entry entry : entries){
                        System.out.print(entry.getData() + "\t" + entry.getTimeStamp() + "\t");
                    }
                }

                System.out.println();
            }

        }
        else if(params.size() == 0 && conditions.size() > 0){

            ArrayList<Col> tempColumns = new ArrayList<>(columns);
            HashSet<Integer> recordsToRemove = new HashSet<>();
            int numOfRecords = columns.get(0).size();

            for (int i = 0; i < numOfRecords; i++) {
                for (Col column : tempColumns) {
                    if (!predicate(conditions, column.getName(), column.getRec(i).getLastEntry().getData())) {
                        recordsToRemove.add(i);
                    }
                }
            }

            // Get header data from columns
            for(Col column : tempColumns){

                System.out.print(column.getName() + "\t");
            }

            System.out.println();

            for(int i = 0; i < numOfRecords; i++){

                for(Col column : tempColumns){

                    if(recordsToRemove.contains(i)){
                        continue;
                    }

                    System.out.print(column.getRec(i).getLastEntry().getData() + "\t");
                }

                System.out.println();
            }

        }
        else if(params.size() > 0 && conditions.size() > 0){

            ArrayList<Col> tempColumns = new ArrayList<>(columns);
            HashSet<Integer> recordsToRemove = new HashSet<>();
            int numOfRecords = columns.get(0).size();

            for (int i = 0; i < numOfRecords; i++) {
                for (Col column : tempColumns) {
                    if (!predicate(conditions, column.getName(), column.getRec(i).getLastEntry().getData())) {
                        recordsToRemove.add(i);
                    }
                }
            }

            // Get header data from columns
            for(Col column : tempColumns){

                if(!contains(params, column.getName()))
                    continue;

                System.out.print(column.getName() + "\t");
            }

            System.out.println();

            for(int i = 0; i < numOfRecords; i++){

                for(Col column : tempColumns){

                    if(!contains(params, column.getName()))
                        continue;

                    if(recordsToRemove.contains(i)){
                        continue;
                    }

                    System.out.print(column.getRec(i).getLastEntry().getData() + "\t");
                }

                System.out.println();
            }

        }
        else{
            System.out.println("Unexpected scenario occurred");
            System.exit(2);
        }


        return false;
    }

    public int getColumnSize(){
        return columns.size();
    }

    public int getRecordSize(){
        // Returns the number of records in column 0
        return columns.get(0).size();
    }

}
