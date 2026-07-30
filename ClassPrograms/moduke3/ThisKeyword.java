package moduke3;
public class ThisKeyword 
{
	int empid;
	double salary;
	String name;
	void studentDetails(int empid,double salary,String name)
	{
		this.empid=empid;
		this.salary=salary;
		this.name=name;
	}
	public static void main(String[] args) 
	{
	
		ThisKeyword t1=new ThisKeyword();
		t1.studentDetails(45, 11.2, "Ram");
		System.out.println(t1.empid);
		System.out.println(t1.salary);
		System.out.println(t1.name);

	}
}
