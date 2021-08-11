package Qpack;

import java.util.Scanner;

public class QueArr {
	
	private int size;
	private int qu[];
	private int front;
	private int rear;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	public void initQue()
	{
		size = 0;
		System.out.println("Ente the size of Queue: ");
		size=sc.nextInt();
		qu = new int[size];
		front =rear =-1;
	}
	public boolean isFull()
	{
		if(rear ==size-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(front == rear)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enQueue(int value)
	{ 
		if(!isFull())
		{
		rear++;
		qu[rear] =value;
		}
		else
		{
			System.out.println("Queue is Full...");
		}
	}
	public int deQueue()
	{   
		int value =-1;
		if(!isEmpty())
		{
			front++;
			value = qu [front];
			return value;
			
		}
		else
		{
			System.out.println("Queue is Empty...");
			return value;	
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty..!!!");
		}
		else 
		{
			for (int i = 0; i < qu.length; i++) 
			{
				System.out.println("\t"+ qu[i]);
			}
		}
	}
}

