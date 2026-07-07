package module2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface7 
{
	public static void main(String[] args) 
	{
	
		Map<Integer,String> m=new HashMap<Integer,String>();//upcasting
		m.put(452, "Anjali");
		m.put(852, "Pooja");
		m.put(900, "Rahul");
		m.put(600, "Rajesh");
		System.out.println(m);
			Set<Integer> keys=	m.keySet();
		Collection<String>	value=m.values();
		Set<Entry<Integer,String>> pair=	m.entrySet();
		System.out.println("Iterating the PAIR of values using Iterator:");
		Iterator<Entry<Integer,String>> c=	pair.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
		
	}
}
