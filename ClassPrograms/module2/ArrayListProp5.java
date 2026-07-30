package module2;

import java.util.ArrayList;

public class ArrayListProp5 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(40);
		marks.add(404);
		marks.add(74);
		marks.add(90);
		marks.add(10);
		marks.add(1, 63);
		
		for(int i=0;i<marks.size();i++)
		{
			System.out.println(marks.get(i));
		}
		
		
	/*	marks.clear();
		System.out.println(marks);
		
		boolean b1=	marks.isEmpty();
		System.out.println(b1);
	*/	
		boolean b3=		marks.contains(74);
		System.out.println(b3);	
		
		Integer i1=	marks.get(5);
		System.out.println(i1);
	
	}
}


