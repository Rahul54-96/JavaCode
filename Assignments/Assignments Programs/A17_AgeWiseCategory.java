package assignments;

import java.util.Scanner;

public class A17_AgeWiseCategory {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the marks : ");
		int mark = s1.nextInt();		
		
		if(mark>=35)
		{
			System.out.print("Pass - ");
			if(mark>=75)
			{
				System.out.println("Distinction");
			}
			else if(mark>=60)
			{
				System.out.println("First Class");
			}
			else
			{
				System.out.println("Second Class");
			}
			
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
