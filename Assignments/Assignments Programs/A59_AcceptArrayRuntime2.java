package assignments;

import java.util.*;

public class A59_AcceptArrayRuntime2 
{
    public static void main(String[] args) 
    {
    	        Scanner s1 = new Scanner(System.in);

    	        System.out.print("Enter size of int array: ");
    	        int n = Integer.parseInt(s1.nextLine());
    	        int[] nums = new int[n];
    	        System.out.println("Enter " + n + " integers (one per line):");
    	        for (int i = 0; i < n; i++)
    	        {
    	            nums[i] = Integer.parseInt(s1.nextLine());
    	        }
    	        System.out.println("Int array: " + Arrays.toString(nums));

    	        System.out.print("Enter size of String array: ");
    	        int m = Integer.parseInt(s1.nextLine());
    	        String[] strs = new String[m];
    	        System.out.println("Enter " + m + " strings (one per line):");
    	        for (int i = 0; i < m; i++) 
    	        {
    	            strs[i] = s1.nextLine();
    	        }
    	        System.out.println("String array: " + Arrays.toString(strs));

    	        s1.close();
    	
    }
}