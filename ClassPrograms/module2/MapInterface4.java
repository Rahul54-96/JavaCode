package module2;

import java.util.HashMap;
import java.util.Map;

public class MapInterface4 
{
	public static void main(String[] args) 
	{
	
		Map<Character,String> m=new HashMap<Character,String>();//upcasting
		//A,B,C,D,F
		m.put('A', "91 or more");
		m.put('B', "81 or more");
		m.put('C', "71 or more");
		m.put('D', "61 or more");
		System.out.println(m);

	}
}
