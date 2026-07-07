package module2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetProperty2 
{
	public static void main(String[] args) 
	{
		
		Set<Character> s1=new HashSet<Character>();
		s1.add('J');
		s1.add('A');
		s1.add('P');
		s1.add('Y');
		s1.add('F');
		s1.add('B');
		s1.add('U');
		System.out.println(s1);
		/*
		 * hashcode value
		 * No DUplicates
		 * NO indexing
		 * No Order of insertion
		 * Iterator-true
		 * ListIterator-No
		 * ENumeration-false
		 * Dynamic-true
		 * hetrogenious-true
		 * null-true[only 1]
		 */
		Set<Character> s2=new HashSet<Character>();
		s2.add('Z');
		s2.add('X');
		s2.add('M');
		s2.add('K');
		s2.add('Q');
		s2.add('O');
		s2.add('I');
		s2.add('U');
		System.out.println(s2);
		boolean b1=	s1.equals(s2);
		System.out.println(b1);
		s1.addAll(s2);
		System.out.println(s1);
		
		/*
		 * apple
		 * apple
		 */
	}
}
