package overriding;
import java.io.*;
class Employee
{
   public final int sal=10000;
   int salary()
   {
       return sal;
   }
}
class Manager extends Employee
{
  int salary()
  {
      return sal+20000;
   }
}
class Clerk extends Employee
{
   int salary()
   {
      return sal+5000; 
   }
}
public class OverridingExample
{
  static void printSalary(Employee e)
  {
     System.out.println("The salary for "+e.getClass().getName()+" is "+e.salary());
  }
   public static void main(String args[])
  {
    Employee obj=new Employee();
    printSalary(obj);
    Employee obj1=new Clerk();
    printSalary(obj1);
    Employee obj2=new Manager();
    printSalary(obj2);
  }
}
