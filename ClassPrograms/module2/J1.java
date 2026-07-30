package module2;
abstract class J5          //ABstarction:50%
{
	abstract void a();
	void notification()
	{
		System.out.println("Real logic Code Getting exposed");
	}
	void b()
	{
		System.out.println("Real logic Code Getting exposed");
	}
}
public class J1 extends J5
{
	
	public static void main(String[] args) 
	{
		
	}

	void a() 
	{
		System.out.println("Real logic is getting  hidden here");
	}
}
