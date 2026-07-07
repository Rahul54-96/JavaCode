package assignments;

import java.util.*;

public class A85_DemoMapIntHashMapClass 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> empMap = new HashMap<>();

        empMap.put(101, "Amit");
        empMap.put(102, "Priya");
        empMap.put(103, "Rahul");

        empMap.putIfAbsent(104, "Neha");
        empMap.putIfAbsent(102, "Already Exists"); 

        System.out.println("After put and putIfAbsent: " + empMap);

        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(empMap);
        anotherMap.put(105, "Vikram"); 
        System.out.println("Another Map after putAll: " + anotherMap);

        empMap.remove(102);
        
        System.out.println("After remove(102): " + empMap);
        System.out.println("containsKey(101)? " + empMap.containsKey(101));
        System.out.println("containsKey(999)? " + empMap.containsKey(999));
        System.out.println("containsValue('Amit')? " + empMap.containsValue("Amit"));
        System.out.println("get(101): " + empMap.get(101));
        System.out.println("Size: " + empMap.size());
        System.out.println("\n--- Traversal Methods ---");
        System.out.println("keySet: " + empMap.keySet());
        System.out.println("values: " + empMap.values());
        System.out.println("entrySet: " + empMap.entrySet());

        Map<Integer, String> empMap2 = new HashMap<>(empMap);
        empMap2.clear();
        System.out.println("After clear, isEmpty? " + empMap2.isEmpty());
    }
}