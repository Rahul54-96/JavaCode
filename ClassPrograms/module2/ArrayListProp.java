package module2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProp 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(40);
		marks.add(404);
		marks.add(74);
		marks.add(90);
		marks.add(10);
		System.out.println(marks);
		
		Collections.sort(marks);
		System.out.println(marks);
		Collections.reverse(marks);
		System.out.println(marks);


		ArrayList<String> names=new ArrayList<String>();
		names.add("Bheem");
		names.add("Vishnu");
		names.add("Vaibhav");
		names.add("Akash");
		names.add("Rupali");
		System.out.println(names);
		ArrayList<Double> percentage=new ArrayList<Double>();
		percentage.add(90.2);
		percentage.add(74.6);
		percentage.add(74.4);
		percentage.add(95.6);
		percentage.add(46.3);
		System.out.println(percentage);

	}
}


