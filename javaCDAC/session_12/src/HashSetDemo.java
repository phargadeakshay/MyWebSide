import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		
		h.add("G");
		h.add("P");
		h.add("A");
		h.add("B");
		
		System.out.println(h.add('A'));
		System.out.println(h);
	}
}
