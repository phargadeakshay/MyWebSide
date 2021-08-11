package assignment_10;

//Java Program to print TreeSet in reverse Order
import java.util.TreeSet;

public class TreeSetDescending
{

	public static void main(String[] args)
	{
		
		TreeSet ram = new TreeSet();
		ram.add("rahul");
		ram.add("vishal");
		ram.add("Nilesh");
		ram.add("Pravin");
//		ints.add(7);
//		ints.add(3);

		
		TreeSet ramReverse = (TreeSet)ram.descendingSet();
			

		
		System.out.println("Without descendingSet(): " + ram);
											
		System.out.println("With descendingSet(): " + ramReverse);
										
	}
}
