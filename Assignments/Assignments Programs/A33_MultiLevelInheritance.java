package assignments;

class parent1
{
	static void display()
	{
		System.out.println("Static method of parent1 class");
	}
	void show()
	{
		System.out.println("Non-static method of parent1 class");
	}
}
class parent2 extends parent1
{
	static void information()
	{
		System.out.println("Static method of parent2 class");
	}
	void details()
	{
		System.out.println("Non-static method of parent2 class");
	}
}
public class A33_MultiLevelInheritance extends parent2
{
	void childmethod()
	{
		System.out.println("I'm non static method of child class");
	}
	public static void main(String[] args) 
	{
		A33_MultiLevelInheritance A33 = new A33_MultiLevelInheritance();
		
		display();
		A33.show();
		information();
		A33.details();
		A33.childmethod();

	}
}
