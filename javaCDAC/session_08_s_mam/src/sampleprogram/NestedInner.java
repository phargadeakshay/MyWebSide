package sampleprogram;

public class NestedInner {
	public class Inner1{
		public class Inner2
		{
			public void m2()
			{
				System.out.println("Nested Inner class Method");
			}
		}
	}
	public static void main(String[] args)
	{
		NestedInner n1 = new NestedInner();
		NestedInner.Inner1 n2 = n1.new Inner1();
		NestedInner.Inner1.Inner2 n3 = n2.new Inner2();
		n3.m2();
	}

}
