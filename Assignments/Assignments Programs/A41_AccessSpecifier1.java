package assignments;

public class A41_AccessSpecifier1 
{
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    private void privateMethod() 
    { 
    	System.out.println("privateMethod called"); 
    }
    void defaultMethod() 
    { 
    	System.out.println("defaultMethod called"); 
    }
    protected void protectedMethod() 
    { 
    	System.out.println("protectedMethod called"); 	
    }
    public void publicMethod() 
    { 
    	System.out.println("publicMethod called");
    }

    public static void main(String[] args) {
    	A41_AccessSpecifier1 A41 = new A41_AccessSpecifier1();

        System.out.println("Private variable value is = " + A41.privateVar);
        System.out.println("Default variable value is = " + A41.defaultVar);
        System.out.println("Protected variable value is = " + A41.protectedVar);
        System.out.println("Public variable value is = " + A41.publicVar);

        A41.privateMethod();
        A41.defaultMethod();
        A41.protectedMethod();
        A41.publicMethod();
    }
}

