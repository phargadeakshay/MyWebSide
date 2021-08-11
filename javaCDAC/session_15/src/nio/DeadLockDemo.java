package nio;

public class DeadLockDemo {
public static void main(String[] args) {
	String r1 = "Sakshi";
	String r2 = "Kunal";
	
		Thread t1 = new Thread()
		{
	
	    public void run()
	    {
	    	synchronized (r1) 
	    	{
			System.out.println("t1: Locked r2");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			synchronized (r2) {
				System.out.println("t2: Locked r1");
				
			}
			}
	    }
		};
	
	Thread t2 = new Thread()
			{
		
		    public void run()
		    {
		    	synchronized (r2) 
		    	{
				System.out.println("t2: Locked r2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
					}
				synchronized (r2) {
					System.out.println("t2: Locked r1");
					
				}
				}
		    }
			};
			t1.start();
			t2.start();
}
}
