package assignments;

import java.util.Scanner;

public class A71_StringOperations 
{
    public static int countVowels(String s) 
    {
        int count = 0;
        String lower = s.toLowerCase();
        for (char c : lower.toCharArray())
        {
            if ("aeiou".indexOf(c) >= 0)
            	{
            	count++;
            	}
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = s1.nextLine();
        s1.close();

        String trimmed = sentence.trim();
        String[] words;
        if (trimmed.isEmpty()) 
        {
         words = new String[0];
         
        } 
        else 
        {
         words = trimmed.split("\\s+");
         
        }
        
        for (int i = 0; i < words.length; i++) 
        {
         System.out.println("word[" + i + "] = '" + words[i] + "'");
        }
        System.out.println("Words: ");
        for (String w : words)
        	{
        	System.out.println(w);
        	}

        System.out.println("Word count: " + words.length);

        StringBuilder reversedWords = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) 
        {
            reversedWords.append(words[i]);
            if (i > 0)
            	{
            	reversedWords.append(" ");
            	}
        }
        System.out.println("Reversed words: " + reversedWords.toString());
        System.out.println("Vowel count: " + countVowels(sentence));
    }
}