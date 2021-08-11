package session_09;

public class WrapperDemo {

	public static void main(String[] args) {
	int no = 10;
	Integer i = new Integer(no);//primative to wrapper - Boxing
	System.out.println(i);
	
	char ch = 'A';
	Character c = new Character(ch);
	
	char h = c.charValue(); //wrapper to primative - UnBoxing
	int d = i.intValue();
	
	String str = "30";
	int a = Integer.parseInt(str);
	
}
}