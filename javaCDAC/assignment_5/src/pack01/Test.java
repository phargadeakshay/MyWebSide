package pack01;

import java.util.Scanner;

public class Test{

	public static void main(String[] args)
	{  
		
int r;
Scanner sc = new Scanner(System.in);
do {
	
	System.out.println("Enter your choise");
	System.out.println("1.Area of Circle");
	System.out.println("2.Factorial");
	int ch = sc.nextInt();
//	Processor c;
	if(ch==1)
	{
		Processor c = new Circle();
		c.process();
		c.showData();
	}
	else if (ch==2)
	{
	 Processor c= new Factorial();
	    c.process();
	    c.showData();
	}
	else 
	{
	System.out.println("Wrong choise");	
	}
	System.out.println();
	System.out.println("1.continue again\n0.exit");
	
	 r= sc.nextInt();
	
} while( r!= 0);
System.out.println("Program exit Thank You");
	}

}
