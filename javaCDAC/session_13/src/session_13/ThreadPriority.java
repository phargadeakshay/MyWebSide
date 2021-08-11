package session_13;

public class ThreadPriority extends Thread {
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	
	
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(7);
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}



///Each Thread has some Priority
//Priorities are represented between 1(MIN_PRIORITY) to 10


// constants:
//   public static int MIN_PRIORITY
//   public static int NORM_PRIORITY
//   public static int MAX_PRIORITY

//Default priority of thread is 5

//setPriority 
