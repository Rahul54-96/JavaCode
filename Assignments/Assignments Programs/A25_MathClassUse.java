package assignments;

import java.util.Scanner;

public class A25_MathClassUse {
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the first Number : ");
		int a = s1.nextInt();
		System.out.println("Enter the second Number : ");
		int b = s1.nextInt();
		System.out.println("Square root of "+a+" is -> "+Math.sqrt(a));
		System.out.println("Minimun number between "+a+" and "+b+" is -> "+Math.max(a, b));
		System.out.println("Maximum number between "+a+" and "+b+" is -> "+Math.min(a, b));
		System.out.println("Multiplication of number "+a+" and "+b+" is -> "+(a*b));
		System.out.println("Division of number "+a+" and "+b+" is -> "+(a/b));
		System.out.println("Subtraction of number between "+a+" and "+b+" is -> "+(a-b));
		System.out.println("absolute value of "+a+" is -> "+Math.abs(a));
		s1.close();
		
	}
}
