package session_13;

public class ThreadGroupDemo1 {
	
	public static void main(String[] args) {
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg,"Child Group");
		
		MyThread3 t1 = new MyThread3(pg,"ChildThread1");
		MyThread3 t2 = new MyThread3(pg, "ChildThread2");
		
		t1.start();
		t2.start();
		
		System.out.println();
		
		pg.list();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}

}
