package session_13;

public class JointDemo extends Thread{
	
	public void run()
	{
		for (int i =1; i <=5; i++)
		{
			System.out.println(i+" "+Thread.currentThread().getClass());
		
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	
public static void main(String[] args) {
	JointDemo t1 = new JointDemo();
	JointDemo t2 = new JointDemo();
	JointDemo t3 = new JointDemo();
	
	try
	{
		t1.join();
		
	}
	catch(InterruptedException e)
	{
		e. printStackTrace();
	}
	t2.start();
	t3.start();
	
}
}


//Joint() - this method waits for a therad to teminate
