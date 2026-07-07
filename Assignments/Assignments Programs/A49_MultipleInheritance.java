package assignments;

interface InterfaceA 
{
    void methodA();
}

interface InterfaceB extends InterfaceA 
{
    void methodB();
}

class ClassA implements InterfaceB 
{
    public void methodA() 
    {
        System.out.println("methodA implemented");
    }

    public void methodB() 
    {
        System.out.println("methodB implemented");
    }
}

public class A49_MultipleInheritance 
{
    public static void main(String[] args) 
    {
    	ClassA A49 = new ClassA();
    	A49.methodA();
    	A49.methodB();

        InterfaceA aRef = A49;
        aRef.methodA();
    }
}
