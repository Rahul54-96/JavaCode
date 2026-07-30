package module2;
public class H1 
{
	public static int a=100;
	protected static int b=40;
	 static int c=10;
	private static int d=5;

	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		System.out.println(d);
		H2.add();
		H2.mul();
		H2.sub();
		System.out.println(H2.a);
		System.out.println(H2.b);
		System.out.println(H2.c);

		

	}
}
