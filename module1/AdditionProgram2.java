package module1;
public class AdditionProgram2 
{
	AdditionProgram2()
	{
		System.out.println("This is my constrcutor");
	}
	 void add(int a, int b)//a,b,c Local Variables
	{
		int c=a+b;
		System.out.println(c);
	}
	 void add(int a,double b)//a,b,c Local Variables
	{
		double c=a+b;
		System.out.println(c);
	}
	 void add(double a,double b)//a,b,c Local Variables
	{
		double c=a+b;
		System.out.println(c);
	}
	 void add(double a ,int b)//a,b,c Local Variables
	{
		double c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) //Local Variables
	{
		AdditionProgram2 a1=new AdditionProgram2();//Create an Object
		a1.add(45, 74);// Call by its referance variable
		a1.add(85, 96.6);
		a1.add(85.6, 96.6);
		a1.add(85.1, 96);

	/*
	 * "How to call non static methods:

1. Create an Object

ClassName referanceVaribale=new ClassName();

2. Call by its referance variable
referanceVaribale.nonstaticmethod();"				
	 */

	}
}
