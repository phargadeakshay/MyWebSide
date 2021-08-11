package session_13;



public class MyThread2 extends Thread{
	
	public void run()
	{
		for (int i = 1; i <=5; i++) 
		{
			System.out.println(i+ " "+Thread.currentThread().getName());
		
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
			e.printStackTrace();	
			}
		}
}
	

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		t1.start(); 
		t2.start(); 
	}
}


//sleep(ms);  - causes the current thread to go in sleep sate for
// some specified amount of time