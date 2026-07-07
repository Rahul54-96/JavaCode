package assignments;

import java.util.Scanner;

public class A10_NumberRangeValidation {

	public static void main(String[] args) {
		Scanner ab1 = new Scanner(System.in);
		System.out.println("Enter number to check is beteen 1-10, 11-20 or above 20 :");
		int number = ab1.nextInt();
		
		if(0<=number && number<=10)
		{
			System.out.println("Entered number "+number+" is in between 0 to 10.");
		}
		else if(11<=number && number<=20)
		{
			System.out.println("Entered number "+number+" is in between 11 to 20.");
		}
		else
		{
			System.out.println("Entered number "+number+" is greater than 20.");
		}

	}

}
