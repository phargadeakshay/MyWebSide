package session_13;

public class SimpleThread extends Thread{

	String name;
	public SimpleThread(String name)
	{
		this.name = name;
		
	}
     public void run()
     {
    	 for (int i = 1; i <=5; i++) 
    	{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
    	 System.out.println("DONE");
     }
     
     public static void main(String[] args) {
		new SimpleThread("ONE").start();
		new SimpleThread("TWO").start();
	}
}
