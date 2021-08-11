package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class A {
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream input  = new FileInputStream("D:dataak.txt");
		ReadableByteChannel source = input.getChannel();
		
		FileOutputStream output  = new FileOutputStream("D:nnewak.txt");
		WritableByteChannel dest = output.getChannel();
		
		copyData(source, dest);
		
		source.close();
		dest.close();
		System.out.println("Sucsess");
	}	
	
		
		private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException
		{
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
			
			while(src.read(buffer)!=-1)
			{
				buffer.flip();
				
				while(buffer.hasRemaining())
				{
					dest.write(buffer);
				}
					
			}
		buffer.clear();
		}

}
