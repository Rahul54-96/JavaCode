package assignments;

import java.util.Scanner;

public class A16_MarksValidation {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Marks : ");
		int marks = s1.nextInt();		
		
		if(marks>=35)
			{
			if(marks>=75)
			{
				System.out.println("Distinction");
			}
			else if(marks< 75 && marks>=60)
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


	