package assignments;

public class A50_StringFunctions {
    public static void main(String[] args) {
        String s1 = " Hello Java";
        String s2 = "World Programming";
        String s3 = "hello java";

        System.out.println("Length of string: " + s1.length());
        System.out.println("concatination of 2 strings: " + s1.concat(s2));
        System.out.println("Both Strings are equals: " + s1.equals(s3));
        System.out.println("Verifying lo string present : " + s1.contains("lo"));
        System.out.println("Verifying lo string present by ignoring Case: " + s1.trim().equalsIgnoreCase(s3));
        System.out.println("Sub String of string by begin index: " + s2.substring(1));
        System.out.println("Sub String of string by begin and end index: " + s2.substring(1, 4));
        System.out.println("Trim function: '" + s1.trim() + "'");
        System.out.println("Character in string at position 1 : " + s2.charAt(1));
        System.out.println("index of character in string: " + s2.indexOf('o'));
    }
}
