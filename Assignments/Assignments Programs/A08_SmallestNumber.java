package assignments;

import java.util.Scanner;

public class A08_SmallestNumber {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int firstNum = sc1.nextInt();
		System.out.println("Enter the second number :");
		int secondNum = sc1.nextInt();
		int temp = 0;
		
		if(firstNum < secondNum)
		{
			temp = firstNum;
		}
		else
		{
			temp = secondNum;
		}
		
		System.out.println(temp+" is the Smallest number between "+firstNum+" and "+secondNum);
	}

}
