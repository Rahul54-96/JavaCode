package module2;//100% abstarction
abstract class ParentAbstractClass      //abstarct class
{
	abstract void method1();//abstract Method
	
}
public class ChildClass1 extends ParentAbstractClass
{
	void method1()
	{
		System.out.println("Actual Logic will be here");
	}
	public static void main(String[] args) 
	{
		
	}
}
