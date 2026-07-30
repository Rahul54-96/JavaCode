package module2;

public class ThrowingAnException 
{
	public static void main(String[] args) 
	{
		if(1>2)
		{
		throw new NullPointerException();
		}
		else
		{
		throw new ArithmeticException("Infinity Cant be stored in int dattaype");
		}
	}
}
