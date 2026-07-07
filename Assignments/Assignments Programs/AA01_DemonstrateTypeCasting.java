package assignments;

public class AA01_DemonstrateTypeCasting 
{
	public static void main(String[] args) 
	{
		System.out.println("1) byte into an int using widening primitive Typecasting.");
	    byte byteVar = 100;
	    int intVar = byteVar;
	    
	    System.out.println("byte variable before widening casting into int -> " + byteVar);
	    System.out.println("byte variable after widening casting into int -> " + intVar);
	    
	    System.out.println("\n \n2) long into byte using narrowing primitive Typecasting.");
	    long longVar = 123963456456l;
	    byte byteVar2 = (byte) longVar;  
	    
	    System.out.println("long variable before narrowing casting into byte -> " + longVar);
	    System.out.println("long variable after narrowing casting into byte -> " + byteVar2);
	    }
	}