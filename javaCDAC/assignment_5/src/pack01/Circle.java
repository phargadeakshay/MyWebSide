package pack01;

import java.util.Scanner;

public class Circle extends Processor {

	final float pi = 3.14f;
	protected float area;
	
//	public Circle(int data) 
//	{
//	super(;	
//	}
	
	@Override
	public void process() 
	{   newdata();
		area = pi * data * data;
//		System.out.println("Area of circle is = "+area);
	}
	
	 public void showData()
	 {		
		 System.out.println("Area of circle is = "+area);
	 }
	
}
