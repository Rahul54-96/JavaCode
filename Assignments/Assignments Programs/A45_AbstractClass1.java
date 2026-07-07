package assignments;

abstract class AbstractCalculator 
{
    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);
    public abstract int mul(int a, int b);
    public abstract double div(int a, int b);
}

class CalculatorImpl extends AbstractCalculator 
{
 public int add(int a, int b) 
 { 
	 int c = a + b;
	 return c;
 }

 public int sub(int a, int b) 
 { 
	int c= a - b;
	return c;
 }

 public int mul(int a, int b) 
 { 
	 int c= a * b;
	 return c;
	 
 }

 public double div(int a, int b) 
 { 
	 double c = a / b;
	 return c;
	 
 }
}

public class A45_AbstractClass1 {
    public static void main(String[] args) {
        CalculatorImpl calc = new CalculatorImpl();
        System.out.println("add = " + calc.add(10, 5));
        System.out.println("sub = " + calc.sub(10, 5));
        System.out.println("mul = " + calc.mul(10, 5));
        System.out.println("div = " + calc.div(10, 5));
    }
}