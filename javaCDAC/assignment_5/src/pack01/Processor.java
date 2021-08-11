package pack01;
import java.util.Scanner;
public abstract class Processor {
	
	protected int data;
	 public abstract void process();
	 public abstract void showData();
	
//	 public Processor(int data)
//	 {
//		 this.data = data;
//		
//	 }
	 
	 
	 
	public void newdata() 
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter value of data: ");
		 data = sc.nextInt();
	}	 
	
}
