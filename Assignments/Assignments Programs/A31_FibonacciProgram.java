package assignments;

import java.util.Scanner;

public class A31_FibonacciProgram {
	static void fibonacci(int limit)
	{
		int no1=0, no2=1, no3=0;
		for(int i=1; i<=limit; i++)
		{
			System.out.print(no1+"\t");
			
			no3=no1+no2;
			no1=no2;
			no2=no3;
		
		}
		
		
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int limit = s1.nextInt();
		fibonacci(limit);
		s1.close();
	}
}
