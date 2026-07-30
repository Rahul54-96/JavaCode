package module2;

import java.util.Arrays;

public class ArrayProblem1 
{
	public static void main(String[] args) 
	{
		//datatype [] variable=new datatype [size];
		
		int [] rollno=new int[5];
		rollno[0]=11;
		rollno[1]=53;
		rollno[2]=40;
		rollno[3]=63;
		rollno[4]=5;
		System.out.println(Arrays.toString(rollno));

		String [] name=new String[5];
		name[0]="Ram";
		name[1]="Sham";
		name[2]="Hari";
		name[3]="Muskan";
		name[4]="Priya";
		System.out.println(Arrays.toString(name));

		char [] initial=new char[5];
		initial[0]='A';
		initial[1]='W';
		initial[2]='P';
		initial[3]='Q';
		initial[4]='X';
		System.out.println(Arrays.toString(initial));
		
		
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("My Name is:->"+name[i]+" My Initial is->"+initial[i]+" My rollNo is ->"+rollno[i]);
		}
		
		
		

	}
}
