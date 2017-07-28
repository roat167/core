package io.kapp.core.java.concurrency;

public class Threads {

	public static void main(String[] args) throws InterruptedException {
		final Thread t1 = new Thread(new ThreadWalker());
		
		//this will call run() once the JVM has created the new thread
		t1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("From main Thread: " + Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}