package assignments;

import java.util.Scanner;

public class A14_LoginValidation {

	public static void main(String[] args) 
	{
		String CorrectUname = "Rahul";
		String CorrectPass = "Khilare123";
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter username : ");
		String username = s1.nextLine();
		System.out.println("Enter password : ");
		String password = s1.nextLine();
				
		if(username.equals(CorrectUname))
		{
		if (password.equals(CorrectPass))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Incorrect Password");
		}
		}
		else
		{
			System.out.println("Incorrect Username");
		}
	}
}
