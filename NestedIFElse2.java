package module1;

public class NestedIFElse2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 200;
		int c = 30;
		if (a < b) 
		{
			System.out.println("Statement 3");
			if(c==b)
			{
				System.out.println("Statement 5");

			}

		} 
		else if(b!=c)
		{
			System.out.println("Statement 6");
		}
		else 
		{
			System.out.println("Statement 2");
			if(c==30)
			{
				System.out.println("Statement 1");
			}
		}

	}
}
