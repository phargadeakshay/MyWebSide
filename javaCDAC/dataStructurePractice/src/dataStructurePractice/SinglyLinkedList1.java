package dataStructurePractice;

import java.util.Scanner;



public class SinglyLinkedList1 {
	
	Node1 head;
	
	Scanner sc = new Scanner(System.in);
	
	public SinglyLinkedList1()
	{
		this.head = null;
	}
	
	public void setHead(Node1 newNode1)
	{
		this.head = newNode1;
	}
   public Node1 createNode()
   {	Node1 newnode1 = new Node1();
   		System.out.println("\nEnter data:: ");
   		newnode1.setData(sc.nextInt());
   		newnode1.setNext(null);
	    return newnode1;
   }
   
   public void addAtStart()
   {
	   Node1 newnode1 = createNode();
	   
	   if (head == null) 
	   {
		head = newnode1;
	   }
	   else 
	   {
		newnode1.setNext(head);
		head = newnode1;
	   }
   }
	public void addAtEnd()
	{
		Node1 newnode = createNode();
		Node1 temp = head;
		
		if(head==null)
			head = newnode;
		else
		{
			
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			
			temp.setNext(newnode);
		}
	}
	
	public Node1 reverse()
	{  
		Node1 prev = null;
		Node1 current = head;
		Node1 forw =null;
		
		if(head == null)
		{
			return null;
		}
		else if (head.getNext() == null) 
		{
			
			return head;
		}
		while (current != null) {
			
			forw = current.getNext();
			current.setNext(prev);
			prev = current;
			current = forw;
			
		}
		head = prev;
		System.out.println("Linked List is Reversed....!!!");
		return head;
	}
	
//	public void addAtMid(int num)
//	{
//		Node1 temp=head;
//		Node1 newnode=createNode();
//		
//		if(head==null)
//		{
//			System.out.println("\tLinkedlist is empty.....!!!!");
//		}
//		else if(head.getNext()==null)
//		{
//			if(head.getData()==num) 
//			{
//				head.setNext(newnode);
//			}
//			else 
//				System.out.println("\tNode does not exists.....!!!");			
//		}
//		else
//		{
//			while(temp!=null && temp.getData()!=num)
//			{
//				temp = temp.getNext();
//			}
//			
//			if(temp==null)
//			{
//				System.out.println("\tNode does not exists.....!!!");
//			}
//			else 
//			{
//				newnode.setNext(temp.getNext());
//				
//				temp.setNext(newnode);
//			}				
//		}
//	}
//	
//	public void modify(int num)
//	{
//		Node1 temp=head;
//		Node1 tag=head;
//		Node1 newnode=createNode();
//		
//		if(head==null)
//		{
//			System.out.println("\tLinkedlist is empty.....!!!!");
//		}
//		else if(head.getNext()==null)
//		{
//			if(head.getData()==num) 
//			{
//				head= newnode;
//			}
//			else 
//				System.out.println("\tNode does not exists.....!!!");			
//		}
//		else
//		{
//			while(temp!=null && temp.getData()!=num)
//			{	tag = temp;
//				temp = temp.getNext();
//			}
//			
//			if(temp==null)
//			{
//				System.out.println("\tNode does not exists.....!!!");
//			}
//			else 
//			{
//				newnode.setNext(temp.getNext());
//				
//				tag.setNext(newnode);
//			}				
//		}
//		
//	}
//	
//	public void insertAtStart(int data)
//	{
//		Node1 node1 = new Node1();
//		node1.setData(data);
//		node1.setNext(null);
//		node1.setNext(head); 
//		head = node1;
//	}
	
//	public void addAtIndex(int index,int data)
//	{
//		Node1 node1 = new Node1();
//		node1.setData(data);
//		node1.setNext(null);
//		
//		if(index==0)
//		{
//			insertAtStart(data);
//		}
//		else{
//		Node1 n = head;
//		for(int i=0;i<index-1;i++)
//		{
//			n = n.getNext();
//		}
//		node1.setNext(n.getNext());
//		n.setNext(node1);
//		}
//	}
//	
	 
//		public void insertAtPos(int pos,int data)
//		{
//			Node1 node1 = new Node1();
////			node1.data = data;
//			node1.setData(data);
////			node1.next1 = null
//			node1.setNext(null);
//			
//			if(pos==0)
//			{
//				addAtStart();
//			}
//			else{
//			Node1 n = head;
//			for(int i=0;i<pos-1;i++)
//			{
//				n = n.getNext();
//			}
//			node1.setNext(n.getNext());
//			n.setNext(node1);
//			}
//		}
//	    public int getCount() {
//			Node1 temp = head;
//			int count = 0;
//			while (temp != null) {
//				count++;
//				temp = temp.getNext();
//			}
//			System.out.println("No. of elements in list are:=>  " + count);
//			return count;
//	    }
//	public void deleteAtStart()
//	{
//		if(head==null)
//		{
//			System.out.println("Linked List is empty....!!!");
//		}
//		else 
//		{
//			head = head.getNext();
//		}
//	}
//	
//	public void deleteAtEnd()
//	{
//		Node1 temp=head;
//		
//		if(head==null)
//			System.out.println("Linked List is empty....!!!");
//		else if(head.getNext()==null)
//		{
//			head = null;
//		}
//		else 
//		{
//			while(temp.getNext().getNext()!=null)
//			{
//				temp = temp.getNext();
//			}
//			
//			temp.setNext(null);
//		}
//	}
//	
//	public void deleteAtMid(int num)
//	{
//		Node1 temp = head,tag=head;
//		
//		if(head==null)
//			System.out.println("\tLinkedlist is empty");
//		else if(head.getNext()==null)
//		{
//			if(head.getData()==num)
//				head = null;
//			else
//				System.out.println("\tNode not found......!!!");
//		}
//		else
//		{
//			while(temp!=null && temp.getData()!=num)
//			{
//				tag=temp;
//				temp = temp.getNext();
//			}
//			if(temp==null)
//				System.out.println("\tNode not found.....");
//			else 
//			{
//			    tag.setNext(temp.getNext());
//			}
//		}
//	}
	public void display()
	{
		Node1 temp=head;
		if(head==null)
		{
			System.out.println("\tLinkedList is EMPTY.......!!!!");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.getData()+"->");
				temp  = temp.getNext();
			}
			System.out.print("NULL");
		}
	}
   }
