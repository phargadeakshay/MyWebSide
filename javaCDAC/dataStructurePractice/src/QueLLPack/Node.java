package QueLLPack;

public class Node {
	private int data;
	Node next;

	
	public Node()
	{
		data = 0;
		next = null;
	}
	
	public void setData(int d)
	{
		this.data = d;
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
