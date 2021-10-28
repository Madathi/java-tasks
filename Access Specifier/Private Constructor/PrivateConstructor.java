
import java.io.*;

class MySingleton
{
	static MySingleton instance = null;
	public int x = 10;
	private MySingleton() { 
	static public MySingleton getInstance()
	{
		if (instance == null)		
			instance = new MySingleton();

		return instance;
	}
}


public class PrivateConstructor
{
public static void main(String args[])	
{
	MySingleton a = MySingleton.getInstance();
	MySingleton b = MySingleton.getInstance();
	a.x = a.x + 10;
	System.out.println("Value of a.x = " + a.x);
	System.out.println("Value of b.x = " + b.x);
}	
}
