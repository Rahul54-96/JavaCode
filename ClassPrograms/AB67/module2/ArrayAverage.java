package module2;

public class ArrayAverage
{
	public static void main(String[] args) 
	{
		double [] values=new double[4];
		values[0]=55;
		values[1]=55;
		values[2]=60;
		values[3]=40;
		double sum=0;
		double average;
		
		for(int i=0;i<values.length;i++)
		{
			sum=sum+values[i];
			/*i=0;sum=45
			 * i=1,sum=100
			 * i=2,sum=160
			 * i=3,sum=200
			 */
		}
		average=sum/values.length;
		System.out.println(average);
		
	}
}
