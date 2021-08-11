package session_10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class WriteDemo {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d://abc.txt",true);
		BufferedWriter bw  = new BufferedWriter(fw);
		
		bw.write("My name is Akshay");
		bw.close();
		fw.close();
		System.out.println("succes");
	}

}
