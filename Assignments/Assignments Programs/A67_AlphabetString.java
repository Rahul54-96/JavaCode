package assignments;

import java.util.Scanner;

public class A67_AlphabetString 
{
    public static void main(String[] args) 
    {
    	Scanner s1 = new Scanner(System.in);
    	System.out.print("Enter a string: ");
    	String str = s1.nextLine();
    	
    	boolean onlyAlpha = str.matches("[A-Za-z]+");
    	System.out.println("Only alphabets? " + onlyAlpha);
    	s1.close();
    	
    }
}