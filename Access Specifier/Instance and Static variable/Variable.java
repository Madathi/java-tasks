import java.io.*;
public class Variable
{
  int variable1;
  static int variable2;
  public static void main(String args[])
  {
    Variable obj=new Variable();
    System.out.println("Instance variable :"+obj.variable1);
    System.out.println("Class variable :"+Variable.variable2);
    Variable obj1 =new Variable();
    obj1.variable1=20;
    obj1.variable2++;
    System.out.println("Instance variable :"+obj1.variable1);
    System.out.println("Class variable :"+Variable.variable2);
  }
}
