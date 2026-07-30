package module2;
interface Bb1
{
	void method1();
}
interface Aa1 extends Bb1
{
	void method2();
}
public class NP  implements Aa1
{
	public static void main(String[] args) 
	{
		
	}
	public void method1() 
	{
		System.out.println("Real Logci will be here 1 ");
	}
	public void method2() 
	{
		System.out.println("Real Logci will be here 2");
	}
}
