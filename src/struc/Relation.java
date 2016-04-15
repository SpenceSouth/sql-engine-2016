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

    public void insert(Col record){
        columns.add(record);
    }

    public boolean update(Col record){

        return false;
    }

    public boolean delete(Col record){

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
                    if (!predicate(conditions, column.getName(), column.getRec(i).getLastEntry().getData(), column.getType())) {
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
                    if (!predicate(conditions, column.getName(), column.getRec(i).getLastEntry().getData(), column.getType())) {
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

    private boolean predicate(ArrayList<String> conditions, String name, String value, String type){

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

        return true;
    }

    private boolean contains(ArrayList<String> list, String term){
        for(String str : list){
            if (str.equals(term)){
                return true;
            }
        }

        return false;
    }

    public boolean wUpdate(Col record){

        return false;
    }

    public boolean wSelect(Col record){

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
