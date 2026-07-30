package module2;
public class CheckIf100IsPartOfArray 
{
	public static void main(String[] args) 
	{
		int [] arrayinput=new int[4];
		arrayinput[0]=45;
		arrayinput[1]=50;
		arrayinput[2]=100;
		arrayinput[3]=14;
		int numberToCheck=100;
		for(int i=0;i<arrayinput.length;i++)
		{
		if(numberToCheck==arrayinput[i])
		{
			System.out.println("The value is present " +"At the index possition ->"+i);
		}
		
		}
		
	}
}
