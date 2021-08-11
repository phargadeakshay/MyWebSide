package exceptionh;

public class Test9 {
	public static void main(String[] args) 
	{
		
	
	int a,b,c=0;
	try
	{
		a =Integer.parseInt(args[0]);
		b= Integer.parseInt(args[1]);
		c= a/b;
		System.out.println("c "+c);
	}catch(Exception e) 
	{
//		System.out.println("some error occurred");
//	    e.printStackTrace();
	    System.out.println(e.getMessage());
	}

}

}


//Throwable

//Exception

//1. void printStackTrace()
//Name of The
