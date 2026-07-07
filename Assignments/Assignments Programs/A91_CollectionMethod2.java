package assignments;

import java.util.*;

public class A91_CollectionMethod2 
{
    public static void main(String[] args) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original: " + list);

        List<Integer> fillList = new ArrayList<>(list);
        Collections.fill(fillList, 99);
        System.out.println("1. After fill(99): " + fillList);

       List<Integer> dest = new ArrayList<>(list);
        Collections.fill(dest, 0);
        Collections.copy(dest, list);
        System.out.println("2. After copy(): " + dest);

        List<Integer> replaceList = new ArrayList<>(list);
        Collections.replaceAll(replaceList, 3, 333);
        System.out.println("3. After replaceAll(3, 333): " + replaceList);

        List<Integer> rotateList = new ArrayList<>(list);
        Collections.rotate(rotateList, 2);
        System.out.println("4. After rotate(2): " + rotateList);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        System.out.println("5. disjoint(list, list2)? " + Collections.disjoint(list, list2));

        List<Integer> addAllList = new ArrayList<>(list);
        addAllList.addAll(Arrays.asList(10, 11, 12, 13));
        System.out.println("6. After addAll(10,11,12,13): " + addAllList);
       }
}