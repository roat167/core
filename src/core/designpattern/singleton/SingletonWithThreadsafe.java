package core.designpattern.singleton;

/**
 * The implementation is similar to Singleton with Lazy initialization except we
 * added 'synchronized' to public access instance
 * 
 * using synchronized to create a thread-safe singleton class
 */
public class SingletonWithThreadsafe {
	private static SingletonWithThreadsafe instance;

	// private constructor
	private SingletonWithThreadsafe() {
		// load resource
	}

	// public access singleton instance
	public static synchronized SingletonWithThreadsafe getInstance() {
		if (instance == null) {
			instance = new SingletonWithThreadsafe();
		}
		return instance;
	}
}
