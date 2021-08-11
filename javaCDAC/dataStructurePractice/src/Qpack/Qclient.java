package Qpack;

import java.util.Scanner;

public class Qclient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueArr q = new QueArr();
		int ch;
		
		do {
			System.out.println("Start"
								+"\n2:enQueue"
								+"\n3:deQue"
								+"\n4:Display"
								+"\n0:Exit");
			System.out.println("Entr you choise ");
			ch =sc.nextInt();
			switch (ch) {
			case 1: 
				q.initQue();
				break;
			case 2:
				System.out.println("Enter The Value");
				int value = sc.nextInt();
				q.enQueue(value);
				break;
			case 3:
				int s = q.deQueue();
				System.out.println("dequedd...."+s);
				break;
			case 4: 
				q.display();
				break;
			case 0:
				System.exit(0);	
			}
			
			
		} while (ch != 0);
	}

}
