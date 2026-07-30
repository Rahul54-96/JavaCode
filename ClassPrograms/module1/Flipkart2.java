package module1;
public class Flipkart2 
{
	Flipkart2()                      //this is my Constructor
	{
		System.out.println("This is my Constructor");
	}
	static void add()
	{
		System.out.println("This is my static Method");
	}
	 void sub()
	{
			System.out.println("This is my non static Method");
	}
	public static void main(String[] args) //main method
	{
		add();//tihs will call my static method
		Flipkart2 f1=new Flipkart2();//this will call my cons
		f1.sub();//this will call my non sttaic
		
	/*	1. Create an Object

		ClassName referanceVaribale=new ClassName();
	*/
				
	}
}
