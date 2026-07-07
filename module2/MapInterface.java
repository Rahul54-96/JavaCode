package module2;

import java.util.HashMap;
import java.util.Map;

public class MapInterface 
{
	public static void main(String[] args) 
	{
	
		Map m=new HashMap();//upcasting
		m.put(452, "Anjali");
		m.put(852, "Pooja");
		m.put(900, "Rahul");
		m.put(600, "Rajesh");
		System.out.println(m);

	}
}
