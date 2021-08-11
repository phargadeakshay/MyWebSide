package linkedList1;

public class LinkedMaster 
{
	Node1 head;

	public void insert(int data)
	{
		Node1 node1 = new Node1();
		node1.data = data;
		node1.next1 = null;
		
		if(head==null)
		{
			head = node1;
		}
		else
		{
			Node1 tem = head;
			while(tem.next1!=null)
			{
				tem = tem.next1;
			}
			tem.next1 =  node1;
		}
		
	}
	public void insertAtStart(int data)
	{
		Node1 node1 = new Node1();
		node1.data = data;
		node1.next1 = null;
		node1.next1 = head;
		head = node1;
	}
	
	public void insertAt(int index,int data)
	{
		Node1 node1 = new Node1();
		node1.data = data;
		node1.next1 = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else{
		Node1 n = head;
		for(int i=0;i<index-1;i++)
		{
			n = n.next1;
		}
		node1.next1 = n.next1;
		n.next1 = node1;
		}
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next1;
		}
		else
		{
			Node1 n = head;
			Node1 n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next1;
			}
			n1 = n.next1;
			n.next1 = n1.next1;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}
	
	public void show()
	{
		Node1 node1 = head;
		if(head== null)
		{
			System.out.println("Empty");
		}
		else {
		while(node1.next1!=null)
		{
			System.out.println(node1.data);
			node1 = node1.next1;
		}
		System.out.println(node1.data);
		}
	}



public void addInMid(int num,int newdata)
{    
//	Node1 node1 = new Node1();
//	node1.data = data;
//	node1.next1 = null;
//	node1.next1 = head;
//	head = node1;
	
	
    Node1 newNode = new Node1();  
    newNode.data = newdata;
    newNode.next1 = null;
    Node1 tem =head;
    
     if(head == null)
     {
    	 System.out.println("empty");
     }
     else if (head.next1==null) 
    {
    	 if(head.data==num)
    	 {
    		 head.next1 =newNode;
    	 }
    	 else 
    	 {
	        System.out.println("Node not exits");		
		 }
	}
     else 
    {
	   while (tem != null && tem.data != num)
		   {
			   tem = tem.next1;
		   }
	   if(tem == null) 
	   {
		   System.out.println("Node does not exist");
	   }
	   else {
		newNode.next1=tem.next1;
		tem.next1 =newNode;
	}
		
	}	
	}
}  
