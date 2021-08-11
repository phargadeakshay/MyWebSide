package session_10;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
	public static void main(String[] args) throws IOException{
		char[] ch = new char[100];
	
		FileReader fr = new FileReader("d://abc.txt");
      fr.read(ch);
      System.out.println(ch);
	}

}
