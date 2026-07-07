package assignments;

import java.util.*;

public class A66_StringAnagram 
{
    static String normalize(String s) {
       
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        char[] arr = cleaned.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        boolean anagram = normalize(s1).equals(normalize(s2));
        System.out.println("Are anagrams? " + anagram);

        sc.close();
    }
}