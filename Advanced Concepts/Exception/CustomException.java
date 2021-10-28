package Exception.Customexception;
import java.io.*;
import java.util.Scanner;
class ValidAgeException extends Exception
{
   public ValidAgeException(String str)
   {
     super(str);
   }
}
public class CustomException
{
  public static void main(String args[])
  {
     try
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age<18) 
            throw new ValidAgeException("Not valid for voting");
        else
          System.out.println("Valid for voting");
      }
      catch(ValidAgeException va)
      { 
          System.out.println(va.getMessage());
       }
   }
}
        