package moduke3;

import java.util.Scanner;

public class SIBIIBProgram2 
{
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	SIBIIBProgram2()
	{
		System.out.println("Constrcutor 1");
	}
	SIBIIBProgram2(int a)
	{
		System.out.println("Constrcutor 2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new SIBIIBProgram2();
		new SIBIIBProgram2(100);
		new SIBIIBProgram2(100);

	}
}
