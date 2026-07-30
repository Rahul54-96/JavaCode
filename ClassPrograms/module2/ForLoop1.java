package module2;
public class ForLoop1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
}
