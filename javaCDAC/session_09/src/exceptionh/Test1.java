package exceptionh;

public class Test1 extends A
{
        
	public static void main(String[] args) {
		A a = new A();
		int d = a.div(1,2);
		
		if (d<1) 
		{
			try 
			{
				throw new MyException();
				
			} 
			catch (MyException e) 
			{
			System.out.println(e);
			}
		}
	}
}
