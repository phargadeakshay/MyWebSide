package packP;

import java.util.Scanner;

public class MathOperation {
	
	
	public int x,y,r;
	Scanner s = new Scanner(System.in);
	
	public void init()
	{
		System.out.println("Enter The value");
		 x=s.nextInt();
		 y=s.nextInt();
	}
	public void multiplay()
	{  
		r = x*y;
		display();
		
	}
	public void add()
	{   
		r = x + y;
		display();
	}
	
	public void display()
	{
		System.out.println(r);
	}

}
