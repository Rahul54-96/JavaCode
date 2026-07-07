package module2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetProperty 
{
	public static void main(String[] args) 
	{
		
		Set<Character> s1=new HashSet<Character>();
		s1.add('J');
		s1.add('A');
		s1.add('P');
		s1.add(null);
		s1.add('Y');
		s1.add('F');
		s1.add('B');
		s1.add('U');
		s1.add(null);

		System.out.println(s1);
		/*
		 * hashcode value
		 */

		Iterator<Character> c1=	s1.iterator();
		while(c1.hasNext())
		{
			System.out.println(c1.next());
		}
	}
}
