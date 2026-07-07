package assignments;

import java.util.Scanner;

public class A12_NumberValidation {

	public static void main(String[] args) 
	{
		//int number = 123;
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your Number : ");
		int number = s1.nextInt();
				
		if (number > 0)
		{
			if (number%2==0)
			{
				System.out.println("Number you entered "+number+" is positive number and it is an Even number");	
			}
			else
			{
				System.out.println("Number you entered "+number+" is positive number and it is a Odd number");
			}
		}
		else if(number < 0)
		{
			if (number%2==0)
			{
				System.out.println("Number you entered "+number+" is negative number and it is an Even number");	
			}
			else
			{
				System.out.println("Number you entered "+number+" is negative number and it is a Odd number");
			}
		}
		else
		{
			System.out.println("Number you entered "+number+" is equal to Zero and it is an Even number");
		}
	}
}
