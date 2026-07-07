package assignments;


public class A27_VariablesInJava {
	static int PanNo;
	int vehicalNo;
	
	void display()
	{
		int age=0;
		System.out.println("default Value of global static variable is -->\t"+PanNo+",\n Non-static variable is -->\t"+vehicalNo+"\n and local variable -->\t"+age);
		
		PanNo=1234532123;
		vehicalNo=876345678;
		age=56;
		
		System.out.println("After initialization Value of global static variable is -->\t"+PanNo+",\n Non-static variable is -->\t"+vehicalNo+"\n and local variable -->\t"+age);
		
		
	}
	public static void main(String[] args) 
	{
		A27_VariablesInJava A27 = new A27_VariablesInJava();
		A27.display();
		
	}
}
