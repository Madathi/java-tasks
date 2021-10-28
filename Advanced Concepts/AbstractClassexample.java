package abstractprogram;
abstract class Bank
{
   int simple_interest;
   public Bank()
   {
     System.out.println("Constructor for abstract class created");
   }
   abstract int simpleinterest(int principal,int number);
}
class SBI extends Bank
{
  public SBI()
  {
    System.out.println("SBI Constructor created");
   }
  int simpleinterest(int principal,int number)
  {
    simple_interest=(principal*8*number)/100;
    return simple_interest;
  }
}
class Canara extends Bank
{
  public Canara()
  {
    System.out.println("Canara Constructor created");
  }
  int simpleinterest(int principal,int number)
  {
    simple_interest=(principal*9*number)/100;
    return simple_interest;
  }
}
public class AbstractClassexample
{ 
  public static void main(String args[])
  {
    Bank sbi=new SBI();
    System.out.println("S.I for SBI "+sbi.simpleinterest(10000,5));
    Bank can=new Canara();
    System.out.println("S.I for Canara "+can.simpleinterest(10000,5));
  }
}

  