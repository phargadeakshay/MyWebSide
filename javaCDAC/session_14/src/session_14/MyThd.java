package session_14;

import java.beans.IntrospectionException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThd extends Thread {

	static ConcurrentHashMap m = new ConcurrentHashMap();

		public void run()
		{
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Child Thread updating Map");
			m.put(103,"C");
			
		}
public static void main(String[] args) {
	m.put(101,"A");
	m.put(102,"B");
	
	MyThd t1 = new MyThd();
	t1.start();
	Set s =m.keySet();
	Iterator itr = s.iterator();
	
	while(itr.hasNext())
	{
		Integer i = (Integer) itr.next();
		System.out.println("Main Thread iterating and current Entry is "+ i+ "---"+m.get(i));
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
	   e.printStackTrace();	
	}
	}
	System.out.println(m);
}	


}
	


