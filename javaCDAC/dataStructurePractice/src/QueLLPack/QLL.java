package QueLLPack;

public class QLL {
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
	public void enQueue(int data)
	{
		Node newnode = new Node();
		newnode.setData(data);
		newnode.setNext(null);
		
		if(isEmpty())
		{
			front = rear = newnode;
			
		}
		else
		{
			rear.setNext(newnode);
			rear = newnode;	
		}
	}
	public int deQueue()
	{
		if(front !=null)
		{   
			int value = front.getData();
			Node temp =front;
			front = front.getNext();
			temp = null;
			return value;
			
		}
		else
		{
			System.out.println("Queue is empty..!!");
			return -1;	
		}
		
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Quiue is Empty..");
		}
		else
		{   Node temp = front;
			while(temp != null)
			{
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}
}

