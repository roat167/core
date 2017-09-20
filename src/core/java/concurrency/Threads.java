package core.java.concurrency;

public class Threads {

	public static void main(String[] args) throws InterruptedException {
		final Thread t1 = new Thread(new ThreadWalker());

		// this will call run() once the JVM has created the new thread
		t1.start();

		/*
		 * wait can be "woken up" by another thread calling notify on the
		 * monitor which is being waited on whereas a sleep cannot. Wait (and
		 * notify) must happen in a block synchronized on the monitor object.
		 */

		// wait(500);//will release lock
		// notify();//notify this waiting thread
		// notifyAll();//notify all waiting threads

		for (int i = 0; i < 10; i++) {
			System.out.println("From main Thread: " + Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}