import java.util.Scanner;  
public class Root_f   
{  
public static void main(String[] args)    
{   
System.out.print("Enter a number: ");   
Scanner sc = new Scanner(System.in);   
int n = sc.nextInt();    
System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
}    
public static int squareRoot(int num)   
{  
int t;  
int root=num/2;  //                   
do   
{  
t=root;  
root=(t+(num/t))/2;  
}   
while((t-root)!= 0);  
return root;  
}  
}  