package struc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by spencesouthard on 4/11/16.
 */
public class Entry {

    //Dec
    private String data;
    private String timeStamp;

    public Entry(String data){
        this.timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.data = data;
    }

    public Entry(String data, String timeStamp){
        this.data = data;
        this.timeStamp = timeStamp;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getTimeStamp(){
        return timeStamp;
    }

}
