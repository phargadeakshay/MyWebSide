package session_14;

public class Customer {
	int amount = 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("Withdarawing");
		if(this.amount<amount)
		{
			System.out.println("Low Balance...waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount = amount;
		System.out.println("Withdrawn = "+this.amount);
	}
synchronized void deposit(int amount)
{
System.out.println("Depositing");
this.amount += amount;
notify();
}
}
