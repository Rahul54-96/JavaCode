package assignments;
class GrandParenttp
{
	int GP;
	void show()
	{
		System.out.println("Show Method of GrandParent class and vlaue of int variable is -> "+GP);
	}
}
class Parenttp extends GrandParenttp
{
	int P;
	void display()
	{
		System.out.println("Show Method of Parent class and vlaue of int variable is -> "+P);
	}
}
public class AA02_ClassTypeCasting extends Parenttp
{
	int childVar;
	void chmethod()
	{
		System.out.println("Show Method of Parent class and vlaue of int variable is -> "+childVar);
	}
	public static void main(String[] args) 
	{
		System.out.println("Calling all child class methods and variables via upcasting");
		Parenttp up = new AA02_ClassTypeCasting();
	    System.out.println("Calling Grand Parent class");
	    up.GP = 10;
	    up.show();
	    System.out.println("Calling Parent class");
	    up.P = 20;
	    up.display();
	    System.out.println("Cannot Call child class method and variable using upcasting");
	    System.out.println("\n \nCalling all child class methods and variables via downcasting");
	    AA02_ClassTypeCasting ch = (AA02_ClassTypeCasting)up;
	    System.out.println("Calling Grand Parent class");
	    ch.GP = 30;
	    ch.show();
	    System.out.println("Calling Parent class");
	    ch.P = 40;
	    ch.display();
	    System.out.println("Calling child class");
	    ch.childVar = 50;
	    ch.chmethod();   
	}
}