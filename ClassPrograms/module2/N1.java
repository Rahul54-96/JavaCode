package module2;
/*
 * Multi Level Inheritance:
 * In MLI one sub class inheits the proprty from one super class which again inheits the
 * Property from its super class and so on
 */
class N3
{
	static void method1()
	{
		System.out.println("Fetching the credentails");//.method1().method1();.the passwords are present under excel sheet	
	}
}
class N2 extends N3
{
	static void method2()
	{
		System.out.println("LoginToAMazon");
	}
}
public class N1 extends N2
{
	static void method3()
	{
		System.out.println("Adding the product to cart");
	}
	public static void main(String[] args) 
	{
		method1();
		method2();
		method3();
	}
}
