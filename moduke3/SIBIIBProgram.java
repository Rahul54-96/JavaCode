package moduke3;
public class SIBIIBProgram 
{
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	SIBIIBProgram()
	{
		System.out.println("Constrcutor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new SIBIIBProgram();
	}
}
