package assignments;

import java.util.Scanner;

public class A79_DemonstrateVector 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        
        System.out.println("matches [a-z0-9]) : " + str.matches("[a-z0-9]+"));
        System.out.println("replace(char,char) a->x : " + str.replace('a', 'x'));
        System.out.println("replace(CharSequence,CharSequence) abc->XYZ : " + str.replace("abc", "XYZ"));
        System.out.println("replaceAll(regex, replacement) digits-># : " + str.replaceAll("\\d", "#"));
    }
}