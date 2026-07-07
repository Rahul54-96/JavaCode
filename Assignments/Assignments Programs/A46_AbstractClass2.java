package assignments;

abstract class Vehicle 
{
    public void start() 
    {
        System.out.println("Vehicle: starting (concrete method)");
    }

    public abstract void move(); 
}

class Car extends Vehicle 
{
   public void move() 
   {
        System.out.println("Car: moving on 4 wheels");
    }
}

public class A46_AbstractClass2 
{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start(); 
        c1.move();  
    }
}
