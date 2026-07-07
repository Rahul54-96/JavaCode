package assignments;

import java.util.*;

public class A90_CollectionMethod 
{
    public static void main(String[] args) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);

        System.out.println("Original List : " + list);

        Collections.sort(list);
        System.out.println("1. List after sort(): " + list);

        Collections.reverse(list);
        System.out.println("2. List after reverse(): " + list);

        Collections.shuffle(list);
        System.out.println("3. List after shuffle(): " + list);

        Collections.sort(list);

        System.out.println("4. maximum of List : " + Collections.max(list));
        System.out.println("5. min of List : " + Collections.min(list));

        Collections.swap(list, 0, 4);
        System.out.println("6. List after swap(0,4): " + list);

        int idx = Collections.binarySearch(list, 30);
        System.out.println("7. List after binarySearch(30): " + idx);

        list.add(30);
        System.out.println("8. List after frequency(30): " + Collections.frequency(list, 30));
     }
}