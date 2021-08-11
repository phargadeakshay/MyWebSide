package session_13;
// we cannot extend Thread If one class already extend another class
// bcoz of java not support multiple Inheritance
public class MyThread  extends Thread{
	public void run()
	{
		System.out.println("Thread Name = "+Thread.currentThread().getName()+" "
				+"Thread ID= "+Thread.currentThread().getId() );
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
