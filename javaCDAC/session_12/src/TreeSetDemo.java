import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("S");
		t.add("S");
//		t.add(new Integer(10));
//		t.add(null);//Null PointerException
		System.out.println(t);
	}

}

//TreeSet:
//Implementing SortedSet
//"Dublicates are not allowed"
//Inserted order not preserved bcoz it is based on some Sorting order
//Heterogeneous Objects are not allowed
//If trying to inserted one will throw ClasscastException
//If trying to inserted null will throw NullPointException
