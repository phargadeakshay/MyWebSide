package GraphsPack;

import java.util.Scanner;

public class GraphsClient {

	public static void main(String args[])
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		Graphs g = new Graphs();
		
		do{
			System.out.println("\n------------------Menu---------------------\n");
			System.out.println("1:Start"
					           +"\n2:AdjcencyMatrix"
					           +"\n3:Degree"
					           +"\n4:DFS"
					           +"\n5:BFS"
					           +"\n0:EXIT");
			System.out.println("Enter your choice:: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				g.createGraph();
				break;
			case 2:
				System.out.println("-------------------------------------\n");
				g.adjacencyMatrix();
				System.out.println("\n-------------------------------------\n");
				break;
			case 3:
				g.degree();
				break;
			case 4:
				System.out.println("-------------------------------------\n");
				g.DFS();
				System.out.println("\n-------------------------------------\n");
				break;
			case 5:
				System.out.println("-------------------------------------\n");
				g.BFS();
				System.out.println("\n-------------------------------------\n");
				break;
			case 0:
				System.exit(0);
			}//switch
		}while(ch!=0);
	}//main
}

