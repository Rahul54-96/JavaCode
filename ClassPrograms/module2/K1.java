package module2;
class K3
{
	K3(int a,double b,char c)
	{
		this("Manual");
		System.out.println("1");
	}
	K3(String a)
	{
		System.out.println("2");
	}
}
class K2 extends K3
{
	K2(int a,double b)
	{
		super(10,20.98,'X');
		System.out.println("3");
	}
	K2()
	{
		this(100,20.76);
		System.out.println("4");
	}
}
public class K1 extends K2
{
	K1(int a)
	{
		super();
		System.out.println("5");
	}
	K1()
	{
		this(100);
		System.out.println("6");
	}
	public static void main(String[] args) 
	{
		K2 k=	new K1();
	}
}
