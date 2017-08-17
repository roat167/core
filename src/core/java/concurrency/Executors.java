package io.kapp.core.java.concurrency;

import java.util.concurrent.ExecutorService;

/**
 * Running thread in java is expensive operation java.util.concurrent.Executors
 * provide implementation of java.util.concurrent.Executor interface to create
 * the thread pool in java.
 */
public class Executors {

	public static void main(String[] args) {
		// creating fixed size thread pool of 3 worker threads.
		ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(3);
		// creating 5 jobs to the pool
		// thread will start working on 3 jobs other jobs will be in wait state,
		// as soon as one of the job is finished, another job from the wait
		// queue will be picked up and get executed.
		for (int i = 0; i < 5; i++) {
			Runnable worker = new ThreadWalker();
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
			// System.out.println("Thread still working...");
		}

		System.out.println("Threads finished");
	}

}
