package assignments;

import java.util.Scanner;

class Animal {
    void makeSound(String str) {
        System.out.println("Animal: generic sound "+str);
    }
}

class Dog extends Animal {
    void makeSound(String str) {
        System.out.println("Dog: Woof! Woof! "+str);
    }
}

public class A39_MethodOverriding {
    public static void main(String[] args) {
    	Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Sound : ");
		String sound = s1.next();
		Animal a = new Animal();
        a.makeSound(sound);                

        Animal ad = new Dog();
        ad.makeSound(sound);               

        Dog d = new Dog();
        d.makeSound(sound);             
    }
}
