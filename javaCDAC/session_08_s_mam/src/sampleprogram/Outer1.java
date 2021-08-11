package sampleprogram;
//Nested static Class
public class Outer1 {
	static class Inner1
	{
		static void m1()
		{
			System.out.println("Inner 1 class method is Running");
		}
		static class Inner2
		{
			static void m2()
			{
				System.out.println("Inner2 class method is running .... ");
			}
		}
		
	}

	public static void main(String[] args)
	{
		Outer1 o1 = new Outer1();
		Outer1.Inner1.m1();
		Outer1.Inner1.Inner2.m2();
		
		
	}
	
}
