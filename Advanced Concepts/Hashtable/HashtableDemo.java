package hashtable;
import java.io.*;
import java.util.Hashtable;
class RollNo
{
 int rollno;
 public RollNo(int rollno)
 {
   this.rollno=rollno;
 }
 public int hashcode()
 {
   return rollno;  
  }
  public String toString()
  {
    return rollno+"";
  }
}
public class HashtableDemo
{
  public static void main(String arg[])  
  {
     Hashtable<RollNo,String> h=new Hashtable<>();
     h.put(new RollNo(6),"Ram");
     h.put(new RollNo(9),"Ravi");
     System.out.println(h);
  }
}