package struc;

import java.util.ArrayList;

/**
 * Created by spencesouthard on 4/11/16.
 */
public class Rec {

    //Dec
    private ArrayList<Entry> entries = new ArrayList<>();

    public Rec(){

    }

    public Rec(String data){
        addEntry(new Entry(data));
    }

    public Rec(String data, String timestamp){
        addEntry(data, timestamp);
    }

    /** To be used for SELECT */
    public Entry getLastEntry(){
        return entries.get(entries.size()-1);
    }

    public void updateLastEntry(String value){
        entries.get(entries.size()-1).setData(value);
    }

    /** To be used for wSELECT */
    public ArrayList<Entry> getAllEntries(){
        return entries;
    }

    private void addEntry(Entry entry){
        entries.add(entry);
    }

    private void addEntry(String data){
        entries.add(new Entry(data));
    }

    private void addEntry(String data, String timestamp){
        entries.add(new Entry(data, timestamp));
    }

    public int size(){
        return entries.size();
    }

}
