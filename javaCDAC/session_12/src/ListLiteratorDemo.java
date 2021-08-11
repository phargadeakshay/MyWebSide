import java.util.LinkedList;
import java.util.ListIterator;

public class ListLiteratorDemo {

	


	public static void main(String[] args) {
		LinkedList  l =new LinkedList();
		
		
		l.add("akshay");
		l.add("akshay");
		l.add("akshay");
		l.add("akshay");
		l.add("akshay");
		l.add("akshay");
		
		System.out.println(l);
		
		ListIterator itr =l.listIterator();
		
		while (itr.hasNext()) {
		       String str =(String) itr.next();
		       if(str.equals("akshay"));
		       {
		    	   itr.remove();
		       }
			
		}
	
		System.out.println(l);
	}
}
