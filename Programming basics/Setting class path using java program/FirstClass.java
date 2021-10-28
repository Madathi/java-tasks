package Aclass;
import java.net.MalformedURLException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Method;
import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
public class FirstClass
{
  public static void main(String args[])
  {
    URL url;
    try{
       url=new URL("file:///E:/java tasks/Two class");
       URLClassLoader ucl=new URLClassLoader(new URL[]{url});
       Class<?> beanClass = ucl.loadClass("Bclass.SecondClass");
       Constructor<?> constructor = beanClass.getConstructor();
        Object beanObj = constructor.newInstance();
         Method method = beanClass.getMethod("get");
        method.invoke(beanObj);
        
      }
     catch(MalformedURLException e)
     { 
        e.printStackTrace();
      
     }
     catch(ClassNotFoundException e)
     {
         e.printStackTrace();

      }
      catch(InstantiationException e)
      {
        e.printStackTrace();
      }
      catch (IllegalAccessException e)
      {
         e.printStackTrace();
      }
      catch(NoSuchMethodException e)
      {e.printStackTrace();}
      catch(InvocationTargetException e)
      {e.printStackTrace();}

  }
}