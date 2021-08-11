package pack01;
import java.util.Scanner;

public class Factorial extends Processor{
	
      protected int fact;
     
//     public Factorial(int data)
//     {
//    	 super(data);
//     }   
  @Override
	public void process() 
	{
	     newdata();
		fact = 1;	  
		for (int i = 1; i <= data ; i++) 
		{   
			fact= fact * i;
			
		}
//		System.out.println("Factorial is = "+fact);
		
	}
	 public void showData()
	 {		
		 System.out.println("Factorical =" +fact);

	 }

	}



