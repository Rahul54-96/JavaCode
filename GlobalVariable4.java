package module1;
public class GlobalVariable4 
{
	static int NOofdaysinYear=365;//global variable
	public static void main(String[] args) 
	{
	 int NOofdaysinYear=40;//Local variable
	 System.out.println(NOofdaysinYear);
	 System.out.println(GlobalVariable4.NOofdaysinYear);

	}
}
