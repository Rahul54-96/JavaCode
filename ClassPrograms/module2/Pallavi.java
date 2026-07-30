package module2;
class J3
{
	J3(int a)        //this is cons
 	{
		System.out.println("Constructor 3");
	}
}
class J2 extends J3
{
	J2()      //this is cons
	{
		super(10);
		System.out.println("Constructor 2");
	}
}
public class Pallavi extends J2
{
	Pallavi()       //this is cons
	{
		
		System.out.println("Constructor 1");
	}
	public static void main(String[] args) 
	{
		new Pallavi();
	}
}
