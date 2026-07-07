package assignments;

import java.util.*;

public class A82_CollectionProperties 
{
    public static void main(String[] args) 
    {
        Collection<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(90);
        marks.add(75);
        marks.add(88);

        System.out.println("Marks collection: " + marks);

        System.out.println("Iterate using iterator():");
        Iterator<Integer> it = marks.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(85);
        numbers.add(92);
        numbers.add(75);

        System.out.println("\nNumbers collection: " + numbers);

        System.out.println("\n--- Explore Collection Methods ---");

        Collection<Integer> combined = new ArrayList<>(marks);
        combined.addAll(numbers);
        System.out.println("Collection after addAll(): " + combined);

       marks.remove((Integer) 90);
        System.out.println("Collection after remove(90): " + marks);

       System.out.println("Collection contains number at position 85: " + marks.contains(85));

        System.out.println("marks collection contains All numbers: " + marks.containsAll(numbers));

        System.out.println("size of marks: " + marks.size());

        marks.removeAll(numbers);
        System.out.println("Marks after removeAll(numbers): " + marks);

        Collection<Integer> temp = new ArrayList<>(numbers);
        temp.clear();
        System.out.println("temp collection After clear: " + temp);

        System.out.println("temp collection is empty: " + temp.isEmpty());

        Collection<Integer> col1 = new ArrayList<>();
        col1.add(1);
        col1.add(2);
        Collection<Integer> col2 = new ArrayList<>(col1);
        System.out.println("collection 1 equals to collection 2): " + col1.equals(col2));
    }
}