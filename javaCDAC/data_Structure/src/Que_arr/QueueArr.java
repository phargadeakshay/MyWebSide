package Que_arr;

import java.util.Scanner;

public class QueueArr {
	
	private int size;
	private int[] que;
	private int front;
	private int rear;
	

	Scanner sc = new Scanner(System.in);
	
//	public QueueArr()
//	{
//		size = 0;
//		que = new int[size];
//		front = rear =-1;
//	}
	public void initQueue()
	{    size = 0;
		System.out.println("Enter size");
		size = sc.nextInt();
		que = new int[size];
		front = rear = -1;
	}
	
	public boolean isFull()
	{
		if(rear == size-1)
			
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
		else
		{
			return false;
		}
	}
	public void enQueue(int value)
	{
		if(!isFull())
		{
			rear++;
			que[rear]= value;
		}
		else {
			System.out.println("\tQueue is full ...!!");
		}
		
	}
	public int deQueue()
	{
	int value = -1;
	if(!isEmpty())
	{
		front ++;
		value = que[front];
		return value;
	}
	else
	{
		System.out.println("\nqueue is Empty....");
				return value;
	}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("\nQueue is Empty....!!!");
		}
		else {
			for(int i = front+1; i<=rear;i++)
			{
				System.out.println("\t"+que[i]);
				
			}
		}
	}
}
