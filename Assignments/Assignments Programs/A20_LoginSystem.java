package assignments;

import java.util.Scanner;

public class A20_LoginSystem {
	A20_LoginSystem(String email)
	{
		if(email.contains("gmail.com"))
		{
			System.out.println("Valid Email ID");
		}
		else
		{
			System.out.println("Invalid Email ID");
		}
	}
	A20_LoginSystem(String email, String password)
	{
		if(email.contains("gmail.com") && password.length()>=6)
		{
			System.out.println("Valid Email ID and Password");
		}
		else
		{
			System.out.println("Invalid Email ID and Password");
		}	
	}
	A20_LoginSystem(String email, String password, String OTP)
	{
		if(email.contains("gmail.com") && password.length()>6 && OTP.length()>4)
		{
			System.out.println("Valid credentials");
		}
		else
		{
			System.out.println("Invalid credentials");
		}		
	}
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Email ID : ");
		String emailID = s1.next();
		System.out.println("Enter the Password : ");
		String Password1 = s1.next();
		System.out.println("Enter the OTP : ");
		String OTP_No = s1.next();
		A20_LoginSystem A20 = new A20_LoginSystem(emailID);
		A20_LoginSystem A21 = new A20_LoginSystem(emailID, Password1);
		A20_LoginSystem A22 = new A20_LoginSystem(emailID, Password1, OTP_No);
		
		s1.close();
		
	}
}
