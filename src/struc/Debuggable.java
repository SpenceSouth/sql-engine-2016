package struc;

import java.io.*;
import java.util.*;
import java.text.*;

public class Debuggable extends Formatting{
  private String filename;
  private boolean DEBUG_ON;
  Debuggable(){
    DEBUG_ON = false;
  }
  public void DebugOn(){
    DEBUG_ON = true;
  }
  public void DebugOff(){
    DEBUG_ON = false;
  }
  public void setFile(String filename){
    this.filename = filename;
  }
  public void appendln(String textVal){
    append(textVal+'\n');
  }
  public void appendln(String filename, String textVal){
    append(filename, textVal+'\n');
  }
  public void append(String textVal){
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter(this.filename , true));
      out.write(timeStamp + " : " + textVal);
      out.close();
    }
    catch (IOException e) {
      if(DEBUG_ON)
        System.out.println("exception in write "+ e);
    }
  } 
  public void append(String filename, String textVal){
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter(filename , true));
      out.write(timeStamp + " : " + textVal);
      out.close();
    }
    catch (IOException e) {
      if(DEBUG_ON)
        System.out.println("exception in write "+ e);
    }
  }
}
