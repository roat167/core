package io.kapp.core.java.concurrency;

/**
 * ShutdownHook to perform cleanup resource or save the state when(before) JVM
 * shuts down. Eg: clean resource means closing log file, sending some alerts or
 * something else.
 */

public class ShutdownHookExample {
	public static synchronized strictfp void main(String[] args) throws InterruptedException {
		MainThread r = new MainThread();
		Thread thread = new Thread(r);
		thread.start();

		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		MyThread th3 = new MyThread();

		System.out.println("State before th1: " + th1.getState());
		th1.start();
		th1.join(); // will start th2, th3 once th1 is completed
		System.out.println("State after th1: " + th1.getState());

		th2.setDaemon(true); // backend support thread
		th2.start();
		th3.start();

		// This will break out the thread only if it is sleeping/waiting
		// Else it won't interrupt the thread, set interrupt status to true
		th2.interrupt(); // interrupt th2 thread

		Runtime rt = Runtime.getRuntime();
		rt.addShutdownHook(new ShutdownHook());

	}
}

class ShutdownHook extends Thread {

	@Override
	public void run() {
		System.out.println("Starting cleanup resource or save state before application exit");
	}
}

class MainThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Starting....");
	}
}

class MyThread extends Thread {
	volatile int x = 1;

	@Override
	public void run() {
		System.out.printf("Name: %s, Daemon: %s, State: %s \n", Thread.currentThread().getName(),
				Thread.currentThread().isDaemon(), this.getState());

		for (int i = 0; i < 5; i++) {
			x = i;
			try {
				Thread.sleep(500);
				Thread.yield(); // pause and allow other threads to execute
			} catch (InterruptedException ex) {
				System.out.println(ex.getLocalizedMessage());
			}
			System.out.println("index: " + i);
		}
	}

}
