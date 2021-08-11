
public class Prime_1_100 {
 public static void main(String[] args) {
	 
	 for (int i = 1; i <=100; i++) {
		 
		 if ((i%2==0 && i!=2) || (i%3==0 && i!=3)|| (i%7==0 && i!=7) || (i%5==0 && i!=5) || i==1) 
		   {
			 //System.out.println("The given Number is NOT Prime Number");
		   }
	     else
	         {
				System.out.println(i);
	         }
	}
 }
}
