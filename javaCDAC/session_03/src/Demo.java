import java.util.*;
public class Demo {
	
	public static void factorial(int no) {
		int fact = 1;
		for(int i = 1;i<= no;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorical of " +no+" = "+fact);
		
	}
	
	
	public static int factoriall(int no)
	{
		int fact=1;
		for(int i = 1;i<= no;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	
	
	
      public static void main(String[] args) {
    	  Scanner s = new Scanner (System.in);
    	  int no = s.nextInt();
    	  factorial(no);
    	  factoriall(no);
    	  System.out.println("Factorial of " +no+" = " +factoriall(no));
      }
}
