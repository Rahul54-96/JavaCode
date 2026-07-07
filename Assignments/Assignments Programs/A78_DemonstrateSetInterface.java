package assignments;

import java.util.*;

public class A78_DemonstrateSetInterface 
{
    public static void main(String[] args) 
    {
        Vector<String> names = new Vector<>();

        names.add("Alice");
        names.addElement("Bob");
        names.add("Charlie");
        names.addElement("Diana");

        System.out.println("1. All elements of vector: " + names);

        System.out.println("2. Size of vector: " + names.size());
        System.out.println("   Capacity: " + names.capacity());

        System.out.println("3. vector Contains 'Bob'? " + names.contains("Bob"));
        System.out.println("   vector Contains 'Eve'? " + names.contains("Eve"));

       System.out.println("4. Iterate vector using Enumeration:");
        Enumeration<String> e = names.elements();
        while (e.hasMoreElements()) {
            System.out.println("   " + e.nextElement());
        }

        System.out.println("5. First element : " + names.firstElement() + " and Last element of vector: " + names.lastElement());

        names.set(3, "Ram");
        System.out.println("6. Vector after set(3, 'Ram'): " + names);

        names.removeElement("Alice");
        System.out.println("7. Vector after removeElement('Alice'): " + names);

        names.removeElementAt(1);
        System.out.println("Vector after removeElementAt(1): " + names);

        names.insertElementAt("Eve", 1);
        System.out.println("Vector after insertElementAt(1, 'Eve'): " + names);
  }
}