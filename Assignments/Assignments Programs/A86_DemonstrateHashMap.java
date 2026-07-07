package assignments;

import java.util.*;

public class A86_DemonstrateHashMap 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "Amit");
        employees.put(102, "Priya");
        employees.put(103, "Rahul");
        employees.put(104, "Neha");

        System.out.println("All employee details: " + employees);

        System.out.println("\n1. Employee IDs (keySet with for-each):");
        for (Integer id : employees.keySet()) {
            System.out.println(id);
        }

        System.out.println("\n2. Employee names (values with for-each):");
        for (String name : employees.values()) {
            System.out.println(name);
        }

        System.out.println("\n3. Key-value pairs (entrySet with for-each):");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n4. Key-value pairs using iterator():");
        Iterator<Map.Entry<Integer, String>> it = employees.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}