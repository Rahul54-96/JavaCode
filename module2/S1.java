package module2;
class S3    //CC
{
	static void method3()//CM
	{
		System.out.println("Logic 1 as per SLA");
	}
	void method4()//CM
	{
		System.out.println("Logic 2 as per SLA");

	}
}
abstract class S2 extends S3  //AC
{
	abstract void method1();//AM
	abstract void method2();//AM
}
public class S1 extends S2 //CC
{
	public static void main(String[] args)
	{
		
	}

	void method1() 
	{
		System.out.println("Overriding the child class Method-Actual Logic 1");
	}
	void method2() 
	{
		System.out.println("Overriding the child class Method-Actual Logic 2");
	}
}
