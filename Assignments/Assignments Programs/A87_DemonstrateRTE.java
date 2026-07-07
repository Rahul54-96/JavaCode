package assignments;

public class A87_DemonstrateRTE 
{
    public static void main(String[] args) 
    {
        try {
            int size = -5;
            int[] arr = new int[size]; 
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
            e.printStackTrace();
        }
   }
}