package properties;
import java.util.*;
public class PropertiesDemo
{
  public static void main(String args[])
  {
        Properties p = new Properties();
     p.setProperty("name","madathi");
     p.setProperty("email","abc@gmail.com");
      // Iterating properties using Enumeration

    @SuppressWarnings("unchecked")
     Enumeration<String> e =(Enumeration<String>)p.propertyNames();
     while(e.hasMoreElements())
     {
       String key=e.nextElement();
       String value=p.getProperty(key);
       System.out.println(key +" = "+value);
     }
     Iterator i=p.keySet().iterator();
     while(i.hasNext())
     {
       String key=(String)i.next();
       String value=p.getProperty(key);
       if(key.equals("email"))
           i.remove();
       System.out.println(key +" = "+value);
     }
     System.out.println(p);
       
  }
}

    