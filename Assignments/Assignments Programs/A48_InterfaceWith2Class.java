package assignments;

interface SimpleCalc {
    int add(int a, int b);
    int sub(int a, int b);
}

class SimpleCalcImpl implements SimpleCalc 
{
    public int add(int a, int b) 
    { 
    	int c= a + b;
    	return c; 
    	
    }

    public int sub(int a, int b) 
    { 
    	int c= a - b;
    	return c;
    	
    }
}

public class A48_InterfaceWith2Class 
{
    public static void main(String[] args) 
    {
        SimpleCalcImpl calc = new SimpleCalcImpl();
        System.out.println("add(8,3) = " + calc.add(8, 3));
        System.out.println("sub(8,3) = " + calc.sub(8, 3));
    }
}