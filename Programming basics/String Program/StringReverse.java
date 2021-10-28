import java.io.*;
import java.util.Scanner;
public class StringReverse
{
   public static void main(String args[])
   {
     StringBuffer str=new StringBuffer("");
     Scanner sc=new Scanner(System.in);
     System.out.println("enter string:");
     str.append(sc.nextLine());
     System.out.println("Reversed String :"+str.reverse());
     System.out.println("String after reversal :"+str);
    }
}

     