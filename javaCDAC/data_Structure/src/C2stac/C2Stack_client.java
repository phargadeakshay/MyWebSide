package C2stac;

import java.util.Scanner;
public class C2Stack_client {
	
public static void main(String[] args) {
	int ch,value;
	Scanner sc = new Scanner(System.in);
	C2Stack s = new C2Stack();
	
	do {
		System.out.println("\n-------------");
		System.out.println( "1:Start"
							+"\n2:Push1"		
							+"\n3:Push2"		
							+"\n4:Pop1"		
							+"\n5:Pop2"		
							+"\n6:Display"
							+"\n7:Exit");
		System.out.println("Enter choise:: ");
		ch = sc.nextInt();
		switch (ch) {
		case 1: 
		{
			System.out.println("\nNew Stack will be Intantiated....!!");
			s.initStack();
			break;
		}
		case 2:
			System.out.println("Enter value to push in stack:: ");
			value = sc.nextInt();
			s.push1(value);
			break;
		case 3:
			System.out.println("Enter value to Push in stack");
			value= sc.nextInt();
			s.push2(value);
			break;
		case 4:
			value =s.pop1();
			if(value!=-1)
			{
				System.out.println("\tPopped::"+value);
			}
		case 5:
			value = s.pop2();
			if(value!=-1)
			{
				System.out.println("\tPopped:: "+value);
			}
			break;
		case 6:
			System.out.println("\n-----------STACK---------\n");
			s.display();
			System.out.println("-------------------");
			break;
		case 0:
		System.exit(0);
		}
		
	} while (ch!=0);
}

}
