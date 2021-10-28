package Systemproperties;
import java.util.Properties;
public class SystemProperty
{
  public static void main(String args[])
  {
     Properties p=System.getProperties();
     System.out.println("System property for Operating System");
     System.out.println("Operating System name "+p.getProperty("os.name"));
     System.out.println("Operationg System version "+p.getProperty("os.version"));
     System.out.println("Operating System Architecture "+p.getProperty("os.arch"));
     System.out.println("System property for user");
     System.out.println("User name "+p.getProperty("user.name"));
     System.out.println("User Home "+p.getProperty("user.home"));
     System.out.println("User current working directory "+p.getProperty("user.dir"));
     System.out.println("All properties");
     p.list(System.out);
  }
}