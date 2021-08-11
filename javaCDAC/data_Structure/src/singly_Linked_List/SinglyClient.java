package singly_Linked_List;

import java.util.Scanner;

public class SinglyClient {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SinglyLinkedList sll = new SinglyLinkedList();
	int ch=1,num;
	
	do
	{
		System.out.println("\n------------------Menu------------------");
		System.out.println("1:Start"
				          +"\n2:AddatStart"
				          +"\n3:AddatEnd"
				          +"\n4:AddAtMid"
				          +"\n5:DeletAtStart"
				          +"\n6:DeleteAtEnd"
				          +"\n7:DeteAtMid"
				          +"\n99:Display"
				          +"\n0:EXIT");
		System.out.println("Enter choice");
		ch = sc.nextInt();
	
		switch(ch)
		{
		case 1:
			System.out.println("\tNew LinkedList instantiated......!!!!!");
			sll.setHead(sll.createNode());
			break;
		case 2:
			sll.addAtStart();
			break;
		case 3:
			sll.addAtEnd();
			break;
		case 4:
			System.out.println("Enter node after which to add::  ");
			num = sc.nextInt();
			sll.addAtMid(num);
			break;
		case 5:
			sll.deleteAtStart();
			break;
		case 6:
			sll.deleteAtEnd();
			break;
		case 7:
			System.out.println("Enter node to delete::  ");
			num = sc.nextInt();
			sll.deleteAtMid(num);
		case 99:
			System.out.println("\n---------------------LinkedList------------------\n");
			sll.display();
			System.out.println("\n\n-------------------------------------------------");
			break;
		case 0:
			System.exit(0);
		}//switch
		
		
	}while(ch!=0);

	}//main

}//class
