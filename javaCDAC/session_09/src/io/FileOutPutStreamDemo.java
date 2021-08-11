package io;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileOutPutStreamDemo{
	public static void main(String[] args) throws IOException{
		
	

	FileOutputStream fos = FileOutputStream("d://abc.txt");
	String str= "mY Name is Akshay 6545";
	byte b[]= str.getBytes();
	fos.write(b);
	fos.close();
    System.out.println("success");
}

	private static FileOutputStream FileOutputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}