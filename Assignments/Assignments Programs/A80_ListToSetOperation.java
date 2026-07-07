package assignments;

import java.util.*;

public class A80_ListToSetOperation 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); 
        list.add("Cherry");

        System.out.println("Original List: " + list);

        Set<String> set = new HashSet<>(list);
        System.out.println("Converted Set (duplicates removed): " + set);

        set.add("Date");
        set.add("Elderberry");
        System.out.println("After adding new elements: " + set);
     }
}