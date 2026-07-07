package assignments;


public class A42_AccessSpecifier2 {
    public static void main(String[] args) {
    	A42_AccessSpecifier21 A42 = new A42_AccessSpecifier21();

        System.out.println("pub = " + A42.pub);
        System.out.println("prot = " + A42.prot);
        System.out.println("def = " + A42.def);
        
        A42.printMembers();
    }
}

