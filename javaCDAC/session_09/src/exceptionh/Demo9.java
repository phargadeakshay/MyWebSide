package exceptionh;


public class Demo9 {

	public static void getMsg()
	{
		smg();
	}
	
	public static void smg()
	{
		int c = 10/0;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Demo9.getMsg();
	}
}

//this is error is due to no exception handaling is their
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at exceptionh.Demo9.smg(Demo9.java:14)
//at exceptionh.Demo9.getMsg(Demo9.java:9)
//at exceptionh.Demo9.main(Demo9.java:19)



