package module2;
public class StringBufferProgram2 
{
	public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder("Auto"); //Mutable
			s1.append(" Maker");
		//	s1.delete(0, 4);
			System.out.println(s1);
			
			s1.replace(0, 4, "Food");
			System.out.println(s1);
			
			
			s1.insert(4, " Pasta");
			System.out.println(s1);
			
			StringBuilder s2=new StringBuilder("Auto"); //Mutable
			System.out.println(s2.reverse());
			System.out.println(s2.length());

	}
}
