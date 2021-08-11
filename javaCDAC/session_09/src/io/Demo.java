package io;


import java.io.IOException;

public class Demo {
	
	public static void main(String[] args) throws IOException{
		System.out.println("Hello");
		int i =System.in.read();
		System.out.println((char)i);
	    System.out.println("Error occurrred");
	}

}
