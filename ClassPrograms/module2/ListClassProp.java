package module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListClassProp 
{
	public static void main(String[] args) 
	{
		
		List<String> l1=	new ArrayList<String>();
		l1.add("Anjali");
		l1.add("Anamika");
		l1.add("Monica");
		l1.add("Arjun");
		l1.add("Shabnam");
		l1.add("Mukesh");
		l1.add("Mukesh");
		l1.add(null);

		System.out.println(l1);
		/*
		 * Index-True
		 * Order of Insertion:True
		 * Duplicates-true
		 * null-true
		 * Iterator:true
		 * ListIterator-true
		 * Enumeration-false
		 * Hetrogenious-true
		 * Dynamic-true
		 */
		
		
		Iterator<String> i2=	l1.iterator();
		System.out.println("Iterating List using Iterator:");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		ListIterator<String> i3=	l1.listIterator();
		System.out.println("Iterating List using ListIterator ->:");
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
		System.out.println("Iterating List using ListIterator <-");
		while(i3.hasPrevious())
		{
			System.out.println(i3.previous());
		}
	}
}
