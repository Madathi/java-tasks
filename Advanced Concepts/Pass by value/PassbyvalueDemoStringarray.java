package passbyvalue.Stringarray;
import java.io.*;
import java.util.Scanner;
public class PassbyvalueDemoStringarray
{ 
  public static void main(String[] args)
  {
     Scanner sc =new Scanner(System.in);
     String[] array = new String[3];
     for(int i=0;i<3;i++)
     {
        array[i]=sc.nextLine(); 
     }
     System.out.println("Before changing string ");
     for(int i=0;i<3;i++)
     {
        System.out.println("array["+i+"] ="+array[i]);
     }
     changestring(array);
     System.out.println("After changing string"); 
     for(int i=0;i<3;i++)
     {
        System.out.println("array["+i+"] ="+array[i]);
     }
    }
    public static void changestring(String[] array)
    {
      array[0]+=" World";
       for(int i=0;i<3;i++)
     {
        System.out.println("array["+i+"] ="+array[i]);
     }
       
    }
       
}
    
     