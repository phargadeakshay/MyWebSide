import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		TreeSet t =new TreeSet();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		
		System.out.println(t);
	}
}
//
//10 ---------[10]
//0-----------0 compareTo(0); [0,15,10]

//
//15-----------0 compareTo(10); [0,15,10]
//---------- 15. compareTo(10); [0,15,10]
//10---------  [0,10,15]

