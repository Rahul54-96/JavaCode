package assignments;
public class A99_Student 
{
	private String name;
	private int age;
	public A99_Student() { }
    public A99_Student(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }
    public String toString() 
    {
        return "Student{name='" + name + "', age=" + age + "}";
    }
	public static void main(String[] args) 
	{
		A99_Student s = new A99_Student();
	        s.setName("Ram");
	        s.setAge(20);

	        System.out.println("Student details (using getters):");
	        System.out.println("Name: " + s.getName());
	        System.out.println("Age : " + s.getAge());
	        System.out.println("toString(): " + s);
	    }
	}