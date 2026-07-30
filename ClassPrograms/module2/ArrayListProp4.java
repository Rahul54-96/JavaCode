package module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProp4 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(40);
		marks.add(null);

		marks.add(null);

		marks.add(404);
		marks.add(74);
		marks.add(90);
		marks.add(10);
		marks.add(1, 63);
		
		Integer i9=	marks.get(0);
		
		Iterator<Integer> i1=	marks.iterator();
		System.out.println("Iteration using Iterator:");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		/*It has abstract methods in it
		 * hasnext-check next element is present or absent
		 * next-Object
		 * remove-remove the object
		 * Only forward Iteration
		 * Iterator is applicav=ble to the entire collection
		 * 
		 */
		
		
		ListIterator<Integer> i2=	marks.listIterator();
		System.out.println("Forward Iteration using List Iterator:");

		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Backword Iteration using List Iterator:");

		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
		/*It has abstract methods in it
		 * hasnext-check next element is present or absent
		 * next-Object
		 * remove-remove the object
		 * hasprevious-check previous element is present or absent
		 * previous-Object
		 * set
		 *  forward as well as Backword Iteration
		 * ListIterator is applicable to the entire List and its classes
		 * 
		 */
	}
}


