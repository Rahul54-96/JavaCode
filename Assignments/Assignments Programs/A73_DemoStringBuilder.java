package assignments;

public class A73_DemoStringBuilder 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder();
        System.out.println("Initial capacity: " + sb.capacity());

        sb.append("Alpha");
        System.out.println("After append: " + sb.toString());

        sb.insert(5, " Beta");
        System.out.println("After insert: " + sb.toString());

        sb.replace(0, 5, "Omega");
        System.out.println("After replace: " + sb.toString());

        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        sb.delete(0, 2);
        System.out.println("After delete: " + sb.toString());

        System.out.println("Final length: " + sb.length());
        System.out.println("Final capacity: " + sb.capacity());
    }
}