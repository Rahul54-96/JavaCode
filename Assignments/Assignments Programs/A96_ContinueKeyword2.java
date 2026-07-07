package assignments;

public class A96_ContinueKeyword2
{
    public static void main(String[] args) 
    {
    	System.out.println("1) Numbers divisible by 3 between 1 and 100:");
    	for (int i = 1; i <= 100; i++) 
    	{
    		if (i % 3 == 0) 
    		{
    			System.out.print(i + " ");
    			
    		}
    		
    	}
    
    	System.out.println("\n\n2) Even numbers between 1 and 100:");
    	for (int i = 1; i <= 100; i++) 
    	{
    		if (i % 2 == 0) 
    		{
    			System.out.print(i + " ");
    		}
    		
    	}
    	System.out.println("\n\n3) Odd numbers between 1 and 100:");
    	for (int i = 1; i <= 100; i++) 
    	{
    		if (i % 2 != 0) 
    		{
    			System.out.print(i + " ");
    		}
    		
    	}
    	System.out.println("\n\n4) Numbers not divisible by 4 between 1 and 100:");
    	for (int i = 1; i <= 100; i++) 
    	{
    		if (i % 4 != 0) 
    		{
    			System.out.print(i + " ");
    		}
    	}
    }
}