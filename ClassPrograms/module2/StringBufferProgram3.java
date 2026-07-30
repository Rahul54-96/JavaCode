package module2;
public class StringBufferProgram3 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Auto"); //Mutable
			s1.append(" Maker");
			s1.replace(0, 4, "Policy");
			
			System.out.println(s1);
			s1.insert(4, " Mobile");
			System.out.println(s1);
			
			StringBuffer s2=new StringBuffer("salesman"); //Mutable
			System.out.println(s2.reverse());
			
			
			StringBuffer s3=new StringBuffer("waterbottle"); //Mutable
			s3.delete(0, 5);
			System.out.println(s3);
			
			
		
	}
}
