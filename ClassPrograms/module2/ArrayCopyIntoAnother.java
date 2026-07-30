package module2;
import java.util.Arrays;

public class ArrayCopyIntoAnother
{
	public static void main(String[] args) 
	{
		String [] name1=new String[5];
		name1[0]="Ram";
		name1[1]="Sham";
		name1[2]="Hari";
		name1[3]="Muskan";
		name1[4]="Priya";
		System.out.println(Arrays.toString(name1));
		
		String [] name2=new String[5];
		for(int i=0;i<name1.length;i++)
		{
		name2[i]=name1[i];
		}
		System.out.println("1st Array->"+Arrays.toString(name1));
		System.out.println("Copied Array->"+Arrays.toString(name2));

	}
}
