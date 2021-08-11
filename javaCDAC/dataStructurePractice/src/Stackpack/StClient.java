package Stackpack;

import java.util.Scanner;

public class StClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackArr s = new StackArr();
		int ch;
			
			do {
				System.out.println("\n1:Start"
								  +"\n2:Push"	
								  +"\n3:Pop"	
								  +"\n4:Display"
								  +"\n0:Exit");
				System.out.println("Enter Your Choise....!!");
				ch=sc.nextInt();
			
			switch (ch) {
			case 1:
			     s.initStack();
				 break;
			case 2:
				System.out.println("Enter the value to insert: ");
				int v =sc.nextInt();
				s.push(v);
				break;
			case 3:
			     int value = s.pop();
				 if(value != -1) 
				 {
					System.out.println("Dequaue:: "+value);
				 }
			     break;
			case 4:
			    s.display();
				break;
			case 5:
				System.exit(0);
			}
			
		} while (ch != 0);
	}

}
