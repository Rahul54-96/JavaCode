package moduke3;
class X3
{
	
}
class X2 extends X3
{
	
}
public class X1 extends X2
{
	public static void main(String[] args) 
	{
		X3 z1=new X2();//upcasting implicitely
		/*X3:Yes
		 * X2:No
		 * X1:No
		 * Object:Yes
		 */
		X2 z2=(X2) z1;//Downcastig explicitely
		/*X3:Yes
		 * X2:Yes
		 * X1:No
		 * Object:Yes
		 */
		
	}
}
