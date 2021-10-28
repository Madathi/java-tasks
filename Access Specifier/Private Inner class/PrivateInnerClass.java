package Private.Innerclass;
class FirstClass
{
  private class SecondClass
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
   public void createInstance()
   {
     SecondClass obj1=new SecondClass();
     obj1.setvalue(10);
     System.out.println("The value is "+obj1.getValue());
   }
 }
public class PrivateInnerClass
{
  public static void main(String[] args)
  {
     FirstClass obj = new FirstClass(); 
     obj.createInstance();
  }
}