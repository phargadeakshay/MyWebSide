package inheritance;

public class Child extends Parent{
	
	public Child()
	{
//		super()
		System.out.println("Child class default Constructor Invoked");
		
	}
	
	public Child(int a)
	{
		super(56);
		System.out.println("Child class Parameterize Constructor Invoked");
		
	}

	public static void main(String[] args)
{
	Child c =new Child(10);
}
}
