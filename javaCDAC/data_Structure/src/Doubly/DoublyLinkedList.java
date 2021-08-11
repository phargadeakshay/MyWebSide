package Doubly;

import java.util.Scanner;

public class DoublyLinkedList {

	Scanner sc = new Scanner(System.in);
	Node head;
	
	public DoublyLinkedList()
	{
		head = null;
	}
	
	public void setHead(Node newnode)
	{
		head = newnode;  
	}
	
	public Node createNode()
	{
		Node newnode =  new Node();
		System.out.println("\nEnter newnode data:: ");
		newnode.setData(sc.nextInt());
		return newnode;
	}
	
	public void addAtStart()
	{
		Node newnode = createNode();
		
		if(head==null) 
			head = newnode;
		else
		{
			newnode.setNext(head);  
			head.setPrev(newnode); 
			head = newnode; 
		}
	}
	
	public void addAtEnd()
	{
		Node newnode = createNode();
		
		if(head == null)  
			head = newnode;
		else
		{ 
			Node temp=head;
			while(temp.getNext()!=null)
				temp = temp.getNext();
		
			temp.setNext(newnode);  
			newnode.setPrev(temp);  		
		}
	}
    public int getCount() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		System.out.println("No. of elements in list are:  " + count);
		return count;
    }
	
	public void addAtMid(int num)
	{
		Node newnode=createNode();
		if(head==null)
			System.out.println("\tLinkedList is EMPTY.......!!!!");
		else if(head.getNext()==null)
		{
			if(head.getData()==num)
				head.setNext(newnode);
			else
				System.out.println("\tNode not available ");
		}
		else
		{
			Node temp=head;
			while(temp!=null && temp.getData()!=num)
				temp = temp.getNext();
			if(temp==null)
				System.out.println("\tNode does not exists");
			else
			{
				newnode.setNext(temp.getNext());
				temp.getNext().setPrev(newnode);
				temp.setNext(newnode);
				newnode.setPrev(temp);
			}
		}
	}
	public void modify(int num)
	{   Node newnode = createNode();
		 Node temp = head;
		 Node tag = head;
		if(head == null)
		{
			System.out.println("\nLinked List is Empty...!");
		}
		else if(head.getNext()==null)
		{
		    if(head.getData() ==num)
		    {
		    	head = newnode;
		    }
		    else
		    {
		    	System.out.println("Node not Found");
		    }
		}
		else
		{ 
			
			while(temp!= null && temp.getData()!= num)
		    {     
				tag=temp;
				temp = temp.getNext();
					
	     	}
		   if(temp ==null)
		   {
			   System.out.println("Node not Found..!");
		   }
		   else 
		   {
			  newnode.setNext(temp.getNext());
			  newnode.setPrev(temp.getPrev());
			  tag.setNext(newnode);
			  temp.getNext().setPrev(newnode);
		   }
		}
	}
	
	public void addAtIndex(int index)
	{
		Node newnode = createNode();
		Node temp = head;
		if(head==null)
		{
			head = newnode;
		}
		else 
		{	int i =0;
		 while(temp != null && i != (index-1))
		  {
		  for( i=0;i<index-1;i++)
		  {
			temp = temp.getNext();
		  }
		  }
		 if (temp == null)
		 {
			System.out.println("\nLinked is short given position is not present");
		 }
		 else 
		 {		
		  newnode.setNext(temp.getNext());
		  newnode.setPrev(temp);
		  temp.setNext(newnode);
		  temp.getNext().setPrev(newnode);
		 }
		 }
	}
	
	public void deleteAtStart()
	{
		if(head==null)
			System.out.println("LinkedList is EMPTY.........!!!");
		else 
		{
			head = head.getNext();
			if(head!=null)
				head.setPrev(null);
		}
	}
	
	public void deleteAtEnd()
	{
		if(head==null)
			System.out.println("LinkedList is EMPTY.........!!!");
		else if(head.getNext()==null)
			head =null;
		else
		{
			Node temp=head;
			while(temp.getNext().getNext()!=null)
				temp = temp.getNext();
			temp.setNext(null);
		}
			
	}
	
	public void deleteAtMid(int num)
	{
		if(head==null)
			System.out.println("\tLinkedList is EMPTY.......!!!!");
		else if(head.getNext()==null)
		{
			if(head.getData()==num)
				head=null;
			else
				System.out.println("\tNode not available");
		}
		else
		{
			Node temp=head;
			while(temp!=null && temp.getData()!=num)
				temp = temp.getNext();
			if(temp==null)
				System.out.println("\tNode not found....!!!!");
			else
			{
				temp.getPrev().setNext(temp.getNext());
				temp.getNext().setPrev(temp.getPrev());			
		    }
		}
	}
	
	public void display()
	{
		if(head==null)
			System.out.println("\tLinkedList is EMPTY.......!!!!");
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.getData()+"<-->");
				temp  = temp.getNext();
			}
			System.out.print("NULL");
		}
	}
	
}














