package SortedLinkedList;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Employee em =new Employee();
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			
		
		System.out.println("\nEnter choise \n1:add\n2:display\n3:Sort Salary");
		
		ch = sc.nextInt();
		switch (ch) {
		case 1: 
			em.addBySortedId();
			break;
		case 2:
			em.display();
			break;
		case 3:
			System.out.println("Sorting by Salary: ");
			em.sortList();
			break;
		case 0:
			System.exit(0);
		
		}
		} while (ch!=0);
	}

}
