package nio;

import java.util.Calendar;

public class CalenderDemo {
	
 public static void main(String[] args) {
	
	 Calendar c = Calendar.getInstance();
	 
	 System.out.println("Present Day ="+c.get(Calendar.DATE));
	 System.out.println("Present Day ="+c.get(Calendar.MONTH));
	 System.out.println("Present Day ="+c.get(Calendar.YEAR));
	 
	 System.out.println("Date = "+c.getTime());
	 c.add(Calendar.DATE,-15);
	 System.out.println("15 days Ago ="+c.getTime());
	 c.add(Calendar.MONTH,2);
	 System.out.println("Two Months Later ="+c.getTime());
	 c.add(Calendar.YEAR,4);
	 System.out.println("Four Year Later = "+c.getTime());
}

}
