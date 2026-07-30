package module1;

public class NestedIFElse {
	public static void main(String[] args) {
		int a = 10;
		int b = 200;
		int c = 30;
		if (a < b) 
		{
			System.out.println("Statement 1");
			if (b < c) 
			{
				System.out.println("Statement 3");
			} else 
			{
				System.out.println("Statement 4");
			}

		} else {
			System.out.println("Statement 2");

		}

	}
}
