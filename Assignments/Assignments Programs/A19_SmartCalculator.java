package assignments;

import java.util.Scanner;

public class A19_SmartCalculator {
	static int ans;
	static void calculate(int a, int b)
	{
		ans = a+b;
		System.out.println("Sum of two number is :"+ans);
				
	}
	static void calculate(int a, int b, int c)
	{
		 ans = a+b+c;
		 System.out.println("Sum of three number is :"+ans);
	}

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int a = s1.nextInt();
		System.out.println("Enter the second number : ");
		int b = s1.nextInt();
		System.out.println("Enter the third number: ");
		int c = s1.nextInt();
		
		
		calculate(a,b);
		calculate(a,b,c);
		
	}
}
