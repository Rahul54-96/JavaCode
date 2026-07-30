package module2;//100% abstarction
abstract class Z2      //abstarct class
{
	abstract void method1();//abstract Method
	abstract void method2();//abstract Method
	
}
public class Z1 extends Z2
{
	void method1()
	{
		System.out.println("Actual Logic 1 will be here");
	}
	void method2()
	{
		System.out.println("Actual Logic 2 will be here");
	}
	public static void main(String[] args) 
	{
		
	}
}
