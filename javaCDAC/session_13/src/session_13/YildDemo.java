package session_13;

public class YildDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <=4; i++) {
			if(i == 2)
			{
				Thread.yield();
			}
			else {
				System.out.println(i+" "+Thread.currentThread().getName());
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new YildDemo());
		Thread t2 = new Thread(new YildDemo());
		Thread t3 = new Thread(new YildDemo());
	    t1.start();
	    t2.start();
	    t3.start();
	
	}

}


//yeild() - casues the currently executing thread to temporarily pause
// and allow other thread to execute