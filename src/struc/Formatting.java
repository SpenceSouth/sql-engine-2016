package struc;

import java.util.*;
import java.text.*;

public abstract class Formatting{
  int maxLength;
  Formatting(){
    maxLength = 25;
  }
  public void setMaxLength(int maxLength){
    this.maxLength = maxLength;
  }
  public String toString(){
    return "";
  }
  public String toStringW(){
    return "";
  }
}
