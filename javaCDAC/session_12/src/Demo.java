import java.util.TreeSet;

public class Demo {
public static void main(String[] args) {
	TreeSet t = new TreeSet(new MyComparator());
	t.add(5);
	t.add(0);
	t.add(15);
	t.add(5);
	t.add(20);
	t.add(17);
	System.out.println(t);
}
}
