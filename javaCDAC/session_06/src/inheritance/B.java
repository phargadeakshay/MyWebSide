package inheritance;

public class B extends  A{
	@Override
	public void m1()
	{
		System.out.println("In m1() of B");
		
	}
	public static void main(String[] args)
	{
		B b = new B();
		b.getNo();
		b.m1();
		
	}

}
