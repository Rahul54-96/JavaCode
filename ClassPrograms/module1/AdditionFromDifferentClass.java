package module1;
public class AdditionFromDifferentClass 
{
	public static void main(String[] args) 
	{
		AdditionProgram.add(45, 90);
		AdditionProgram.add(45.9, 90);
		AdditionProgram.add(45, 90.1);
		AdditionProgram.add(45.6, 90.9);
		AdditionProgram2 a1=new AdditionProgram2();
		a1.add(45, 96);
		a1.add(90.6, 96.4);
		
		new AdditionProgram2();
		
		
	}
}
