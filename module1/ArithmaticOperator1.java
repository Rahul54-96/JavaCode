package module1;
public class ArithmaticOperator1 
{
	static void add() //house 1
	{
		int a=100;
		int b=50;
		int c=	a+b;
		System.out.println(c);
	}
	static void sub() //house 2
	{
		int a=100;
		int b=50;
		int c=	a-b;
		System.out.println(c);
	}
	static void mul()
	{
		int a=100;
		int b=50;
		int c=	a*b;
		System.out.println(c);
	}
	static void div()
	{
		int a=100;
		int b=50;
		int c=	a/b;//
		System.out.println(c);
	}
	static void mod()
	{
		int a=109;
		int b=50;
		int c=	a%b;//reminder
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println("Lets start callig methods");
		add();
		sub();
		mul();
		div();
		mod();
	} 
	
}
