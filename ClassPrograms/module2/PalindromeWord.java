package module2;
public class PalindromeWord 
{
	public static void main(String[] args) 
	{
		String input=	"manish";
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=	input.charAt(i);
			reverse=	reverse+c1;	
		}
		System.out.println("This is your input=>"+input);
		System.out.println("This is your output=>"+reverse);
		boolean b1=input.equals(reverse);
	/*	if(b1==true)
		if(b1)
		if(input.equals(reverse)==true)
		*/
		if(input.equals(reverse))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is Not a Palindrome");
		}
		
	}
}
