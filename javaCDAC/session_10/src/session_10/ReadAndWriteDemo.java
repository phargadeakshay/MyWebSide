package session_10;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReadAndWriteDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("d://rp.jpg");
		BufferedImage image = null;
		image = ImageIO.read(file);
		ImageIO.write(image, "jpg", new File("d:/ADemo"));
//		ImageIO.write(image, "gif", new File("d:/Demo"));
//		ImageIO.write(image, "png", new File("d:/Demo"));
		System.out.println("success");
	}
}
