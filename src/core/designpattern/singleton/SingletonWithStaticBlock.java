package io.kapp.core.designpattern.singleton;

/**
 * This approach similar to Eager Initialization, except the instance is created
 * in static block
 * 
 * why: provide option for exception handling
 */
public class SingletonWithStaticBlock {
	private static SingletonWithStaticBlock instance;

	// private constructor
	private SingletonWithStaticBlock() {
		// load resource
	}

	// static block
	static {
		try {
			instance = new SingletonWithStaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("Initilize singlton failed, exception occured..");
		}
	}

	// public access to singleton instance
	public static SingletonWithStaticBlock getInstance() {
		return instance;
	}
}
