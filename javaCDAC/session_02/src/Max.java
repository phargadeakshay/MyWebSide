import java.util.Scanner;

public class Max {
 public static void main (String[] args) {
	 int no;
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter any number");
	 no = s.nextInt();
	 
	 if(no>0)
	 {
		 System.out.println("Positive Number");
	 }
	 else if(no<0)
	 {
		 System.out.println("Negative Number"); 
	 }
	 else
	 {
		 System.out.println("Zero");
	 }
 }
}
