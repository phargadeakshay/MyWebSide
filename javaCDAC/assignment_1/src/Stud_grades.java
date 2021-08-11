import java.util.Scanner;



public class Stud_grades {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks = s.nextInt();
		if (marks >= 75) {
			System.out.println("Student got Distingtion!!!");
			
		}
		else if (marks >=60 && marks <75) {
			System.out.println("Student got First Class!!!!");
			
		}
		else if (marks >=50 && marks <60) {
			System.out.println("Student got Second Class!!!");
			
		}
		else if (marks >=35 && marks <50) {
			System.out.println("Student got Pass Class!!!!!");
			
		}
		else {
			System.out.println("Student get Faild!!!!");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
