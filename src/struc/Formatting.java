package struc;

import java.util.*;
import java.text.*;

public abstract class Formatting{
  private int maxLength;
  Formatting(){
    maxLength = 25;
  }
  public void setMaxColumnLength(int maxColLength){
    maxLength = maxColLength;
  }
  public String toString(){
    return "";
  }
  public String toStringW(){
    return "";
  }
}
