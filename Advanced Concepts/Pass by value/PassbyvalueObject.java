package passbyvalue.object;
import java.io.*;
import java.util.Scanner;
class Test
{
   int x;
   public Test(int x) 
   {
    this.x=x;
   }
   public Test()
   {
     x=5;
   }
 }
public class PassbyvalueObject
{ 
  public static void main(String[] args)
  {
      Test t= new Test(5);
      change2(t);
      System.out.println("Value of x is "+t.x);
      change1(t);
      System.out.println("Value of x is "+t.x);

    }
   public static void change2(Test t)
   {
      t.x=10;
   }
   public static void change1(Test t)
   {
       t=new Test();
       t.x=15;
   }
       
}
    
     