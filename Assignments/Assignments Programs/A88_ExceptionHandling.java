package assignments;

import java.util.Scanner;

public class A88_ExceptionHandling 
{
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);

        try {
            System.out.print("Enter array size (integer): ");
            int size = s1.nextInt();

            if (size < 0)
            	{
            	throw new NegativeArraySizeException("Size cannot be negative");
            	}

            int[] arr = new int[size];

            System.out.print("Enter index to access: ");
            int index = s1.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
            } 
        catch (java.util.InputMismatchException e) 
        {
            System.out.println("Exception 1: InputMismatchException - Please enter a valid integer");
        } 
        catch (NegativeArraySizeException e) 
        {
            System.out.println("Exception 2: NegativeArraySizeException - " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception 3: ArrayIndexOutOfBoundsException - Index out of range");
        } 
        finally 
        {
            System.out.println("Finally block executed");
            s1.close();
        }
     }
}