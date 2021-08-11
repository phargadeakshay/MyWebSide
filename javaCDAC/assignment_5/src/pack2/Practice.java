package pack2;

import java.util.Scanner;
public class Practice {
	private int age;
	private String name;
	private String branch;
	
	public Practice(int age, String name, String branch) {
		super();
		this.age = age;
		this.name = name;
		this.branch = branch;
	}
	
	
	
	public void show() {
		System.out.println("Practice [age=" + age + ", name=" + name + ", branch=" + branch + "]");
	}
	
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		System.out.println("Enter how many person: ");
		int no = f.nextInt();
		Practice[] p = new Practice[no];
		
		for (int i = 0; i < p.length; i++) {
			System.out.println("Enter Your Age: ");
			int age = f.nextInt();
			
			System.out.println("Enter your Name: ");
			String name= f.next();
			
			System.out.println("Enter Branch: ");
			String branch = f.next();
			
			p[i] = new Practice(age,name,branch);
			
		}
		
		p[0].show();
		
	}

	


}
