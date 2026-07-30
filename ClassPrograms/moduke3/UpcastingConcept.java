package moduke3;
class B
{
	
}
public class UpcastingConcept extends B
{
	public static void main(String[] args) 
	{
		B b1=	new UpcastingConcept();//upcasting impliictely
		//B and Object Class I can access
		
	//	B b2=(B)	new UpcastingConcept();//upcasting explictely

		UpcastingConcept u1=(UpcastingConcept)b1;
		//Can Access Parent,CHild and also Object
		
	}
}
