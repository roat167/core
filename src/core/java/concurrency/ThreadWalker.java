package io.kapp.core.java.concurrency;

public class ThreadWalker implements Runnable {
	@Override
	public void run() {		
		System.out.println("From (new) Thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished (new) Thread: " + Thread.currentThread().getName());

	}
}
