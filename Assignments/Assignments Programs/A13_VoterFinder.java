package assignments;

import java.util.Scanner;

public class A13_VoterFinder {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your Age : ");
		int age = s1.nextInt();
				
		if (age >= 18 && age >= 60)
		{
			System.out.println("You are senior citizen as your age is "+age+" and you are eligible for voting");
		}
		else if(age >= 18)
		{
			System.out.println("As your age is "+age+", so you are eligible for voting");	
		}
		else
		{
			System.out.println("As your age is "+age+", so you are not eligible for voting");
		}
	}
}
