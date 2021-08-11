package pack_08;
import java.util.Scanner;
public class Voter {

private int voterId;
private static int age;
private String name;

public Voter(int voterId, int age, String name) {
	this.voterId = voterId;
	this.age = age;
	this.name = name;
}
public static void red(int age ) throws Exception {
if (age < 18) {
    
    throw new Exception("Age " + age + " too young");
} 
}
public static void main(String[] args) throws Exception{
   Scanner r = new Scanner(System.in);
   
   
   
//   System.out.println("Enter no of Faculties = ");
//	int n = r.nextInt();
//   Voter[] f = new Voter[n];

   
   
	System.out.println("Enter your Id: ");
	int voterId = r.nextInt();
	
	System.out.println("Enter Age: ");
	int age = r.nextInt();
	
	System.out.println("Enter Name: ");
	String name= r.next();
	
	Voter a = new Voter(voterId,age,name);
	
	  try {
		  
          red(age);

          System.out.println("you can vote");

      } catch (Exception e) {

       
          System.out.println("invalid age for voter");
         
      }

      }
	
	
}
