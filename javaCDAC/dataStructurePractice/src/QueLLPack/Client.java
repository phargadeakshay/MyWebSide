package QueLLPack;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		QLL ql = new QLL();
		int ch =1,value;
		
		do {
			System.out.println("\n1:EnQueue"
							  +"\n2:DeQueue"	
							  +"\n3:Display"
							  +"\n4:Exit");
			System.out.println("Enter Your Choise....!!");
			ch=sc.nextInt();
		
		switch (ch) {
		case 1:
		{
			System.out.println("Enter the value to insert: ");
			value = sc.nextInt();
			ql.enQueue(value);
			break;
		}
		case 2:
		{
		    value = ql.deQueue();
			if(value != -1) 
			{
				System.out.println("Dequaue:: "+value);
			}
		break;
		}
		
		case 3:
		{   ql.display();
			break;
		}
		case 4:
		{
			System.exit(0);
		}
		
		
		}//switch
		} while (ch != 0);
		sc.close();
		
	}

}

