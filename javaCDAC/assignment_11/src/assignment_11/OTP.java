package assignment_11;

import java.util.Scanner;

public class OTP {
	int sysOTP =10000;
	public void bank(int userOTP) throws Exception
 {  
	 if(this.sysOTP != userOTP)
     {    
		 throw new Exception();
      }
 }       
public static void main(String[] args) {
	System.out.println("Enter the OTP :");
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	OTP cust = new OTP();
	try {
		cust.bank(n);
		System.out.println("Transation proceed Successfull\nhave a nice day!!!");
	} catch (Exception e) {
		System.out.println("Invalid OTP!!!!");
	}
}
}



//2. Create a Class Transaction which has data member sysOTP 
//and MemberFunction which accepts userOTP
//If sysOTP and UserOTP is same then "transaction proceed successfully" and 
//provide message "have a wonderful day "
//and if it does matches with each other then handle 
//the exception by creating custom exception with message "Invalid OTP"
