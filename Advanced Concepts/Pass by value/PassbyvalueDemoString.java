package passbyvalue.Strings;
import java.io.*;
import java.util.Scanner;
public class PassbyvalueDemoString
{ 
  public static void main(String[] args)
  {
     Scanner sc =new Scanner(System.in);
     String s=new String();
     s=sc.nextLine(); 
     System.out.println("Before changing string :"+s);
     changestring(s);
     System.out.println("After changing string :"+s); 
    }
    public static void changestring(String s)
    {
       s+=" world";
       System.out.println("In change method String is "+s); 
    }
       
}
    
     