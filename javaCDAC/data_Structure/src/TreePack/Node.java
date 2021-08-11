package TreePack;

public class Node {
private int data;
private Node left;
private Node right;



  public Node()
  {
	data = 0;
	left = null;
	right = null;
  }
public void setData(int d)
{
	this.data = d;
}
public int getData()
{
	return this.data;
}
public void setLeft(Node newnode)
{
	this.left = newnode;
}
public Node getLeft()
{
	return left;
}
public void setRight(Node newnode)
{
	this.right = newnode;
}
public Node getRight()
{
	return right;
}

}
