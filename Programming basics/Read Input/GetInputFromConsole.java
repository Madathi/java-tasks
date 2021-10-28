import java.io.Console;
class GetInputFromConsole
{
  public static void main(String args[])
  {
    String str=System.console().readLine();
    System.out.println("The string entered is "+str);
    char[] pass=System.console().readPassword();
    System.out.println("The password entered is "+pass);
  }
}
