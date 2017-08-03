package io.kapp.core.java.basic;

/**
 * used for finally block that follows try or catch block. Finally
 * block: is always executed whether exception is handle or not. 
 * Usage: for cleanup purpose like closing a file, connection
 */

public class Finally {
	
	public static void finallyWithException() {
		try {
			int x = 10 / 0;
			System.out.println("X value " + x);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block....");
		}
	}
	
	public static void finallyWithoutCatch() {
		try {
			int x = 10 / 0;
			System.out.println("X value " + x);
		} finally {
			System.out.println("Finally block WITHOUT Catch....");
		}
	}
	
	public static void main(String[] args) {
		Finally.finallyWithException();
		System.out.println("====================");
		Finally.finallyWithoutCatch();
	}

}
