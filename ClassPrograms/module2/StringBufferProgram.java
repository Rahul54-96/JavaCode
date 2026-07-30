package module2;
public class StringBufferProgram 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Automation"); //Mutable
			s1.append("Testing");
			
			System.out.println(s1);
			
			StringBuilder s3=new StringBuilder("Automation");//Mutable
			s3.append("Testing");
			
			System.out.println(s3);	
			
		String s2="Automation";//Immutable
		s2.concat("Testing");
		System.out.println(s2);
	}
}
