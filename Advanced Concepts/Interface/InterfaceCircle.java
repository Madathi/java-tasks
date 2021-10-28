package interfaceprogram;
import java.io.*;
interface Area
{
  double pi=3.14D;
  void areaofshape(int r);
  default void msg(){System.out.println("Default method can be used in interface");}
  static void show(){System.out.println("Static method can be used in interface");}
}
interface Perimeter
{
  void perimeterofshape(int r);
}
class InterfaceCircle implements Area,Perimeter
{
  public void areaofshape(int r)
 {
   System.out.println("The area of circle "+pi*r*r);
 }
 public void perimeterofshape(int r)
 {
  System.out.println("The perimeter of circle "+2*pi*r);
 }
 public static void main(String args[])
 {
   InterfaceCircle c=new InterfaceCircle();
   c.areaofshape(5);
   c.perimeterofshape(5);
   c.msg();
   Area.show();
  }
}
  