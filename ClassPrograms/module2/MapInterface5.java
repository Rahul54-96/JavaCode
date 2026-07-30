package module2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface5 
{
	public static void main(String[] args) 
	{
	
		Map<Integer,String> m=new HashMap<Integer,String>();//upcasting
		m.put(452, "Anjali");
		m.put(852, "Pooja");
		m.put(900, "Rahul");
		m.put(600, "Rajesh");
		System.out.println(m);
		Map<Integer,String> n=new HashMap<Integer,String>();//upcasting
		n.put(12, "Verma");
		n.put(85, "Mishra");
		n.put(90, "Roy");
		n.put(60, "Kapoor");
		System.out.println(n);
		
		m.putAll(n);//this is just like addall from collection
		
		System.out.println("Updated M:"+m);

/*		m.isEmpty();
		
		m.clear();
		
		m.size();
	*/	
		
		boolean b1=	m.equals(n);	
		System.out.println(b1);
		boolean b3=m.containsKey(900);
		boolean b7=	m.containsValue("Aparna");
		System.out.println(b3);
		System.out.println(b7);
		
		m.remove(452);
		
		m.remove(900, "Rahul");
		
		System.out.println(m);
		
		m.replace(600, "Tanmay");
		m.replace(85, "Mishra", "Singh");
		System.out.println(m);
		Set<Integer> keys=	m.keySet();
		Collection<String>	value=m.values();
		Set<Entry<Integer,String>> pair=	m.entrySet();
		
		
		
		
	}
}
