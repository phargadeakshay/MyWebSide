package Stackpack;

import java.util.Scanner;

public class StackArr {
	private int size;
	private int St[];
	private int top;
	
	Scanner sc = new Scanner(System.in);
	public void initStack()
	{
		top =-1;
		size = 0;
		System.out.println("Enter Size of Stack: ");
		size = sc.nextInt();
		St = new int[size];
		
	}
	public boolean isEmpty()
	{
		if(top ==-1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean isFull()
	{
		if(top ==size -1)
		{
		  return true;
		}
		else
		{
			return false;
		}
	}
	public void push(int data)
	{
		if(!isFull())
		{
			top ++;
			St[top] =data;
		}
		else 
		{
			System.out.println("Stack is Full......!!!");
		}
	}
	public int pop()
	{
		
		if(isEmpty())
		{
			System.out.println("Stack is Empty....!!!!!");
			return -1;
		}
		else 
		{
			int value = St[top];
			top--;
			return value;
		}
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty...!!!");
		}
		else
		{
		   for(int i=top; i>=0;i--)
			{
				System.out.print("\t"+St[i]);
			
			}
		}
	}

}
