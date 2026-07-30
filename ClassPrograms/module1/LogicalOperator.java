package module1;
public class LogicalOperator 
{
	public static void main(String[] args) 
	{
		int age=45;
		char gender='M';
		
		if(age>=18 && gender=='M')
		{
			System.out.println("Statement 1");
		}
		if(age>=18 && gender=='F')
		{
			System.out.println("Statement 2");
		}
		if(!(age>=18 && gender=='M'))
		{
			System.out.println("Statement 3");
		}
		/*	if(true && true)
		{
			System.out.println("Statement 3");
		}
		*/
	}
}
