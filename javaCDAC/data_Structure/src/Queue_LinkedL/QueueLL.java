package Queue_LinkedL;

public class QueueLL {
Node front,rear;

public boolean isEmpty()
{
	if(front == null && rear == null)
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
	Node newnode = new Node();
	newnode.setData(value);
	newnode.setNext(null);
	
	if(isEmpty())
	{
		front =rear=newnode;
	}
	else
	{
	    rear.setNext(newnode);
	    rear = newnode;
	}
}

 public int deQueue()
 {
	 if(!isEmpty())
	 {
		 int value = front.getData();
		 Node temp = front;
		 front = front.getNext();
		 temp.setNext(null);
	      if(front==null)
	      {
			rear=null;
	      }
		 return value;
	 }
	 else
	{
		 System.out.println("Queue is Empty....!!!");
		return -1;
	}
 }
 
 public void diplay()
 {
	 if(isEmpty())
	 {
		 System.out.println("Queue is Empty");
	 }
	 else
	 {  Node temp =front;
	    
	 
		 while (temp != null) 
		 {
			System.out.println("\t"+temp.getData());
			temp =temp.getNext();
		 }
	 }
 }
 
}
