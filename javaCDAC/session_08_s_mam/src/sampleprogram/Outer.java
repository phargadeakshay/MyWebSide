package sampleprogram;

public class Outer {
	public class Inner{
		public void method() {
			System.out.println("Inner Method is running");
		}
	}

	public static void main(String[] args)
	{
		Outer o1 = new Outer();
		Outer.Inner i1 = o1.new Inner();
		i1.method();
	}
}
