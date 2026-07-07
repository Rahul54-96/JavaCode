package assignments;

import java.util.Scanner;

public class A11_LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int firstNum = sc1.nextInt();
		System.out.println("Enter the second number :");
		int secondNum = sc1.nextInt();
		int temp = 0;
		
		if(firstNum > secondNum)
		{
			temp = firstNum;
		}
		else
		{
			temp = secondNum;
		}
		if(temp%2==0)
		{
		System.out.println(temp+" is the larget number between "+firstNum+" and "+secondNum+" and it is Even number");
		}
		else
		{
			System.out.println(temp+" is the Largest number between "+firstNum+" and "+secondNum+" and it is Odd number");	
		}
	}
}
