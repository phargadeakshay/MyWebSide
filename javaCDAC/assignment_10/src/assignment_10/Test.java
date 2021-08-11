package assignment_10;

//Java program to demonstrate that simple sorting
//StringBuffer objects does work.
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args)
	{
		Set<StringBuffer> str = new TreeSet();
		str.add(new StringBuffer("Sohan"));
		str.add(new StringBuffer("Raja"));
		str.add(new StringBuffer("Harish"));
		str.add(new StringBuffer("Ram"));
		str.add(new StringBuffer("Akshay"));
		System.out.println(str);
	}
}

