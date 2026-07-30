package module1;
public class Mango 
{
	Mango(int a)
	{
		System.out.println("This will be exported");
	}
	Mango()
	{
		System.out.println("This is Hybrid");
	}
	public static void main(String[] args) 
	{
		new Mango();
		Mango m2=new Mango(200);
		
		
	}
}
