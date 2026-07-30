package module2;
public class StringProgram 
{
	public static void main(String[] args) 
	{
		String name="Ram";//Store String Pool Area
		String name1=new String("Ram");//Heap Memory
		//Anywhere in java whereever u see new keyword->Heap Memory
		boolean b1=	name.equals(name1);
		System.out.println(b1);
	}
}
