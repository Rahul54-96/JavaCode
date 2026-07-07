package assignments;

import java.util.*;

public class A75_ArrayListOperation 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList after add: " + list);

        list.add(1, 15);
        System.out.println("ArrayList after add at index 1: " + list);

        List<Integer> more = Arrays.asList(40, 50);
        list.addAll(more);
        System.out.println("ArrayList after addAll: " + list);

        System.out.println("ArrayList contains 20? " + list.contains(20));

        System.out.println("ArrayList contains all [40,50]? " + list.containsAll(more));

        list.remove(2); 
        System.out.println("ArrayList after remove index 2: " + list);

        list.remove((Integer) 50);
        System.out.println("ArrayList after remove object 50: " + list);

        list.removeAll(Arrays.asList(40, 999)); 
        System.out.println("ArrayList after removeAll [40,999]: " + list);

        System.out.println("Element at index 1: " + list.get(1));

        ArrayList<Integer> copy = new ArrayList<>(list);
        System.out.println("List equals copy? " + list.equals(copy));

        list.clear();
        System.out.println("After clear, isEmpty? " + list.isEmpty());
    }
}