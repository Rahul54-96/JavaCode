package assignments;

import java.util.*;
public class A63_CopyReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
	    System.out.print("Enter size of int array: ");
	    int n = Integer.parseInt(s1.nextLine());
	    int[] src = new int[n];
	    System.out.println("Enter " + n + " integers:");
	    for (int i = 0; i < n; i++)
	    	{
	    	src[i] = Integer.parseInt(s1.nextLine());
	    	}

	        int[] rev = new int[n];
	        for (int i = 0; i < n; i++)
	        	{
	        	rev[i] = src[n - 1 - i];
	        	}

	        System.out.println("Source: " + Arrays.toString(src));
	        System.out.println("Reversed copy: " + Arrays.toString(rev));

	        s1.close();
	    }
	}