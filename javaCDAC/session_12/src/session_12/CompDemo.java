package session_12;

import java.util.TreeSet;

public class CompDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(100,"kiran");
		Employee e2 = new Employee(200,"sakshi");
		Employee e3 = new Employee(50,"Akshay");
		Employee e4 = new Employee(150,"rahul");
		Employee e5 = new Employee(100,"preteek");
		
		TreeSet t = new TreeSet();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
		
	}
}
