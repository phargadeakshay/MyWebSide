package session_14;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Demo1 {
public static void main(String[] args) {
	CopyOnWriteArraySet a = new CopyOnWriteArraySet();
	
	a.add("B");
	a.add("A");
	a.add("B");
	a.add("D");
	a.add("F");
	a.add("C");
System.out.println(a);
}
}
