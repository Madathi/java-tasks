import java.util.Scanner;
import java.io.*;
class Simple
{
  private final int a=18;
  private void agevote(int age)
  {
     if(age>18)
     {
       System.out.println("Eligible for voiting");
     }
     else
     {
        System.out.println("Not Eligible for voiting");
     }
  }

  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int yourage=sc.nextInt();
     Simple obj = new Simple();
     System.out.println("Eligibe age is above "+obj.a);
     obj.agevote(yourage);
   }
}
