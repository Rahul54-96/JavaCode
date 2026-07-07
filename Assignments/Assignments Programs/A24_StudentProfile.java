package assignments;

import java.util.Scanner;

public class A24_StudentProfile {
	
	int TotalMarks(int Sub1,int Sub2,int Sub3)
	{
		int total = Sub1+Sub2+Sub3;
		return total;
	}
	int Average(int Sub1,int Sub2,int Sub3)
	{
		int AverageOfSub = (Sub1+Sub2+Sub3)/3;
		return AverageOfSub;
	}
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Name : ");
		String StudentName = s1.next();
		System.out.println("Enter the marks of subject 1 : ");
		int sub1 = s1.nextInt();
		System.out.println("Enter the marks of subject 2 : ");
		int sub2 = s1.nextInt();
		System.out.println("Enter the marks of subject 3 : ");
		int sub3 = s1.nextInt();
		A24_StudentProfile A24= new A24_StudentProfile();
		System.out.println("Total marks of "+StudentName+" is --> " +A24.TotalMarks(sub1, sub2, sub3));
		System.out.println("Average marks of "+StudentName+" is --> " +A24.Average(sub1, sub2, sub3));
		s1.close();
		
	}
}
