package assignments;

import java.util.Scanner;

public class A89_DemonstrateFinally 
{
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(s1.nextLine());
            int result = 100 / num; // Can throw ArithmeticException if num=0
            System.out.println("Result: " + result);
            }
        catch (ArithmeticException e) 
        {
            System.out.println("Cannot divide by zero");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid number format");
        } 
        finally
        {
            System.out.println("Finally block: This always executes");
            s1.close();
        }
    }
}