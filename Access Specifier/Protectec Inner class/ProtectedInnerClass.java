package Protected.Innerclass;
class FirstClass
{
  protected class SecondClass
  {
      int value;
      protected void setvalue(int x)
      {
            value=x;
       }
       protected int getValue()
       {
          return value;
        }
    }
 }
public class ProtectedInnerClass
{
  public static void main(String[] args)
  {
     FirstClass obj = new FirstClass(); 
     FirstClass.SecondClass obj1=obj.new SecondClass();
     obj1.setvalue(9);
     System.out.println("The value is "+obj1.getValue());
  }
}