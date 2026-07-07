package assignments;

import java.util.Scanner;

public class A22_MarksValidationSwitch {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Marks : ");
		int Marks = s1.nextInt();		
		
		if(Marks >= 0 && Marks <= 100)
			{
			switch (Marks/10) 
			{
			case 1: System.out.println("Fail"); break;
			case 2: System.out.println("Fail"); break;
			case 3: 
				if(Marks >=35)
				{
				System.out.println("Pass"); break;
				}
				else
				{
				System.out.println("Fail"); break;	
				}
			case 4: System.out.println("Second Class pass"); break;
			case 5: System.out.println("Second Class pass"); break;
			case 6:
				if(Marks >=60)
				{
				System.out.println("First Class pass"); break;
				}
				else
				{
				System.out.println("Second Class pass"); break;	
				}
			case 7: 
				if(Marks >=75)
				{
				System.out.println("Distinction pass"); break;
				}
				else
				{
				System.out.println("First Class pass"); break;	
				}
			case 8: System.out.println("Distinction pass"); break;
			case 9: System.out.println("Distinction pass"); break;
			default: System.out.println("Fail");
			}
			}
	}
		
}


	