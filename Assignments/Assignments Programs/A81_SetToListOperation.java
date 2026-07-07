package assignments;

import java.util.*;

public class A81_SetToListOperation 
{
    public static void main(String[] args) 
    {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("Original Set: " + set);

        List<Integer> list = new ArrayList<>(set);
        System.out.println("Converted List: " + list);

        list.add(40);
        list.add(50);
        System.out.println("After adding new elements: " + list);
    }
}