package passbyvalue.arrays;
import java.io.*;
import java.util.Scanner;
public class PassbyvalueDemoArray
{ 
  public static void main(String[] args)
  {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the size:");
     int size=sc.nextInt();
     int[] arr = new int[size];
     System.out.println("Enter the array elements ");
      for(int i=0;i<size;i++) {  
         arr[i] = sc.nextInt();  
      }  
       System.out.println("Array elements before changing ");
       for(int i=0;i<size;i++)
       {
          System.out.println("arr["+i+"] = "+arr[i]);
        }

       changearray(arr);
       System.out.println("Array elements before changing ");
       for(int i=0;i<size;i++)
       {
          System.out.println("arr["+i+"] = "+arr[i]);
        }
      
    }
    public static void changearray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
           a[i]+=10;
        }
        System.out.println("In changing method the array elements are");
        for(int i=0;i<a.length;i++)
       {
          System.out.println("arr["+i+"] = "+a[i]);
        }
    }
       
}
    
     