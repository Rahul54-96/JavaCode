package module2;

public class ForLoop {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++)
		{
			if(i>5)
			{
				continue;
			}
			System.out.println(i);
		}
		
		
		Object o1=	new ForLoop();//Upcasting-Implicitely
		
		Object o2=(Object)new ForLoop();//Upcasting-Explicitely

		
	}
}
