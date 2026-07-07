package assignments;

import java.util.Scanner;


public class A32_SingleLevelInheritance extends A30_factorialProgram
{
	void display()
	{
		System.out.println("I'm non static method of parent class");
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int limit = s1.nextInt();
		System.out.println("\n Factorial of "+limit+" is:->"+factorial(limit));
		A32_SingleLevelInheritance A32=new A32_SingleLevelInheritance();
		A32.display();
		s1.close();
	}
}
