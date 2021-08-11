package session_14;

public class Demo {
	
	public static void main(String[] args) {
		
	
	Customer c = new Customer();
	
	new Thread()
	{
		public void run()
		{
			c.withdraw(20000);
		}
	}.start();
	
	new Thread()
	{
		public void run()
		{
			c.deposit(20000);
		}
	}.start();
	}
}
