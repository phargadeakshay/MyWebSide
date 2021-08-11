package Doubly;

public class Node {

	private int data;
	private Node next;
	private Node prev;
	
	public Node()
	{
		data = 0;
		next=null;
		prev = null;
	}
	
	public int getData()
	{
		return this.data;
	}
	public void setData(int d)
	{
		data=d;
	}
	
	public Node getNext()
	{
		return this.next;
	}
	public void setNext(Node newnode)
	{
		next = newnode;
	}
	
	public Node getPrev()
	{
		return this.prev;
	}
	public void setPrev(Node newnode)
	{
		prev = newnode;
	}	
}














