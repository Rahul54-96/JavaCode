package module1;
public class AdditionProgram 
{
	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static void add(int a,double b)
	{
	double c=a+b;
		System.out.println(c);
	}
	static void add(double a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	static void add(double a ,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		add(74,26);
		add(1.1,90);
		add(1.1,90.9);
		add(1,90.9);
		main(700,36.63);
	}
	public static void main(int a,double b) 
	{
		add(74,26);
		add(1.1,90);
		add(1.1,90.9);
		add(1,90.9);

	}
}
