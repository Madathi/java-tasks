package interfaceandabstract;
import java.io.*;
interface Shape
{
   void draw();
   void area();
}
abstract class Draw implements Shape
{
 String name;
  public Draw(String name)
  {
    this.name=name;
  }
  public void draw()
  {
    System.out.println("The shape "+name+" is drawn");
  }
}
class Rectangle extends Draw
{
  int l,b;
  public Rectangle(String name,int length,int breadth)
  {
    super(name);
    l=length;
    b=breadth;
  }
  public void area()
  {
     System.out.println("The area of reactangle is"+(l*b));
  }
}
class Circle extends Draw
{
  int radius;
  public Circle(String name,int r)
  {
    super(name);  
    radius=r;
   }
   public void area()
   {
     System.out.println("The area of circle is"+(3.14*radius*radius));
   }
 }
public class InterfaceAbstract 
{
   public static void main(String args[])
   {
     Shape rect=new Rectangle("Rectangle",3,4);
     rect.draw();
     rect.area();
     Shape c=new Circle("Circle",5);
    c.draw();
    c.area(); 
   }
 }
    
    
