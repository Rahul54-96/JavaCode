package assignments;

public class A44_AccessSpecifier4 {
    public static void main(String[] args) {
    	A43_BaseClass base = new A43_BaseClass();

        System.out.println("pub = " + base.pub);
        System.out.println("prot = " + base.prot); // compile error
        System.out.println("def = " + base.def);   // compile error
      }
}