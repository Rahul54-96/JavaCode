package assignments;

class GrandParent 
{
    public void gpMethod() 
    {
        System.out.println("GrandParent: gpMethod()");
    }
}

abstract class AbstractParent extends GrandParent 
{
    public abstract int add(int a, int b); 

    public void parentConcrete() 
    {
        System.out.println("AbstractParent: parentConcrete()");
    }
}

class A47_concreteGrand extends AbstractParent 
{
    public int add(int a, int b) 
    {
        return a + b;
    }

    public void childMethod()
    {
        System.out.println("ConcreteChild: childMethod()");
    }

    public static void main(String[] args)
    {
    	A47_concreteGrand c = new A47_concreteGrand();
        c.gpMethod();        
        c.parentConcrete();  
        System.out.println("add(5,7) = " + c.add(5, 7)); 
        c.childMethod();     
        
    }
}
