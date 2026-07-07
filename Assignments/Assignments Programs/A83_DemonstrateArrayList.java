package assignments;

import java.util.*;

public class A83_DemonstrateArrayList 
{
    public static void main(String[] args) 
    {
        List<String> employees = new ArrayList<>();

        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Amit");
        employees.add("Neha");
        employees.add("Vikram");

        System.out.println("1. Original employees: " + employees);

        Collections.sort(employees);
        System.out.println("2. Sorted alphabetically: " + employees);

        Collections.reverse(employees);
        System.out.println("3. Reversed List : " + employees);

        System.out.println("4. List contains 'Amit'? " + employees.contains("Amit"));

        Collections.shuffle(employees);
        System.out.println("5. List after Shuffled: " + employees);

        List<Integer> salaries = new ArrayList<>();
        salaries.add(50000);
        salaries.add(60000);
        salaries.add(45000);
        salaries.add(55000);
        salaries.add(70000);

        System.out.println("Salaries: " + salaries);

        int maxSalary = Collections.max(salaries);
        System.out.println("Maximum salary: " + maxSalary);

        int minSalary = Collections.min(salaries);
        System.out.println("Minimum salary: " + minSalary);
    }
}