package Que_arr;

import java.util.Scanner;

public class Queue_client {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	QueueArr a = new QueueArr();
	int ch=1,value;
	
	do
	{
		System.out.println("1:Start"
							+"\n2:EnQueue"		
							+"\n3:Dequeue"	
							+"\n4:Display"	
							+"\n0Exit");
		System.out.println("Enter your choise:: ");
		ch = sc.nextInt();
	switch (ch) {
	case 1:
		System.out.println("\nNew Queue Instantiated.....!!!");
		a.initQueue();
		break;
	case 2:
		System.out.println("Enter value to insert: ");
		value = sc.nextInt();
		a.enQueue(value);
		break;
	case 3:
	{
		value = a.deQueue();
		if(value != -1)
		{
			System.out.println("\tDequeued:: "+value);
			break;
		}
	}
	case 4:
	{
		System.out.println("--------------Queue---------");
		a.display();
		System.out.println("\n...................");
		break;
	}
	case 0:
	{
		System.exit(0);
	}
	
	
	}
	}while(ch != 0);
	sc.close();
}
}

