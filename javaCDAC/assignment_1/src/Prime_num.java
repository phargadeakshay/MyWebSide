import java.util.Scanner;
public class Prime_num {
public static void main(String[] args) {
	int n;
	System.out.println(" Find Prime Number ");
	do {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	int a = s.nextInt();
	

	if((a%2==0 && a!=2) || (a%3==0 && a!=3)|| (a%7==0 && a!=7) || (a%5==0 && a!=5) || (a == 1))
	{
		System.out.println("The given Number is NOT Prime Number");
	}
	
	else
	{
		System.out.println("The Given Number Is Prime Number!");
	}
	System.out.println("if you want countinue then press 1 or you want breke press 0");
	n = s.nextInt();
	}while(n != 0 );
}

}
