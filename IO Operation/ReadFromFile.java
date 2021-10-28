import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadFromFile
{
  public static void main(String[] args) throws IOException
  {
     FileInputStream fin=null;
     int i=0;
     try
     {
        fin=new FileInputStream("D:/java.txt");
        while((i=fin.read())!=-1)
        {
           System.out.println((char)i);
        }
    }
     catch(IOException e)  
     {
           e.printStackTrace();  
     }
      finally
       {
          if(fin!=null)  
            {
              fin.close();
          }
        }
     }
}
     
      