package module1;
public class ForLoop 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<6;i++)//2=2
		{
			for(int j=1;j<6;j++)//2
			{
				System.out.print(i);
				System.out.println(j);
			}
		}
	}
}
/*
i=1,true,j=1,true=11
i=1,true,j=2,true=12
i=1,true,j=3,false
i=2,true,j=1,true=21
i=2,true,j=2,true=22
 11
 12
 13
 14
 15
 
 21
 22
 23
 24
 25

*/