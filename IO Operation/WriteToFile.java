import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteToFile
{
  public static void main(String[] args) throws IOException
  {
     FileOutputStream fop=null;
     File file;
     String str="Java is a programming language";
     try
     {
        file = new File("D:/java.txt");
        fop=new FileOutputStream(file);
        if(!file.exists())
            file.createNewFile();
        byte[] content=str.getBytes();
        //System.out.println(content);
        fop.write(content);
    }
     catch(IOException e)  
     {
           e.printStackTrace();  
     }
      finally
       {
          if(fop!=null)  
            {
              fop.flush();
              fop.close();
          }
        }
     }
}
     
      