package module2;

import java.util.ArrayList;

public class ArrayListProp1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Bheem");
		names.add("Vishnu");
		names.add("Vaibhav");
		names.add("Akash");
		names.add("Rupali");
		System.out.println(names);
		
		names.remove(3);
		System.out.println(names);
		names.remove("Vaibhav");
		System.out.println(names);

	}	
}
