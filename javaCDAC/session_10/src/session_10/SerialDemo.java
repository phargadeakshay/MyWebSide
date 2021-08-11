package session_10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.sun.net.httpserver.Authenticator.Success;

public class SerialDemo {

	public static void main(String[] args) throws IOException {
		Student s1 = new Student(11,"Akshay");
	   FileOutputStream fos = new FileOutputStream("d://abc.txt");
	   		ObjectOutputStream  oos= new ObjectOutputStream(fos);
	   		oos.writeObject(s1);
	   		oos.close();
	   		fos.close();
	   		System.out.println("Succes");
	}
}
