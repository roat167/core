package core.designpattern.singleton;

/**
 * create singleton instance with lazy initialization This works fine for single
 * threaded environment.
 */
public class SingletonWithLazyInit {
	private static SingletonWithLazyInit instance;

	// private constructor
	private SingletonWithLazyInit() {
		// load resource
	}

	// public access singleton instance
	public static SingletonWithLazyInit getInstance() {
		if (instance == null) {
			instance = new SingletonWithLazyInit();
		}
		return instance;
	}
}
