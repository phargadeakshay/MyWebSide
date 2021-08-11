package singly_Linked_List;

public class Node{
	private int data;
	private int sal;
	private String name;
	private Node next;
	private Object String;
	

	public Node()
	{
		data=0;
		sal = 0;
		String = null;
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
	public void setSal(int s)
	{
		sal =s;
	}
	public int getSal()
	{
		return this.sal;
	}
	public void setName(String a)
	{
		name = a;
	}
	public String getName()
	{
		return this.name;
	}

}
