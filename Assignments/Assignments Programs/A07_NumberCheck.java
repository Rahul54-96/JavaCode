package assignments;

import java.util.Scanner;

public class A07_NumberCheck {

	public static void main(String[] args) 
	{
		//int number = 123;
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your Number : ");
		int number = s1.nextInt();
				
		if (number > 100)
		{
			System.out.println("Number you entered "+number+" is greater than 100");
		}
		else if (number < 100)
		{
			System.out.println("Number you entered "+number+" is less than 100");
		}
		else
		{
			System.out.println("Number you entered "+number+" is equal to 100");
		}
		

	}

}
