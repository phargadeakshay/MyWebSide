import java.util.*;

public class Simple_interest {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Amount: ");
	int p = s.nextInt();
    System.out.println("Enter intrest rate");
	int r = s.nextInt();
	System.out.println("Enter duration of invesment");
	int t = s.nextInt();
	int a;
	a = (p*t*r)/100;
    System.out.println("Principle Amount Rs."+p+" Time Period is"+t+"year"+"and rate of intrest is "+r+"%  Simple Interest is = "+a);
	
}
}
