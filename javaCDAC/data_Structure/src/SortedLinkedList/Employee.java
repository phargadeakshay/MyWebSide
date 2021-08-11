package SortedLinkedList;

import java.util.Scanner;

import singly_Linked_List.Node;
public class Employee {
	Node head;
	Scanner sc = new Scanner(System.in);
	public void setHead(Node newnode)
	{
		head = newnode;
	}

	
	public Node createNode()
	{
		Node newnode = new Node();
		System.out.println("Enter The Data: ");
		newnode.setData(sc.nextInt());
		System.out.println("Enter the Salary: ");
		newnode.setSal(sc.nextInt());
		System.out.println("Enter the Name: ");
		newnode.setName(sc.next());
		newnode.setNext(null);
		return newnode;
		
	}
	
	public void addBySortedId()
	{
		Node newnode = createNode();
		Node temp = head;
		if(head==null)
		{
			head = newnode;
		}
		else if(head.getNext() ==null)
		{
			if(head.getData() < newnode.getData())
			{
				head.setNext(newnode);
			}
			else
			{
				newnode.setNext(head);
				head = newnode;
			}
		}
		else if(head !=null &&head.getData()>newnode.getData()) 
		{
			newnode.setNext(head);
			head =newnode;
		}
		else 
		{	
			Node tag = temp.getNext();
			while(temp.getNext() !=null && (!(temp.getData()<= newnode.getData())) && !(tag.getData()>=newnode.getData()))
			{   
				
				temp= temp.getNext();
				tag =temp.getNext();
				
			}
			if(temp.getNext() ==null)
			{
				temp.setNext(newnode);
			}
			
			else if(temp.getData()<= newnode.getData() && tag.getData()>=newnode.getData())
			{
				newnode.setNext(temp.getNext());
				temp.setNext(newnode);		
			}
			
		}
		
	}
	   public void sortList()
	    {
	  
	       
	        Node current = head, index = null;
	  
	        Node temp =null;
	  
	        if (head == null) {
	           System.out.println("List is Empty...");
	        }
	        else {
	            while (current != null) {
	                
	                index = current.getNext();
	  
	                while (index != null) {
	                    
	                    if (current.getSal() > index.getSal()) {
//	                        temp.setSal(current.getSal());
//	                        current.setSal(index.getSal());
//	                        index.setSal(temp.getSal());
//	                    	temp =current;
//	                    	current =index;
//	                    	index =temp;
	                    	temp.setNext(current.getNext());
	                    	temp= current;
	                    	
	                    	current.setNext(index.getNext());
	                    	current =index;
	                    	
	                    	index.setNext(temp.getNext());
	                    	index =temp;
	                    }
	  
	                    index = index.getNext();
	                }
	                current = current.getNext();
	            }
	        }
	       System.out.println("Sortedd.......");
	    }
	public void display()
	{
		Node temp=head;
		if(head==null)
			System.out.println("\tLinkedList is EMPTY.......!!!!");
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.getData()+"->"+temp.getSal()+"->"+temp.getName()+"\n");
								
				temp  = temp.getNext();
			}

		}
	}
}
