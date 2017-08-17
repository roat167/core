package io.kapp.core.designpattern.singleton;

/**
 * Singleton pattern ensures at most one instance of a class exists at any given
 * time. The instance act as gatekeeper to shared resource or act as central
 * communication hub. Singleton is Object. Actual class use to create singleton
 * can be determine at runtime.
 * 
 * Method(s) must be synchronized in multi-threaded environments.
 * 
 * This is most widely use approach and thank to Bill Pugh
 */
public class Singleton {

	private Singleton() { // prevent other to create this class
	}

	/*
	 * Using inner class: so classloader is guaranteed to be serialized, so the
	 * inner class is loaded and initialized only once, no matter how many
	 * threads call getInstance simultaneously here it provides the lazy-loaded
	 * singleton instance
	 * 
	 * When the singleton class is loaded, SingletonHolder class is not loaded
	 * into memory and only when someone calls the getInstance method, this
	 * class gets loaded and creates the Singleton class instance
	 */
	private static class SingletonHolder {
		public static final Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}

	public void log(String message) {
		System.out.println(System.currentTimeMillis() + "::" + message);
	}
}
