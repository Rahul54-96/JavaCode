package assignments;

import java.util.Scanner;

public class A52_ReverseString 
{
    public static String reverse(String str) 
    {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) 
    {
    	Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s1.nextLine();
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverse(str));
    }
}