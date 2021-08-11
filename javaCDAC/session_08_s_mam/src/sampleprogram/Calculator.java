package sampleprogram;
// 
public class Calculator {
	
	public void demo()
	{
		class Addition
		{
			public void add() 
			{
				int a = 10;
				int b = 20;
				int c = a + b;
				System.out.println("The Additions of two number is ="+c);	
			}
		}
		Addition n1 = new Addition();
		n1.add();
		
	}
	
	public static void main(String[] agrs)
	{
	Calculator c = new Calculator();
	
	c.demo();
	}

}
