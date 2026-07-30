package module1;
public class SwitchCase 
{
	public static void main(String[] args) 
	{
		int input=2;//Select what u wish to do
		switch(input)
		{
		case 1: System.out.println("Launch Chrome Browser");
				break;			
		case 2: System.out.println("Launch Mozilla Browser");
				break;
		case 3: System.out.println("Launch Safari Browser");
				break;
		case 4: System.out.println("Launch Edge Browser");
				break;
		default:
			System.out.println("Sorry your selection Wrong ");
		
		}
		
		
	}
}
