package pack_01;

import java.util.Scanner;

public class Faculty {
 private int facultyid;
 private int salary;
 Scanner s = new Scanner(System.in);
 
 
  public void getdata()
  { 
	  System.out.println("Enter the Faculty id ");
	  facultyid = s.nextInt();
  }
  
  
  public void diplay()
  {
	  System.out.println("Faculty id is = "+facultyid);
  }

}
