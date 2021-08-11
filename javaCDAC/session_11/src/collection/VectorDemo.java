package collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());//10
		for (int i = 1; i <10; i++) 
		{
		   v.addElement(i);
		   
		}
		System.out.println(v.capacity());//10
		v.addElement(11);
		System.out.println(v.capacity());//20  capacity will increase 10 
		System.out.println(v);
	}
}
