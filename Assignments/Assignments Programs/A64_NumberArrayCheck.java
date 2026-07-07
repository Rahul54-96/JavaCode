package assignments;

import java.util.Scanner;

public class A64_NumberArrayCheck 
{
    public static void main(String[] args) 
    {
    	Scanner s1 = new Scanner(System.in);
        System.out.print("Enter size of int array: ");
        int n = Integer.parseInt(s1.nextLine());
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) 
        	{
        	arr[i] = Integer.parseInt(s1.nextLine());
        	}

        System.out.print("Enter number to search: ");
        int key = Integer.parseInt(s1.nextLine());

        boolean found = false;
        for (int v : arr) 
        {
            if (v == key) 
            { 
            	found = true; 
            	break; 
            	
            }
        }
        if (found) 
        {
            System.out.println(key + " is present in the array.");
        } 
        else
        {
            System.out.println(key + " is NOT present in the array.");
        }
        s1.close();
    }
}