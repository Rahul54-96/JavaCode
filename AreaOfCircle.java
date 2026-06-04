package module1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfCircle  extends Object//pi*r*r
{
	public static void main(String[] args) 
	{
		try {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of radius");
		double r=s1.nextDouble();
		System.out.println("Area of the circle:=>");
		double	area=Math.PI*r*r;
		System.out.println(area);
		s1.close();
		}
		catch(InputMismatchException c1)
		{
			try {
			System.out.println("Hanlded the exception");
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter the value of radius as number only ");
			double r=s1.nextDouble();
			System.out.println("Area of the circle:=>");
			double	area=Math.PI*r*r;
			System.out.println(area);
			s1.close();
			}
			catch(InputMismatchException c2)
			{
				System.out.println("Handled the exception for 2nd time");
			}
		}
		
	}
}
