package passbyvalue.primitive;
import java.io.*;
import java.util.Scanner;
public class PassbyvalueDemo
{ 
  public static void main(String[] args)
  {
     Scanner sc =new Scanner(System.in);
     System.out.println("Integer input ");
     int a=sc.nextInt();
     int b=sc.nextInt();
     System.out.println("Before swapping a = "+a+" b = "+b);
     swapInt(a,b);
     System.out.println("After swapping a = "+a+" b = "+b);
     System.out.println("float input ");
     float c=sc.nextFloat();
     float d=sc.nextFloat();
     System.out.println("Before swapping c = "+c+" d = "+d);
     swapFloat(c,d);
     System.out.println("After swapping c = "+c+" d = "+d);
     System.out.println("Character input ");
     char e=sc.next().charAt(0);
     char f=sc.next().charAt(0);
     System.out.println("Before swapping e = "+e+" f = "+f);
     swapChar(e,f);
     System.out.println("After swapping e = "+e+" f = "+f);
    }
    public static void swapInt(int a,int b)
    {
       int temp=a;
       a=b;
       b=temp;  
     }
   public static void swapFloat(float c,float d)
    {
       float temp=c;
       c=d;
       d=temp;  
     }
 public static void swapChar(char e,char f)
    {
       char temp=e;
       e=f;
       f=temp;  
     }
}
    
     