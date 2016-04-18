package struc;

import java.io.*;
import java.util.*;
import java.text.*;

public class DebugHandler {

    public static void appendln(String filename, String textVal){
        append(filename, textVal + '\n');
    }

    public static void append(String filename, String textVal) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(filename , true));
            out.write(timeStamp + " : " + textVal);
            out.close();
        }
        catch(IOException e) {
            System.out.println("exception in write " + e);
        }
    }
}