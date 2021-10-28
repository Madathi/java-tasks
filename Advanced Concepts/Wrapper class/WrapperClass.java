package wrapperclass;
import java.io.*;
public class WrapperClass
{
  public static void main(String args[])
  {
    float f=3.14F;
    Float f1=Float.valueOf(f);
    int i=f1.intValue();
    System.out.println("The float to int is "+i);
    double d=f1.doubleValue();
    System.out.println("The float to double is "+d);
    byte b=f1.byteValue();
    System.out.println("The float to byte is "+b);
    short s=f1.shortValue();
    System.out.println("The float to short is "+s);
    long l=f1.longValue();
    System.out.println("The float to long is "+l);
  }
}    