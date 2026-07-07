package module2;

public class ChildClass extends ParentClass
{
	 void method3()
	{
		System.out.println("Method 3");
	}
	public static void main(String[] args) 
	{
		ChildClass c1=new ChildClass();
		c1.method1();
		c1.method2();
		c1.method3();

	}
}
/*

Single Level Inheitance:
In SLI one sub class inheits the property of one super class only
*/