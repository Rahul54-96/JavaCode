package module2;

import java.util.Scanner;

public class ReverseTheString 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Which String you would like to reverse?");
		String input=	"My name is Ram";
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=	input.charAt(i);
			reverse=	reverse+c1;
			/*i=3,c1=o,reverse=o
			 * i=2,c1=t,reverse=o+t=ot
			 * i=1,c1=u,reverse=ot+u=otu
			 * i=0,c1=a,reverse=otu+a=otua
			 */
		}
		System.out.println("This is your input=>"+input);
		System.out.println("This is your output=>"+reverse);
		s1.close();
		
		
	}
}
