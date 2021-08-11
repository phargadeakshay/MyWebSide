package session_09;

public class StringBufferDemo {
	public static void main(String[] args)

	{
		StringBuffer sb = new StringBuffer("rahul");
		System.out.println(sb);
		
		sb.append(" Pawar");
		System.out.println(sb);
		
		sb.insert(1, "java");
		System.out.println(sb);
		
		sb.replace(1, 5, "True");
		System.out.println(sb);
		
		sb.delete(1, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
