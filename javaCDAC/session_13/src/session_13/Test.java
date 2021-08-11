package session_13;

public class Test {

	public static void main(String[] args) {
		ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());//main
		ThreadGroup g2 = new ThreadGroup("Second Group");
		System.out.println(g1.getParent().getName());//Parent for Second group is Frist group
		
	}
}

// system
// main
// FirstGroup


