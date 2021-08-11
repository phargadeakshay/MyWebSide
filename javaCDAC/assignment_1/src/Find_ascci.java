import java.util.Scanner;

public class Find_ascci {

	public static void main(String[] args) {
		System.out.println("Enter the char");
		Scanner a = new Scanner(System.in);
       
        char ch =a.next().charAt(0);
        int ascii = ch;
        // You can also cast char to int
//        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        
    }
	
}
