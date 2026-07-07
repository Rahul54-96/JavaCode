package module2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProp3 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(40);
		marks.add(404);
		marks.add(74);
		marks.add(90);
		marks.add(10);
		marks.add(40);

		marks.add(1, 63);
		
		System.out.println(marks);
		
		System.out.println(Collections.max(marks));
		
		System.out.println(Collections.min(marks));
		System.out.println(Collections.frequency(marks, 40));
			ArrayList<Integer> schoolmarks=new ArrayList<Integer>();
		schoolmarks.add(85);
		schoolmarks.add(96);
		schoolmarks.addAll(1,marks);
		System.out.println(schoolmarks);
	
		boolean b4=	schoolmarks.containsAll(marks);
			System.out.println(b4);
			
			schoolmarks.removeAll(marks);
			System.out.println(schoolmarks);
			
	/*	boolean b1=	marks.equals(names);
		System.out.println(b1);
	*/
	}
}


