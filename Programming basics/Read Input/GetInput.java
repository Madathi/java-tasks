import java.util.Scanner;
public class GetInput
{
   public static void main(String args[])
   {
     Scanner s =new Scanner(System.in);    
     int n =s.nextInt();
     System.out.println("The number is "+n);
     String str =s.nextLine();
     System.out.println("The String is "+str);
   }
}
     