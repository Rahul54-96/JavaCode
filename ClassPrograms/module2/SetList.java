package module2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList 
{
	public static void main(String[] args) 
	{
			List<String> l1=	new ArrayList<String>();
			l1.add("Sham");
			l1.add("Mohan");
			l1.add("Guru");
			l1.add("Vishnu");
			l1.add("Bheem");
			System.out.println("Following Indexing->"+l1);
			Set<String> s1=new HashSet<String>(l1);
			System.out.println("Not following Indexing->"+s1);
			
	}
}
