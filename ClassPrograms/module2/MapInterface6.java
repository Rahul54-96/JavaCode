package module2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface6 
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
		
		System.out.println("Iterating keys:");
		for(Integer i1     : m.keySet()   )
		{
			System.out.println(i1);
		}
		System.out.println("Iterating Values:");
		for(String s1         :       m.values())
		{
			System.out.println(s1);
		}
		System.out.println("Iterating Key -Values:");
		for(Entry<Integer,String> p  : m.entrySet())
		{
			System.out.println(p);
		}
		
	}
}
