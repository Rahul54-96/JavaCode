package module1;
public class GlobalVariable2 
{
	static int NOofdaysinYear=365;//global variable
	int z=456;//global variable-Instance Variable
	public static void main(String[] args) 
	{
		int a=10;//declaration
		System.out.println(a);//utilization 
		System.out.println(NOofdaysinYear);
		GlobalVariable2 g1=new GlobalVariable2();
		System.out.println(g1.z);

	}
}
