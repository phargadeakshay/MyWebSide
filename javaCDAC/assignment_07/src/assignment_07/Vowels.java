package assignment_07;

import java.util.Scanner;
public class Vowels {
	
	public static void main(String[] args) {
		
		System.out.println("Enter The Name Of Person");
		Scanner r = new Scanner(System.in);
		String a = r.nextLine();
		a = a.toLowerCase();
		System.out.println(a);
		int count=0;
		
		   for(int i = 0; i < a.length(); i++) 
		   {
		
if(a.charAt(i)=='a'|| a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
{
	
	count++;
}

}
		   System.out.println(count);
		   
		   
		
}


}
