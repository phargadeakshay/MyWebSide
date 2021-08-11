package collection;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
	    //Generic Version Of ArrayList
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(10);
		a.add(56);
//		a.add('A');
//		a.add("Akshay");  //Compile time error  only in case of Generic  ArrayList
		a.add(null);

		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		a.add(2,78);
		System.out.println(a);
		
		System.out.println(a.get(3));
	}
}
