package assignments;

import java.util.Scanner;

class Parent {
    void show(String name) {
        System.out.println("Parent: show()");
    }
}

class Child extends Parent {
   
    void show(String name) {
        super.show(name); // call parent implementation
        System.out.println("Child: show() (after calling super)");
    }
}

public class A40_MethodOverridingChildParent {
    public static void main(String[] args) {
    	Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = s1.next();
		Child c = new Child();
        c.show(name); // prints both parent and child messages
    }
}

