package assignments;

import java.util.*;

public class A84_DemonstrateMapInterface 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");

        Map<String, Double> map2 = new HashMap<>();
        map2.put("Pi", 3.14);
        map2.put("E", 2.71);

        Map<Integer, Character> map3 = new HashMap<>();
        map3.put(1, 'A');
        map3.put(2, 'B');

        Map<String, Boolean> map4 = new HashMap<>();
        map4.put("Active", true);
        map4.put("Inactive", false);

        System.out.println("Map<Integer, String>: " + map1);
        System.out.println("Map<String, Double>: " + map2);
        System.out.println("Map<Integer, Character>: " + map3);
        System.out.println("Map<String, Boolean>: " + map4);
    }
}