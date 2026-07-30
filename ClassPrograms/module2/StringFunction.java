package module2;
public class StringFunction 
{
	public static void main(String[] args) 
	{
		String a="Automation";
		//String is Immutable
		System.out.println(a.concat("Testing"));
		System.out.println(a);
		String b=	a.concat("SDET Testing");
		System.out.println(b);
	}
}
