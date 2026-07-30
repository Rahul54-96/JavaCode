package module1;

public class NestedIFElse3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 200;
		int c = 30;
		if (a > b) 
		{
			System.out.println("Statement 3");
			if(c==b)
			{
				System.out.println("Statement 5");

			}

		} 
		else 
		{
			System.out.println("Statement 2");
			if(a>b)
			{
				System.out.println("Statement 1");
			}
		}

	}
}
