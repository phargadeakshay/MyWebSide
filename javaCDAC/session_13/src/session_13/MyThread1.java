package session_13;
//java does not support multiple inheritance so that we use Runnable Interface.
public class MyThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		Thread t1 = new Thread(m1);
		MyThread1 m2 = new MyThread1();
		Thread t2 = new Thread(m2);
		MyThread1 m3 = new MyThread1();
		Thread t3 = new Thread(m3);
		
		t1.setName("One");
		t2.setName("two");
		t3.setName("three");
	
	
		
		t1.start();
		t2.start();
		t3.start();
	}
	

}
