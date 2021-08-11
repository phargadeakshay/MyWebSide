package session_10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeSerialDemo {

 public static void main(String[] args) throws IOException,ClassNotFoundException {
	
	 
	 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://abc.txt"));
	 Student s = (Student) ois.readObject();
	 System.out.println(s.id+" "+s.name);
	 
	 //transient its value will not be persisted
}
}
