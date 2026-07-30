package module2;
public class SpecialALphaNumeric 
{
	static int countOfAlpha=0;
	static int countOfNumeric=0;
	static int countOfSpace=0;
	static int countOfSpecailChar=0;

	public static void main(String[] args) 
	{
		String input="k v no 2 ^%$";
		char []c1=	input.toCharArray();
		for(int i=0;i<input.length();i++)
		{
		boolean b1=	Character.isAlphabetic(c1[i]);
		//System.out.println(b1);
			if(b1)
			{
				countOfAlpha++;
			}
			
			boolean b2=	Character.isDigit(c1[i]);//numeric
			if(b2)
			{
				countOfNumeric++;
			}
			boolean b3=	Character.isWhitespace(c1[i]);//space
			if(b3)
			{
				countOfSpace++;
			}
		}
		System.out.println("Alphabet Count is ->"+countOfAlpha);
		System.out.println("Numeric Count is ->"+countOfNumeric);
		System.out.println("Space Count is ->"+countOfSpace);
		countOfSpecailChar=input.length()-(countOfAlpha+countOfNumeric+countOfSpace);
		System.out.println("Special Char Count is ->"+countOfSpecailChar);

		
	}
}
