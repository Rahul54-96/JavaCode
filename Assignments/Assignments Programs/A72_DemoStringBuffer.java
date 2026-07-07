package assignments;

public class A72_DemoStringBuffer 
{
    public static void main(String[] args) 
    {
        StringBuffer str = new StringBuffer();
        System.out.println("Initial capacity: " + str.capacity());

        str.append("Hello");
        System.out.println("After append: " + str.toString());
        System.out.println("Capacity after append: " + str.capacity());

        str.insert(5, " World");
        System.out.println("After insert: " + str.toString());

        str.replace(6, 11, "Java");
        System.out.println("After replace: " + str.toString());

        str.delete(5, 10);
        System.out.println("After delete: " + str.toString());

        str.reverse();
        System.out.println("After reverse: " + str.toString());

       System.out.println("Final length: " + str.length());
        System.out.println("Final capacity: " + str.capacity());
     }
}