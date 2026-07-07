package assignments;

import java.util.Scanner;

public class A23_MethodConstructorOverloading {
	A23_MethodConstructorOverloading(int score)
	{
		if(score >= 0 && score <= 100)
		{
			System.out.println("Valid score");
		}
		else
		{
			System.out.println("Invalid score");
		}
	}
	A23_MethodConstructorOverloading(int score, int passingScore)
	{
		if(score >= 0 && score <= 100 && passingScore >= 35)
		{
			System.out.println("Student is pass");
		}
		else
		{
			System.out.println("Student is fail");
		}	
	}
	A23_MethodConstructorOverloading(int score, int passingScore, boolean isBonus)
	{
		if(score >= passingScore && isBonus == true)
		{
			System.out.println("Student is excellent and eligible for Bonus");
		}
		else
		{
			System.out.println("Student is not eligible for bonus");
		}		
	}
	void display()
	{
		System.out.println("I'm Static and non-parameterized display method");
	}
	void display(int score)
	{
		System.out.println("I'm Static and parameterized display method");
	}
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Score : ");
		int Score = s1.nextInt();
		System.out.println("Enter the Passing Score : ");
		int Passingscore = s1.nextInt();
		System.out.println("Enter the bonus criteria : ");
		boolean Bonus = s1.hasNextBoolean();
		A23_MethodConstructorOverloading A20 = new A23_MethodConstructorOverloading(Score);
		A23_MethodConstructorOverloading A21 = new A23_MethodConstructorOverloading(Score, Passingscore);
		A23_MethodConstructorOverloading A22 = new A23_MethodConstructorOverloading(Score, Passingscore, Bonus);
		A20.display();
		A20.display(Score);
		s1.close();
		
	}
}
