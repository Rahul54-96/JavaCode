package module1;
public class GlobalVariable 
{
	static int NOofdaysinYear=365;//global variable
	int z=456;//global variable-Instance Variable
	public static void main(String[] args) 
	{
		NOofdaysinYear=366;
		//this is how you can update the global variable value
		System.out.println(NOofdaysinYear);
		GlobalVariable g1=new GlobalVariable();
		System.out.println(g1.z=457);

	}
}
