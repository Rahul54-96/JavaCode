package moduke3;
class Information
{
	private int age=25;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}	
	
	private String emailid="contact@me.com";
	
	public String getEmilid()
	{
		return emailid;
	}
	public void setEmilid(String emailid)
	{
		this.emailid=emailid;
	}
	private double salary=25000;

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}
public class Encapsulationprogram
{
	public static void main(String[] args) 
	{
		Information f1=new Information();
		f1.setAge(23);
		System.out.println(f1.getAge());
		
		f1.setEmilid("bhim@grotechminds.com");
		System.out.println(f1.getAge());
		
		f1.setSalary(63000);
		System.out.println(f1.getSalary());
	}
}
