package module1;
public class MethodOverloading
{
	 void login(long mobileno)
	{
		System.out.println("Login using mobileno");
	}
	 void login(String emailid)
	{
		System.out.println("Login using Emailid");
	}
	 void login(String emailid,String gender)
	{
		System.out.println("Login using Emailid 2");
	}
	public static void main(String[] args) 
	{
	
		MethodOverloading m1=new MethodOverloading();
		m1.login("stbymkt@gmail.com");
		m1.login(8009900785l);
		m1.login("stbymkt@gmail.com","Male");
	}
}
