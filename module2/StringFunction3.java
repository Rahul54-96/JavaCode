package module2;
public class StringFunction3 
{
	public static void main(String[] args) 
	{
		String a="auto";		
		System.out.println(a.replace('a', 'A'));
		String b="my name is ram";		
		System.out.println(b.replace("ram", "Vishnu"));
		String c="Automation";
		System.out.println(c.replaceAll("[a-z]", ""));
		String d="My Name Is Vaibhav";
		System.out.println(d.replaceAll("[A-Z]", ""));
		System.out.println(d.replaceAll("[a-z]", ""));

		//to check if my string starts with a
		boolean b1=	a.matches("a(.*)");
		System.out.println(b1);
		//to check if my string ends with o
		boolean b2=	a.matches("(.*)o");
		System.out.println(b2);
		//check if my url start with https
		String url="https://www.google.com/gmail";
		boolean b3=	url.matches("https(.*)");
		System.out.println(b3);
		String u1="https://www.amazon.in/cart/smart-wagon?newItems=8081a5a7-6102-4952-a69e-1d5e81af91f0,1&ref_=sw_refresh";
		//check if my URL has Cart in it
		boolean b4=	u1.matches("(.*)cart(.*)");
		System.out.println(b4);
		
		
	}
}
