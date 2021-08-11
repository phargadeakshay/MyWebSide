package dataStructurePractice;

public class Node1 {
	
	private int data;
	private Node1 next;


Node1()
{
	data = 0;
	next = null;
}


public void setData(int a)
{
	data = a;
}

public int getData()
{
	return this.data;
}

public void setNext(Node1 newnode1)
{
    this.next = newnode1;
}

public Node1 getNext()
{
	return this.next;
}


}