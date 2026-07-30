package module2;//stbymkt@gmail.com
//stbymkt is my user id

//Instagram:
/*
 * user id:angelpriyabeautiful123
Girl:anu@gmail.com
Mobiel no:7896541230	
*/
class B3
{
	void login()
	{
		System.out.println("Login is happneing with Userid");
	}
}
 class B2 extends B3
{
	void login()
	{
		super.login();
		System.out.println("Login is happneing with Email id");
	}
}
public class B1 extends B2
{
	void login()
	{
		super.login();
		System.out.println("Login is happneing with Mobile No");
	}
	public static void main(String[] args) 
	{
		B1 b1=new B1();
		b1.login();
	}
}
