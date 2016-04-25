package struc;

import java.lang.reflect.Array;
import java.util.*;
/**
 * Created by naga on 4/24/16.
 */

public class Formatting{
    private int maxLength;
    Formatting(){
        maxLength = 25;
    }
    public void setMaxLength(int maxLength){
        this.maxLength = maxLength;
    }
    public void checkAndSetMaxLength(ArrayList<Col> columns){
        int max = 0;
        for(Col c : columns){
            if(c.getName().length() > max && c.getName().length() < maxLength){
                max = c.getName().length();
            }
            for(Rec r : c.getRecs()){
                for(Entry de : r.getAllEntries()){
                    if(de.getData().length() > max && de.getData().length() < maxLength){
                        max = de.getData().length();
                    }
                }
            }
        }
        if(max != 0){
            maxLength = max;
        }
    }
    public String colToString(Col data){
        String val = " ";
        val += String.format(" $-"+maxLength+"s% | ", data.getName());
        for(Rec r : data.getRecs()){
            val += recordToString(r)+" | ";
        }
        return val;
    }
    public String recordToString(Rec data){
        ArrayList<Entry> values = data.getAllEntries();
        if(values.get(0).toString() != null)
            return String.format("%s : %1$-"+maxLength+"s ",values.get(0).getTimeStamp(),values.get(0).toString());
        else
            return String.format("%s : %1$-"+maxLength+"s ",values.get(0).getTimeStamp(),"NULL");
    }
    public String tableToStringW(ArrayList<Col> toPrint){
        ArrayList<Col> columns = new ArrayList<Col>();
        columns.addAll(toPrint);
        String val = "";
        String header = "";
        String divider = "";
        for (Col c: columns) {
            header += String.format("%1$-"+(maxLength+31)+"s|",c.getName());
        }
        for(int i = 0; i < ((maxLength+31)*columns.size());i++){
            divider += '-';
        }
        divider += '\n';
        val = divider + header + '\n' + divider;
        //checkAndSetMaxLength(columns);
        ArrayList<String[]> cols = new ArrayList<String[]>();
        int recordCount = columns.get(0).getRecs().size();
        for(Col c: columns) {
            cols.add(colToStringW(c).split("~"));
        }
        for(int i = 0; i < recordCount; i++){
            val += wColtoLine(cols, i) + divider;
        }
        return val;
    }
    private String wColtoLine(ArrayList<String[]> cols, int recordNumber){
        int maxEntries = 0;
        //Find the max # of entries in the row
        for(String[] record : cols){
            if(maxEntries < record[recordNumber].split("\n").length){
                maxEntries = record[recordNumber].split("\n").length;
            }
        }
        //create a row based string
        String[] rows = new String[maxEntries];
        for(int i = 0; i < maxEntries; i++){
            rows[i] = "";
            for(int j = 0; j < cols.size();j++){
                try {
                    rows[i] += cols.get(j)[recordNumber].split("\n")[i] + "|";
                }
                catch(Exception e){
                    rows[i] += String.format("%"+(maxLength+31)+"s","") + '|';
                }
            }
        }
        String output = "";
        for(String row : rows) {
            output += row + '\n';
        }
        return output;
    }
    public String colToStringW(Col data){
        String val = "";
        for(Rec r : data.getRecs()){
            val += recordToStringW(r)+"~";
        }
        return val;
    }
    public String recordToStringW(Rec data){
        ArrayList<Entry> values = data.getAllEntries();
        String val = "";
        Entry first = data.getLastEntry();
        val += String.format("%1$-"+maxLength+"s - ",first.getData());
        val += String.format("%1$-28s\n", first.getTimeStamp());
        for(int i = values.size()-1; i >= 1;i --){
            val += String.format("->%1$-"+(maxLength-2)+"s - ",values.get(i).getData());
            val += String.format("%1$-28s\n",values.get(i).getTimeStamp());
        }
        return val;
    }
}