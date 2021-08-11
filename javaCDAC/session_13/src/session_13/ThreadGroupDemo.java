package session_13;

public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // main thread
		System.out.println(Thread.currentThread().getThreadGroup().getName()); //main group
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); //system 
	}

}


//ThreadGroup:
//	Grouping threads together is ThreadGroup
	//Advantage : can perform common operations easily
	//ThreadGroup contains group of threads
	//In addition to threads,threadGroup can also contain sub thread groups
	//Every thread in java belongs to some threadgroup
	
	//main thread belongs to main group
    // Every thread group is child group of system group
	// Hence system group acts as a root for all thread group in java


	// two threads are running in the background one is main thread and other is garbage collector
