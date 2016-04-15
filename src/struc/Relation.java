package struc;

import java.util.ArrayList;

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

            for(int i = 0; i < columns.get(0).size(); i++){
                for(Col column : columns){
                    String name = column.getName();
                    System.out.print(column.getRec(i).getLastEntry().getData() + "\t");
                }

                System.out.println();
            }

        }
        else if(params.size() > 0 && conditions.size() == 0){

        }
        else if(params.size() == 0 && conditions.size() > 0){

        }
        else if(params.size() > 0 && conditions.size() > 0){

        }
        else{
            System.out.println("Unexpected scenario occurred");
            System.exit(2);
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
