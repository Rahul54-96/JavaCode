package assignments;

import java.util.Scanner;

public class A68_EachLetterCounting 
{
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = s1.nextLine();

        int alph = 0, digits = 0, spaces = 0, special = 0;
        
        for (char c : s.toCharArray()) 
        {
            if (Character.isLetter(c))
            	{
            	alph++;
            	}
            else if (Character.isDigit(c))
            	{
            	digits++;
            	}
            else if (Character.isWhitespace(c)) 
            	{
            	spaces++;
            	}
            else
            	{
            	special++;
            	}
        }

        System.out.println("Total no of Alphabets: " + alph);
        System.out.println("Total no of Digits: " + digits);
        System.out.println("Total no of Spaces: " + spaces);
        System.out.println("Total no of Special characters: " + special);

        s1.close();
    }
}