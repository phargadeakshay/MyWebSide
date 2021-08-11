package TreePack;

public class BSTree {
	
	Node root;
	
public BSTree()
{
	root = null;
}

public void setRooot(Node newnode)
{
	root =newnode;
}
public Node getRoot()
{
	return root;
}
public Node createNode(int data)
{
	Node newnode = new Node();
	newnode.setData(data);
	return newnode;
}
public void addNode(int data)
{
	Node newnode = createNode(data);
	Node temp = root;
	
	if(root ==null) 
	{
		root = newnode;
	}
	else 
	{
		while(true)
		{
			if(newnode.getData()<temp.getData())
			{
				if(temp.getLeft()==null)
				{
					temp.setLeft(newnode);
					System.out.println("Node add to Left Of "+temp.getData());
					break;
				}
				else 
				{
				   temp = temp.getLeft();	
				}
			}
			else if(newnode.getData() > temp.getData())
			{
				if(temp.getRight()==null) 
				{
					temp.setRight(newnode);
					System.out.println("Node Added At Righ of "+temp.getData());
					break;
				}
				else 
				{
				    temp= temp.getRight();	
				}
			}
			else 
			{
				System.out.println("\tDuplicates Not Allowed .....!!!");
				break;
			}
		}
	}
}

public void deleteNode(int data) 
{
	Node temp = root,tag = root;
	if(temp ==null)
	{
		System.out.println("Element cannot delete as Null tree exists.....");
	}
	else 
	{
		while(temp != null)
		{
			if(temp.getData() ==data)
			{
				break;
			}
			else if(data<temp.getData())
			{
				tag =temp;
				temp= temp.getLeft();
			}
			else if(data>temp.getData())
			{
				tag = temp;
				temp = temp.getRight();
			}
		}
		if(temp == null)
		{
			System.out.println("\nNode Not Found.....!!!");
		}
		else 
		{
			if(temp.getLeft() == null && temp.getRight()==null)
			{   // Type1 leaf node delete krayycha aaselt tarr
				if(tag.getLeft()==temp)
				{
					tag.setLeft(null);
				}
				else if(tag.getRight() == temp) 
				{
					tag.setRight(null);
				}
			}
			//type2 jo node delete karayycha aahe tayachaya LHS la Node present aasel trr
			else if(temp.getLeft() != null && temp.getRight()==null)
			{
				if(tag.getLeft() ==temp )
				{
					tag.setLeft(temp.getLeft());
				}
				else if(tag.getRight() == temp) 
				{
					tag.setRight(null);
				}
			}
			//type3 jo node delete karayycha aahe tayachaya RHS la Node present aasel ani LHS Null assel tarr
			else if(temp.getRight()!= null && temp.getLeft() == null)
			{
				if(tag.getLeft() ==temp)
				{
					 tag.setLeft(temp.getRight());
				}
				else if(tag.getRight()==temp)
				{
					tag.setRight(temp.getRight());
				}
			}
			//Node having both side LSH AND RHS THEN
			else if(temp.getLeft() !=null && temp.getRight() != null)
			{
				if(tag.getLeft()==temp)
				{
					tag.setLeft(temp.getRight());
					tag = tag.getRight();
				}
				else if(tag.getRight() == temp)
				{
					tag.setRight(temp.getRight());
					tag = tag.getRight();
				}
				while (tag.getLeft() !=null) 
				{
					tag = tag.getLeft();
					
				}
				tag.setLeft(temp.getLeft());
			}
			System.out.println("\n "+temp.getData()+"Node deleted....");
		}
	}
}
	
public void preOrder(Node temp)
{
	if(temp != null)
	{
		System.out.print("\t"+temp.getData());
		preOrder(temp.getLeft());
		preOrder(temp.getRight());
	}
}
public void inOrder(Node temp)
{
	if(temp != null)
	{
		inOrder(temp.getLeft());
		System.out.print("\t"+temp.getData());
		inOrder(temp.getRight());
	}
}
public void postOrder(Node temp)
{
	if(temp != null)
	{
		postOrder(temp.getLeft());
		postOrder(temp.getRight());
		System.out.print("\t"+temp.getData());
	}
}
}
