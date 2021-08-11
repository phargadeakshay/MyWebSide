package inheritance;

import java.util.Scanner;

public class Person {
	
	private String fname;
	private String Lname;
	private int age;
	protected Scanner s = new Scanner(System.in);
	
	public void getData()
	{
		System.out.println("Enter your first name = ");
        fname = s.next();
        System.out.println("Enter your last name = ");
        Lname = s.next();
        System.out.println("Enter your age = ");
        age = s.nextInt();
 	}
	
	public void show()
	{
		System.out.println("FName = "+fname+"LName = "+Lname);
	     System.out.println("Age = "+age);
	}

}
