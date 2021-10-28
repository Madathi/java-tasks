package Exception.NullPointerException;
import java.io.*;
public class ExceptionProgram
{
   public static void main(String args[])
   {
      try
      {
          String s=null;
          System.out.println(s.length());
      }
      catch(NullPointerException e)
      {
           e.printStackTrace();
      }
  }
}