package module2;

public class ForLoopLoop 
{
	public static void main(String[] args) 
	{
		for(int i=10;i<13;i++)//for every outer loop inner loop will run for given iteration
		{
			for(int j=0;j<5;j++)
			{
				System.out.println(i +" "+j);
			}
		}
	}
}
