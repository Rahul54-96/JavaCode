package assignments;

import java.util.*;

public class A58_AcceptArrayRuntime1 
{
    public static void main(String[] args) 
    {
    	Scanner s1 = new Scanner(System.in);

        int[] nums = new int[4];
        System.out.println("Enter 4 integers (one per line):");
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = Integer.parseInt(s1.nextLine());
        }
        System.out.println("You entered int array: " + Arrays.toString(nums));

        String[] strs = new String[3];
        System.out.println("Enter 3 strings (one per line):");
        for (int i = 0; i < strs.length; i++)
        {
            strs[i] = s1.nextLine();
        }
        System.out.println("You entered String array: " + Arrays.toString(strs));

        s1.close();
    }
}

