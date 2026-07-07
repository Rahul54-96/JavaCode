package assignments;

import java.util.Scanner;

public class A61_StudentDataRuntime 
{
    public static void main(String[] args) 
    {
    	Scanner s1 = new Scanner(System.in);
    	final int COUNT = 3;
    	for (int i = 1; i <= COUNT; i++) 
    	{
    		System.out.println("Enter name for student " + i + ":");
    	    String name = s1.nextLine();
    	    System.out.println("Enter initial (single char) for student " + i + ":");
    	    String initLine = s1.nextLine();
    	    char initial = (initLine.isEmpty()) ? ' ' : initLine.charAt(0);
    	    System.out.println("Enter roll number for student " + i + ":");
    	    int roll = Integer.parseInt(s1.nextLine());

    	    System.out.println(i + " Student:");
    	    System.out.println("My Name is:->" + name);
    	    System.out.println("My Initial is->" + initial);
    	    System.out.println("My rollNo is ->" + roll);
    	    System.out.println();
    	    
    	}

    	s1.close();

    }
}