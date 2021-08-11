package Doubly;


import java.util.Scanner;

public class DoublyLL_Client {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
	DoublyLinkedList dll = new DoublyLinkedList();
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
				          +"\n8:Modify"
				          +"\n9:Add At Index"
				          +"\n11:getCount"
				          +"\n99:Display"
				          +"\n0:EXIT");
		System.out.println("Enter choice");
		ch = sc.nextInt();
	
		switch(ch)
		{
		case 1:
			System.out.println("New LinkedList instantiated......!!!!!");
			dll.setHead(dll.createNode());
			break;
		case 2:
			dll.addAtStart();
			break;
		case 3:
			dll.addAtEnd();
			break;
		case 4:
			System.out.println("Enter node after which to add::  ");
			num = sc.nextInt();
			dll.addAtMid(num);
			break;
		case 5:
			dll.deleteAtStart();
			break;
		case 6:
			dll.deleteAtEnd();
			break;
		case 7:
			System.out.println("Enter node to delete::  ");
			num = sc.nextInt();
		    dll.deleteAtMid(num); 
		case 8:
			System.out.println("Enter the node which you want to delete:");
			num= sc.nextInt();
			dll.modify(num);
			break;
		case 9:
			System.out.println("Enter The Index Where you want to add...!!");
			int index = sc.nextInt();
			dll.addAtIndex(index);
			break;
		case 11:
			dll.getCount();
			break;
		case 99:
			System.out.println("\n---------------------LinkedList------------------\n");
			dll.display();
			System.out.println("\n\n-------------------------------------------------");
			break;
		case 0:
			System.exit(0);
		}//switch
		
		
	}while(ch!=0);

	}//main
}

