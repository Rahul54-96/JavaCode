package assignments;

import java.util.Scanner;

public class A29_LoopProgram1 {
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the limit : ");
		int limit = s1.nextInt();
		
		System.out.println("Values between 1 to "+limit);
		for(int i=0; i<=limit; i++)
		{
			System.out.print("\t"+i);
		}
		System.out.println("\n Even number between 0 to "+limit);
		for(int i=0;i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.print("\t"+i);
			}
		}
		System.out.println("\n Odd number between 1 to "+limit);
		for(int i=0;i<=limit;i++)
		{
			if(i%2!=0)
			{
				System.out.print("\t"+i);
			}
		}
		int sum=0;
		for(int i=0;i<=limit;i++)
		{
			sum=sum+i;
		}
		System.out.println("\nSum of first "+limit+" numbers ->"+sum);
		int j=0;
		System.out.println("Table of "+limit+" is as below");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(limit+" x "+i+" = "+limit*i);
			j++;
					
		}
		s1.close();
	}
}
