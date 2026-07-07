package module2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList2 
{
	public static void main(String[] args) 
	{
				Set<String> s1=new HashSet<String>();
				s1.add("Kavya");
				s1.add("Anjali");
				s1.add("Malathi");
				s1.add("Nisha");
				s1.add("Pallavi");
				System.out.println(s1);
				List<String> l1=	new ArrayList<String>(s1);
				System.out.println("Converted Set Into List:"+l1);
					l1.add("Prerna");
					l1.add("Neelam");
					l1.add(2, "Priyanka");
				System.out.println(l1);
	}
}
