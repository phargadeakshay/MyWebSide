package session_14;

public class Factorial {
	public void fact(int n)
	{
		int f= 1;
		for(int i = 1; i<=n;i++)
		{
			f = f*i;
			System.out.println(f);
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
