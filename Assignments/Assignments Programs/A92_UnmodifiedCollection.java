package assignments;

import java.util.*;

public class A92_UnmodifiedCollection 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        List<String> unmodList = Collections.unmodifiableList(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        Set<Integer> unmodSet = Collections.unmodifiableSet(set);

        Map<String, Integer> map = new HashMap<>();
        map.put("X", 10);
        map.put("Y", 20);
        Map<String, Integer> unmodMap = Collections.unmodifiableMap(map);

        // 2. Display all collections
        System.out.println("Unmodifiable List: " + unmodList);
        System.out.println("Unmodifiable Set: " + unmodSet);
        System.out.println("Unmodifiable Map: " + unmodMap);

        // 3. Try to modify and handle exceptions
        try 
        {
            System.out.println("\nTrying to modify List...");
            unmodList.add("C");
        } 
        catch (UnsupportedOperationException e) 
        {
            System.out.println("Caught UnsupportedOperationException for List");
        }

        try 
        {
            System.out.println("Trying to modify Set...");
            unmodSet.add(3);
        } 
        catch (UnsupportedOperationException e) 
        {
            System.out.println("Caught UnsupportedOperationException for Set");
        }

        try 
        {
            System.out.println("Trying to modify Map...");
            unmodMap.put("Z", 30);
        } 
        catch (UnsupportedOperationException e) 
        {
            System.out.println("Caught UnsupportedOperationException for Map");
        }
     }
}