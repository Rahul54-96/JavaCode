package assignments;

import java.util.Scanner;

public class A18_LoginValidation {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Username : ");
		String username = s1.next();
		System.out.println("Enter the Password : ");
		String password = s1.next();
		if(username.equals("Rahul"))
		{
			if(password.equals("TestPass"))
			{
				System.out.println("Enter the Role (Admin / User / Other): ");
				String role = s1.next();
				if(role.equals("Admin"))
				{
					System.out.println("Full Access");
				}
				else if(role.equals("User"))
				{
					System.out.println("Limited Access");
				}
				else
				{
					System.out.println("Guest Access");
				}
			}
			else
			{
				System.out.println("Wrong password");
			}
		}
		else
			{
				System.out.println("Invalid username");
			}
	}
}
