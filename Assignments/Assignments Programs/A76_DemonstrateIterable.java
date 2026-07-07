package assignments;

import java.util.*;

public class A76_DemonstrateIterable 
{
    public static void main(String[] args) 
    {
        List<Integer> ids = new ArrayList<>();

        ids.add(101);
        ids.add(102);
        ids.add(103);

        ids.add(1, 150);

        ids.remove((Integer) 102);

        System.out.println("List Contains 103? " + ids.contains(103));

        System.out.println("Iterator forward:");
        Iterator<Integer> it = ids.iterator();
        while (it.hasNext()) System.out.println(it.next());

        System.out.println("ListIterator forward and backward:");
        ListIterator<Integer> lit = ids.listIterator();
        while (lit.hasNext()) System.out.println(lit.next());
        while (lit.hasPrevious()) System.out.println("back: " + lit.previous());

        System.out.println("ID at index 1: " + ids.get(1));

        System.out.println("Final List: " + ids);
   }
}