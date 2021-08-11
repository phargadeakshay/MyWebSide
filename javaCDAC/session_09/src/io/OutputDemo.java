package io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream("d://abc.txt");
			fos.write(97);
			System.out.println("success");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("success");
		}
		finally {
			fos.close();
		}
	}
}

