import java.io.*;
class PrivateClass2
{
  private PrivateClass2(){};
  void msg(){System.out.println("Hello java");}
}
public class Simple2
{
  public static void main(String args[])
  {
    PrivateClass2 obj = new PrivateClass2();
  }
}