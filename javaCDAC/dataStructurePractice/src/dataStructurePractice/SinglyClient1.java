package dataStructurePractice;

import java.util.Scanner;

public class SinglyClient1 {
	static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
	    
	   SinglyLinkedList1 sl = new SinglyLinkedList1();
	    int ch =1,num;
	    
	   
	
	do {
		System.out.println("\n1------------------Menu------------------1");
		System.out.println("1:Start"
				          +"\n2:AddatStart"
				          +"\n3:AddatEnd"
				          +"\n4:AddAtMid"
				          +"\n5:DeletAtStart"
				          +"\n6:DeleteAtEnd"
				          +"\n7:DeteAtMid"
				          +"\n8:Modify"
				          +"\n9:reverse"
				          +"\n10:getCount"
				          +"\n11:AddAtPosition"
				          +"\n99:Display"
				          +"\n0:Exit");
		System.out.println("\n Enter Your choise::");
		ch = sc.nextInt();
		switch (ch) {
		case 1: 
		{
			System.out.println("\tNew LinkedList Instantiated.....!!");
			sl.setHead(sl.createNode());
			break;	
		}
		case 2:
		{
			sl.addAtStart();
			break;
		}
		case 3:
		{ 
			sl.addAtEnd();
			break;
		}
//		case 4:
//		{
//			System.out.println("Enter node atter which we want to add: ");
//		    num = sc.nextInt();
////		    sl.addAtMid(num);
//		    break;
//		}
//		case 5:
//		{
////			sl.deleteAtStart();
//			break;
//		}
//		case 6:
//		{
////			sl.deleteAtEnd();
//			break;
//		}
//		case 7:
//			System.out.println("Enter node which you want to delete: ");
//			num = sc.nextInt();
////			sl.deleteAtMid(num);
//			break;
//		case 8:
//		{
//			System.out.println("Enter node atter which we want to replace: ");
//		    num = sc.nextInt();
////		    sl.modify(num);;
//		    break;
//		}
		case 9:
		{
			sl.reverse();
			break;
		}
//		case 10:
//		{
////			sl.getCount();
//			break;
//		}
//		case 11:
//		{   System.out.println("enter position and data");
//			int index = sc.nextInt();
//		   int data1= sc.nextInt();
////			sl.addAtIndex(index,data1);
//		}
		
		
		case 99:
		{
			sl.display();
			break;
		}
		case 0:
		{
			System.exit(0);
		}
		}
	} while (ch != 0);
}
}
