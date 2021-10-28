package pack2;
import pack1.*;
import java.io.*;
class B extends A
{
  public static void main(String args[])
  { 
   // A a1=new A();     	`
    B a=new B();
    a.multiply(3,4);
    a.division(10,5);
  }
}