package assignments;

import java.util.*;

public class A93_DemonstrateSynchronizedList 
{
    public static void main(String[] args) 
    {
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Item1");
        syncList.add("Item2");
        syncList.add("Item3");

        System.out.println("Synchronized List:");
        synchronized (syncList) 
        {
            for (String item : syncList) 
            {
                System.out.println(item);
            }
        }

        Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<>());
        syncSet.add(10);
        syncSet.add(20);
        syncSet.add(30);

        System.out.println("\nSynchronized Set:");
        synchronized (syncSet) 
        {
            for (Integer num : syncSet) 
            {
                System.out.println(num);
            }
        }

        Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>());
        syncMap.put("A", 100);
        syncMap.put("B", 200);
        syncMap.put("C", 300);

        System.out.println("\nSynchronized Map:");
        synchronized (syncMap) {
            for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
     }
}