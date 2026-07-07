package assignments;

import java.util.*;

public class A65_ArrayEqual 
{
    public static void main(String[] args) 
    {
    	Scanner s1 = new Scanner(System.in);

        System.out.print("Enter size of first int array: ");
        int n1 = Integer.parseInt(s1.nextLine());
        int[] a1 = new int[n1];
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < n1; i++)
        	{
        	a1[i] = Integer.parseInt(s1.nextLine());
        	}

        System.out.print("Enter size of second int array: ");
        int n2 = Integer.parseInt(s1.nextLine());
        int[] a2 = new int[n2];
        System.out.println("Enter elements for second array:");
        for (int i = 0; i < n2; i++) 
        	{
        	a2[i] = Integer.parseInt(s1.nextLine());
        	}

        boolean equal = Arrays.equals(a1, a2);
        System.out.println("Are the two arrays equal? " + equal);

        s1.close();
        }
}