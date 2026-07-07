package assignments;

import java.util.Scanner;

public class A30_factorialProgram {
	static int factorial(int n)
	{
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
			
		}
		return fact;
		
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int limit = s1.nextInt();
		System.out.println("Factorial of "+limit+" is:->"+factorial(limit));
		s1.close();
	}
}
