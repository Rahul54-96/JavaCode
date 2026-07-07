package assignments;

public class A43_AccessSpecifier3 extends A43_BaseClass {
    public void accessTest() 
    {
        
        System.out.println("pub (accessible) = " + pub);
        System.out.println("prot (accessible as inherited) = " + prot);
    }

    public static void main(String[] args) {
    	A43_AccessSpecifier3 A43 = new A43_AccessSpecifier3();
    	A43.accessTest();

       
    	A43_BaseClass base = new A43_BaseClass();
        System.out.println("From BaseAccess reference in different package, pub = " + base.pub);
        
    }
}
