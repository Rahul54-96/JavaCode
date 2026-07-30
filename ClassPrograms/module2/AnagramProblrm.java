package module2;
import java.util.InputMismatchException;
import java.util.Arrays;

public class AnagramProblrm 
{
	public static void main(String[] args) 
	{
		String s1="north";
		String s2="thorn";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("They cannot be anagram");
		}
		else
		{
		
		//step 1
		char [] c1=	s1.toCharArray();
		char [] c2=	s2.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		//step 2
		
		Arrays.sort(c1);
		Arrays.sort(c2);

		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		//step 3
	
		if(Arrays.equals(c1,c2)==true)
		{
			System.out.println("The given 2 STrings are Anagram");
		}
		else
		{
			System.out.println("The given 2 STrings are NOT Anagram");
		}
		}
	}
}
