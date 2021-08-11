package pack2;

import java.util.Scanner;

public class CampusApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of Faculties = ");
		int n = s.nextInt();
		System.out.println("No of faculties = "+n);
		Faculty[] f = new Faculty[n];
		double totalsal = 0;
		for (int i = 0; i < f.length; i++) 
		{
		  System.out.println("Enter id = ");
		  int id = s.nextInt();
		  
		  System.out.println("Enter name: ");
		  String name = s.next();
		  
		  System.out.println("Enter Address: ");
		  String address = s.next();
		  
		  System.out.println("Enter Age: ");
		  int age = s.nextInt();
		  
		  System.out.println("Enter Branch: ");
		  String branch = s.next();
		  
		  System.out.println("Enter Salary: ");
		  float salary = s.nextFloat();
		  
		  f[i] = new Faculty(id, name, address, age, branch, salary);
		  
		  totalsal+= f[i].salary;
		  
		  
		}
		
		for (int i = 0; i < f.length; i++) 
		{
			f[i].show();
			System.out.println();
		}
		
		System.out.println("Total Salary = "+totalsal);
		System.out.println("Format = "+String.format("%.2f",totalsal));
		
		
	}

}
