package assignments;

import java.util.*;

public class A94_DemonstrateSingleton 
{
    public static void main(String[] args) 
    {
        List<String> singletonList = Collections.singletonList("OnlyOne");
        Set<Integer> singletonSet = Collections.singleton(42);
        Map<String, String> singletonMap = Collections.singletonMap("key", "value");

        System.out.println("Singleton List: " + singletonList);
        System.out.println("Singleton Set: " + singletonSet);
        System.out.println("Singleton Map: " + singletonMap);

        try 
        {
            System.out.println("\nTrying to add to Singleton List...");
            singletonList.add("Another");
        } 
        catch (UnsupportedOperationException e) 
        {
            System.out.println("Caught UnsupportedOperationException: Cannot modify singleton");
        }

        try 
        {
            System.out.println("Trying to add to Singleton Set...");
            singletonSet.add(100);
        } 
        catch (UnsupportedOperationException e) 
        {
            System.out.println("Caught UnsupportedOperationException: Cannot modify singleton");
        }

        try 
        {
            System.out.println("Trying to put in Singleton Map...");
            singletonMap.put("key2", "value2");
        } 
        catch (UnsupportedOperationException e) 
        {
            System.out.println("Caught UnsupportedOperationException: Cannot modify singleton");
        }
     }
}