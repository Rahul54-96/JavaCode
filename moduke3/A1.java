package moduke3;
class C1
{
	
}
class B1 extends C1
{
	
}
public class A1 extends B1
{
	public static void main(String[] args) 
	{
		B1 b1=		new A1();//Upcasting Implcitely
		//B1=Yes
		//A1:No
		//C1:Yes
		//Object:Yes
		
	A1 a1=	(A1)b1;//Downcasting explicitely
	//B1=Yes
			//A1:yes
			//C1:Yes
			//Object:Yes
		
		
		
	}
}
