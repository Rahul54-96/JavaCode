package module2;

import java.util.Arrays;

public class StringFunctionProblem 
{
	public static void main(String[] args) 
	{
		String a="my name is ram and i study in class 10";
		
		//output: [my,name,is,ram]
		String [] s1=	a.split(" ");
		System.out.println(Arrays.toString(s1));
		
		String [] s2=	a.split(" ", 4);
		System.out.println(Arrays.toString(s2));
	}
}
