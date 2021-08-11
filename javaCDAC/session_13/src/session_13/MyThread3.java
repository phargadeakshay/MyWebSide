package session_13;

public class MyThread3 extends Thread{
	public MyThread3(ThreadGroup g,String name)
	{
		super(g,name);
	}	
	
	public void run()
	{
		System.out.println("Child Thread");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
