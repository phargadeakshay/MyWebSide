import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("G"));
		System.out.println(t);//ClassCastException
		
//		StringBuffer does not implement Cormparable interface
	}
}
