package module1;
public class AdditionProgram1 
{
	static int a=10;
	static int b=5;
	static void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
		int c=a-b;
		System.out.println(c);

	}
	static void mul()
	{
		int c=a*b;
		System.out.println(c);

	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
	}
}
