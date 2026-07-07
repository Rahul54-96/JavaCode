package assignments;

import java.util.Scanner;

public class A05_NumberValidation {

	public static void main(String[] args) 
	{
		//int number = 123;
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your Number : ");
		int number = s1.nextInt();
				
		if (number > 0)
		{
			System.out.println("Number you entered "+number+" is positive number");
		}
		else
		{
			System.out.println("Number you entered "+number+" is negative number");
		}
	}

}
