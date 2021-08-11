import java.util.Scanner;

public class Eligible {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
    System.out.println("Enter the Age of Person");
    int age = s.nextInt();
    System.out.println("Press 1 If Person is  Mail or Press 0 If Person is Female");
    int a = s.nextInt();
  
  switch (a) {
   case 0: 
     {
  
	if(age >= 18)
	{
		System.out.println("Person is Eligible for Marriage");
	}
	else {
		System.out.println("Person is not eligible for marriage!!");
	}
	break;
	
     }
   case 1:
	if(age >= 21)
	{
		System.out.println("Person is Eligible for Marriage");
	}
	else {
		System.out.println("Person is Under age so  not eligible for marriage!!");
	}
	break;
   default:
	System.out.println("You Enter Wrong Number");
}
}

}
