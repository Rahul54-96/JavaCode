package module1;
public class Flipkart 
{
	Flipkart(double a)                      //this is my Constructor
	{
		System.out.println("This is my Constructor 3");
	}
	Flipkart(int a)                      //this is my Constructor
	{
		this();//this will call line 13
		System.out.println("This is my Constructor 1");
	}
	Flipkart()                      //this is my Constructor
	{
		this(4.63);///this will call line 13
		System.out.println("This is my Constructor 2");
	}
	public static void main(String[] args) //main method
	{
		
		Flipkart f1=new Flipkart(90);
		
		
	/*	1. Create an Object

		ClassName referanceVaribale=new ClassName();
	*/
				
	}
}
