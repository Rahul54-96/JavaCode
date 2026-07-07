package module2;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;
public class VectorClassProgram 
{
	public static void main(String[] args) 
	{
		Vector<String> v1=new Vector<String>();
		
		v1.add("Sam");	
		v1.add("Bheem");	
		v1.add("Priya");	
		v1.add("Adnan");
		v1.add("Nisha");
		System.out.println(v1);
		
		Enumeration<String> e1=	v1.elements();
		while(e1.hasMoreElements())
		{
			//hasmoreelement and nextElement
			System.out.println(e1.nextElement());
		}
		v1.iterator();
		
		v1.listIterator();
		
		
		ListIterator<String> v2=	v1.listIterator();
	}
}
