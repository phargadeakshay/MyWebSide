package inheritance;

public class D extends C{

	public void m1()
	{
		System.out.println("In m1() of D");	
	}
	public void m2()
	{
		System.out.println("In m2 of D");
	}
	
	public static void main(String[] args)
	{
		D d = new D();
		d.m1();
		d.m2();
		
		
	C c= new D(); //Dynamic method dispatch in java
	c.m1();
	((D) c).m2(); // Downcasting In order to call sub class specific method 
	//downCast the reference from super to sub
	//D d = new c();
	}
}
