import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args)
	{
	   int prv=0,pre=1,trm;
	   System.out.println("Input number of terms to  display : ");
	   Scanner s = new Scanner(System.in);
	   int n = s.nextInt();
	   System.out.println("Here is the Fibonacci series upto  to terms : \n");
	   System.out.print(+prv+"\t" +pre+"\t");
	   for(int i=3;i<=n;i++)
	   {
	      trm=prv+pre;
	      System.out.print(trm+"\t");
	      prv=pre;
	      pre=trm;
	   }
	   System.out.println("\n");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
