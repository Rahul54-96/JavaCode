package assignments;

public class AA00_DemonstrateCasting 
{
	public static void main(String[] args) 
	{
		System.out.println("Widening implicitly cast");
	    int intImp = 100;
	    long longImp = intImp;        
	    float floatImp = longImp;       
	    double doubleImp = floatImp;      
	    System.out.println("int variable Value = " + intImp);
	    System.out.println("long variable Value = " + longImp);
	    System.out.println("float variable Value = " + floatImp);
	    System.out.println("double variable Value = " + doubleImp);

	    System.out.println(" Narrowing Explicitly casts");
	    double doubleExp = 123.456;
	    float floatExp = (float) doubleExp;  
	    long longExp = (long) floatExp;    
	    int intExp = (int) longExp;      
	    byte byteExp = (byte) intExp;     
	    System.out.println("double variable Value = " + doubleExp);
	    System.out.println("double narrowing casting into float -> " + floatExp);
	    System.out.println("float narrowing casting into long -> " + longExp);
	    System.out.println("long narrowing casting into int -> " + intExp);
	    System.out.println("int narrowing casting into byte -> " + byteExp);
	    }
	}