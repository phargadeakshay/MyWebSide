
package singly_Linked_List;
import java.util.Scanner;

public class SinglyLinkedList{
	
	Node head;
	Scanner sc = new Scanner(System.in);
	
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public void setHead(Node newnode)
	{
		head = newnode;
	}
	
	public Node createNode()
	{
		Node newnode= new Node();
		System.out.println("\nEnter data:: ");
		newnode.setData(sc.nextInt());
		newnode.setNext(null);
		return newnode;
	}

	public void addAtStart()
	{
		Node newnode=createNode();
		
		if(head==null)  //LL is empty
			head = newnode;
		else //LL have head node and other nodes
		{
			newnode.setNext(head);
			head = newnode;
		}
	}
	
	public void addAtEnd()
	{
		Node newnode = createNode();
		Node temp = head;
		
		if(head==null) //LL is empty 
			head = newnode;
		else
		{
			//traverse and find the last node
			while(temp.getNext() != null)
				temp = temp.getNext();
			
			temp.setNext(newnode);
		}
	}
	
	public void addAtMid(int num)
	{
		Node temp=head;
		Node newnode=createNode();
		
		if(head==null)  //case 1
			System.out.println("\tLinkedlist is empty.....!!!!");
		else if(head.getNext()==null) //only single node exists
		{
			if(head.getData()==num)    //case 2
				head.setNext(newnode);
			else     //case 3
				System.out.println("\tNode does not exists.....!!!");			
		}
		else
		{
			while(temp!=null && temp.getData()!=num)
				temp = temp.getNext();
			
			if(temp==null)      //case 5
				System.out.println("\tNode does not exists.....!!!");
			else     //case 4
			{
				//connect newnode with the node next to temp
				newnode.setNext(temp.getNext());
				//connect temp with newnode
				temp.setNext(newnode);
			}				
		}//else
	}//func
	
	public void deleteAtStart()
	{
		if(head==null)
			System.out.println("Linked List is empty....!!!");
		else 
		{
			head = head.getNext();
		}
	}
	
	public void deleteAtEnd()
	{
		Node temp=head;
		
		if(head==null)
			System.out.println("Linked List is empty....!!!");
		else if(head.getNext()==null)//only one node exists
		{
			head = null;
		}
		else 
		{
			//traverse and find 2nd last node
			while(temp.getNext().getNext()!=null)
			{
				temp = temp.getNext();
			}
			//temp is referring 2nd last node
			temp.setNext(null);
		}
	}
	
	public void deleteAtMid(int num)
	{
		Node temp = head,tag=head;
		
		if(head==null)
			System.out.println("\tLinkedlist is empty");
		else if(head.getNext()==null)
		{
			if(head.getData()==num)
				head = null;
			else
				System.out.println("\tNode not found......!!!");
		}
		else
		{
			//traverse and find the node with value num
			while(temp!=null && temp.getData()!=num)
			{
				tag=temp;
				temp = temp.getNext();
			}
			if(temp==null)
				System.out.println("\tNode not found.....");
			else  //connect temp with the node next to that node which we are deleting
			{
			    tag.setNext(temp.getNext());
			}
		}
	}//deleteMid
	
	public void display()
	{
		Node temp=head;
		if(head==null)
			System.out.println("\tLinkedList is EMPTY.......!!!!");
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.getData()+"->");
				temp  = temp.getNext();
			}
			System.out.print("NULL");
		}
	}//display

	
}//class











