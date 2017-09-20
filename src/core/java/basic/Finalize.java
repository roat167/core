package core.java.basic;

/**
 * used to perform some final operations or clean up operations on an object
 * before it is removed from the memory
 */
public class Finalize {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("invoke finallize");
	}

	public static void main(String[] args) throws Throwable {
		Finalize f = new Finalize();
		Finalize ff = new Finalize();
		f = null;

		ff.finalize(); // explicit call finalize

		ff = null;
		System.out.println("=====================");
		// this will implicit call finalize, that will collect f and ff
		System.gc();

		// This won't guarantee that it will execute finalize() method.
		// Runtime.getRuntime().runFinalization();

		// Note about gc
		/*
		 * Whenever you run a java program, JVM creates three threads. 1) main
		 * thread 2) Thread Scheduler 3) Garbage Collector Thread.
		 */
	}
}
