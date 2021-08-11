package SortedLinkedList;

public class Node{
	private int data;
	private Node next;
	
	public Node()
	{
		data=0;
		next = null;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	public int getData()
	{
		return this.data;
	}
	public void setNext(Node newnode)
	{
		this.next = newnode;
	}
	public Node getNext()
	{
		return this.next;
	}
	

}