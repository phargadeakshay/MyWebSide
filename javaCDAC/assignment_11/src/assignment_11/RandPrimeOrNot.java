package assignment_11;
import java.util.Random;   
public class RandPrimeOrNot {
	
	
	public static void main(String args[])   
	{   
	  Random rand = new Random();  
	int i = rand.nextInt(100);
	System.out.println(" Random Number: " + i);   
	 if ((i%2==0 && i!=2) || (i%3==0 && i!=3)|| (i%7==0 && i!=7) || (i%5==0 && i!=5) || i==1) 
	   {
		 System.out.println("The given Random Number is NOT Prime Number");
	   }
   else
       {
			System.out.println(" Random number is prime Prime number");
       }
	
	
	
	}   
}  
