package exceptionh;

public class Demo {
	
	public static void main(String[] args) {
		int a,b,c=0;
		try {
			a =Integer.parseInt(args[0]);
			b= Integer.parseInt(args[1]);
			c= a/b;
			System.out.println("c = "+c);
		} catch (ArithmeticException e) {
			System.out.println("Denominato should not be zero");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Please Atleast enter two numbers");
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Please enter noly integer value");
		}
		catch (Exception e) 
		{
			System.out.println("Some error occurred");
		}
   }
}
			