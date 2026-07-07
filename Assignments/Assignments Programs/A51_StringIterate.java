package assignments;

import java.util.Scanner;

public class A51_StringIterate 
{
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s1.nextLine();

        System.out.println("Characters:");
        for (int i = 0; i < input.length(); i++) 
        {
            System.out.println("char[" + i + "] = " + input.charAt(i));
        }
        s1.close();
    }
}