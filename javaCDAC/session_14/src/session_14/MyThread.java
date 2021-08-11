package session_14;

import java.util.ArrayList;
import java.util.Iterator;
public class MyThread extends Thread {
	static ArrayList L = new ArrayList();
	
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Child Thread Updating List");
		L.add("D");
		
	}
	public static void main(String[] args) {
		L.add("A");
		L.add("B");
		L.add("C");
		
		MyThread t1 =new MyThread();
		t1.start();
		
		Iterator itr = L.iterator();
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println("Main Iterating List ans current Object is "+s1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		}
		System.out.println(L);
}
	}


//output
/*
Main Iterating List ans current Object is A
Child Thread Updating List
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at session_14.MyThread.main(MyThread.java:30)
*/