package nio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		
		//formatting
		SimpleDateFormat f = new SimpleDateFormat("dd//mm/yy");
		String str = f.format(d);
		System.out.println(str);
		
		//Parsing
		Date date = f.parse(str);
		System.out.println("date = "+date);
		
	}

}
