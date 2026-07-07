package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A62_StringArrayScanner 
{
    public static void main(String[] args) 
    {
    	Scanner s1 = new Scanner(System.in);
    	System.out.print("Enter size of String array: ");
    	int n = Integer.parseInt(s1.nextLine());
    	String[] a = new String[n];
    	System.out.println("Enter " + n + " strings:");
    	for (int i = 0; i < n; i++) 
    		{
    		a[i] = s1.nextLine();
    		}

    	        
    	        String[] b = Arrays.copyOf(a, a.length);

    	        System.out.println("Original array: " + Arrays.toString(a));
    	        System.out.println("Copied array:   " + Arrays.toString(b));

    	        s1.close();
   
    }
}