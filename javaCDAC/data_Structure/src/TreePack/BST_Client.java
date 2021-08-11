package TreePack;

import java.util.Scanner;



public class BST_Client {
	
	public static void main(String[] args) 
	{
		BSTree tree = new BSTree();
		Scanner sc = new Scanner(System.in);
		int data,ch;
	do {
		System.out.println("\n---------Menu---------- \n");
		System.out.println("1:Start"
							+"\n2:Add"
							+"\n3:Delete"
							+"\n4:PreOrder"
							+"\n5:InOrder"
							+"\n6:PostOrder"
							+"\n0:EXIT");
		System.out.println("Enter choice: ");
		ch = sc.nextInt();
		
		switch (ch) 
		{
		case 1:
			System.out.println("\tNew Tree is Created...");
			System.out.println("\tEnter root: ");
			data= sc.nextInt();
			tree.setRooot(tree.createNode(data));
			break;
		case 2:
			System.out.println("Enter The DAta which You want to Add: ");
			data = sc.nextInt();
			tree.addNode(data);
			break;
		case 3:
			System.out.println("Enter the data which you Want to delete...!");
			data = sc.nextInt();
			tree.deleteNode(data);
			break;
		case 4:
			System.out.println("\n-------------------\n");
			tree.preOrder(tree.getRoot());
			
			System.out.println("\n-------------------\n");
	        break;
		case 5:
			System.out.println("\n-------------------\n");
			tree.inOrder(tree.getRoot());
			
			System.out.println("\n-------------------\n");
			break;
		case 6:
			System.out.println("\n-------------------\n");
			tree.postOrder(tree.getRoot());
			System.out.println("\n------------------\n");
			break;
			
	        
		case 0:
			System.exit(0);
	    
			
		}
				
		
	}while(ch != 0);
	sc.close();

	}
}
