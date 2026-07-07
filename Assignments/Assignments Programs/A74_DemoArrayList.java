package assignments;

import java.util.ArrayList;

public class A74_DemoArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('b');
        chars.add('3');
        System.out.println("Character list: " + chars);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("String");
        objects.add(123);
        objects.add(45.67);
        System.out.println("Object list: " + objects);

        ArrayList<Float> floats = new ArrayList<>();
        floats.add(1.5f);
        floats.add(2.75f);
        floats.add(3.0f);
        System.out.println("Float list: " + floats);
    }
}