import java.util.Scanner;
public class Ternary_max {
	public static void main(String[] args)
	{
		System.out.println("find max numger using ternary operator");
		Scanner num = new Scanner (System.in);
		int result;
		System.out.println("Enter First number");
		int a = num.nextInt();
		System.out.println("Enter Second number");
		int b = num.nextInt();
		
		result = a>b?a:b;
		System.out.println("The Greate Number is:- " +result);
		
	
	
		
		
	}

}
