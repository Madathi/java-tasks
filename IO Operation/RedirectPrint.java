import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
public class RedirectPrint
{ 
  public static void main(String[] args) throws IOException 
  { 
    File f1,f2;
    FileOutputStream fop1=null;
    FileOutputStream fop2=null;
    try
    { 
      f1=new File("D:/stdout.txt");
      f2=new File("D:/stderr.txt");
      fop1=new FileOutputStream(f1);
      fop2=new FileOutputStream(f2);
      if(!(f1.exists()))
         f1.createNewFile();
      if(!(f2.exists()))
          f2.createNewFile();
      PrintStream p1=new PrintStream(fop1);
      System.setOut(p1);
      System.out.println("This is from java program Redirect from System.out");
      PrintStream p2=new PrintStream(fop2);
      System.setErr(p2);
      System.err.println("Hello Java  Redirect from System.err");
      PrintStream stdout = new PrintStream(new FileOutputStream(FileDescriptor.out));
      System.setOut(stdout);
      System.out.println("Done");
     }
   finally
   {
      if(fop1!=null && fop2!=null)
        fop1.close();fop2.close();
   }
 }
}