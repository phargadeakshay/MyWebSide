package assignment_11;

import java.util.Hashtable;
import java.util.Set;

public class RemoveDuplicateHashTable {

	
	public static void main(String args[])
	{
		Hashtable<Teacher, String> table
			= new Hashtable<>();

		table.put(new Teacher(12, "Nilesh"),"IT");
      table.put(new Teacher(58,"Sunita"), "IT");
      table.put(new Teacher(11, "Rahul"),"CS");
      table.put(new Teacher(1, "Rahul"),"CS");
 
     
		Set<Teacher> keys = table.keySet();

		for (Teacher t : keys) {

			System.out.println(t + " ==> " + table.get(t));
		}
	}
}

