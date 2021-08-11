package exceptionh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class B {
	
	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileInputStream fis = null;
		
		try 
		{
			fis = new FileInputStream("d://abc.txt");
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally 
		{
			fis.close();    // finally block always run;
		}
	}

}
