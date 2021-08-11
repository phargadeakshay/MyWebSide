package session_12;

import java.util.PriorityQueue;

public class QueueDemo {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(10);
		p.add(20);
		p.add(25);
		
		System.out.println(p);
		
		//top element of Queue
		System.out.println(p.peek());
		
		// top element as well it remove the Top element
		System.out.println(p.poll());
		
		System.out.println(p);
	}

}
