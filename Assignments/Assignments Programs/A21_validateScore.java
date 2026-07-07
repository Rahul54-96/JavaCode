package assignments;

import java.util.Scanner;

public class A21_validateScore {
	A21_validateScore(int score)
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
	A21_validateScore(int score, int passingScore)
	{
		if(score >= 0 && score <= 100 && passingScore > 35)
		{
			System.out.println("Student is pass");
		}
		else
		{
			System.out.println("Student is fail");
		}	
	}
	A21_validateScore(int score, int passingScore, boolean isBonus)
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
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Score : ");
		int Score = s1.nextInt();
		System.out.println("Enter the Passing Score : ");
		int Passingscore = s1.nextInt();
		System.out.println("Enter the bonus criteria : ");
		boolean Bonus = s1.hasNextBoolean();
		A21_validateScore A20 = new A21_validateScore(Score);
		A21_validateScore A21 = new A21_validateScore(Score, Passingscore);
		A21_validateScore A22 = new A21_validateScore(Score, Passingscore, Bonus);
		
		s1.close();
		
	}
}
