package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("d://abc.txt");
		int i= 0;
		while ((i =fis.read())!=-1) 
		{
			System.out.println((char)i);
			
		}
		fis.close();
	}

}
