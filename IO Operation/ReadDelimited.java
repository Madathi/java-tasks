import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;
public class ReadDelimited
{
  static FileOutputStream fop=null;
  public static void main(String[] args)
  {
      String srcDir="D:/class/";
      File folder=new File(srcDir);
      File[] listOfFiles =folder.listFiles(); 
      Scanner sc=null;
      try
      { 
         for(int i=0;i<listOfFiles.length;i++)
         {
           System.out.println(listOfFiles[i].getName());
           sc=new Scanner(new File(listOfFiles[i].getAbsolutePath()));
                while(sc.hasNextLine())
                {
                    String str=sc.nextLine();
                    String filename=listOfFiles[i].getName();
                    parseData(str,filename.replaceFirst("[.][^.]+$", ""));
                }
         }

       }
       catch(IOException e)
       {
        e.printStackTrace(); 
       }
       finally
       {
         if(sc!=null)
          {
              sc.close();
           }
      }
       
  }
  public static void parseData(String str,String i)
   {
      try{
       File file=new File("D:/class.csv");
       if(file.exists())
           file.delete();
       file.createNewFile();
       fop=new FileOutputStream(file,true);
       String Rollno,name,phone;
       int age;
       Scanner lineScanner=new Scanner(str);
       lineScanner.useDelimiter("###");
       while(lineScanner.hasNext())
       {
           Rollno=lineScanner.next();
           name=lineScanner.next();
           age=Integer.parseInt(lineScanner.next()); 
           phone=lineScanner.next();
           if(age>=10)
           {
              String s=name+"###"+age+"###"+phone+"###"+i+"\n";
              byte[] list = s.getBytes();
              fop.write(list);
            }
       }
       lineScanner.close();
     }
     catch(IOException e)
     {
       e.printStackTrace(); 
     }
   }
 
}
 
           
