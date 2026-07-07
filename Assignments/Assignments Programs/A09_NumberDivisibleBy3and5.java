package assignments;

import java.util.Scanner;

public class A09_NumberDivisibleBy3and5 {

	public static void main(String[] args) {
		
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = a1.nextInt();
		
		if(number%3==0 && number%5==0)
		{
			System.out.println("Yes, This "+number+" is divisible by 3 and 5");
		}
		else
		{
			System.out.println("No, This "+number+" is not divisible by 3 and 5");
		}
	}

}
