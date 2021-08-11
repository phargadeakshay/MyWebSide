package collection;

import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack s= new Stack();
		s.push("A");
		s.push("B");
		s.push("d");
		s.push("e");
		s.push("f");
		s.push("g");
		System.out.println(s);
		
		s.pop(); //Last in first out so it will delete top element (g)
		System.out.println(s); 
		
		System.out.println(s.peek());// it will show top element
		System.out.println(s.empty());// stack is not empty so it will return flase
		
	}
}
