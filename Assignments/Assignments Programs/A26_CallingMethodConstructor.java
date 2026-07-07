package assignments;

import java.util.Scanner;

public class A26_CallingMethodConstructor {
	
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
