package module2;
public class ArithmaticException 
{
	public static void main(String[] args) 
	{
		try {
		int a=1/0;                         //1/0  1 and 0 can come from parent and grandparent class
		System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("handled the exception");
		}	
	}
}
