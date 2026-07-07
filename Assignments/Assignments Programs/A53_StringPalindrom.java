package assignments;

import java.util.Scanner;

public class A53_StringPalindrom 
{
   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to check palindrome: ");
        String str = sc.nextLine();
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(cleaned).reverse().toString();
        System.out.println("Is palindrome? " + cleaned.equals(rev));
        sc.close();
    }
}