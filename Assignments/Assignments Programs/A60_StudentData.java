package assignments;

public class A60_StudentData 
{
    public static void printStudent(int index, String name, char initial, int roll) 
    {
    	System.out.println(index + " Student:");
    	System.out.println("My Name is:->" + name);
    	System.out.println("My Initial is->" + initial);
    	System.out.println("My rollNo is ->" + roll);
    	    
    }
    public static void main(String[] args) 
    {
    	printStudent(1, "Ram", 'A', 11);
    	System.out.println();
    	printStudent(2, "Sham", 'W', 53);
    	System.out.println();
    	printStudent(3, "Hari", 'P', 40);
    	
    }
}