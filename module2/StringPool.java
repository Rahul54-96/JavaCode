package module2;
public class StringPool 
{
	public static void main(String[] args) 
	{
		String a="Automation";//String pool area
		String a1=new String("Automation");//Heap Memory
		
		System.out.println(a.equals(a1));
		
		System.out.println(a==a1);
		String b="Automation";//String pool area

System.out.println(a.equals(b));
		
		System.out.println(a==b);
		
	}
}
