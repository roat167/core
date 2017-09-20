package core.designpattern.singleton;

/**
 * Class created at the time of class loading so the instance is created whether
 * client is using or not. This is not a best practice.
 * 
 * This approach may be used for only small resources.
 */
public class SingletonWithEagerInit {

	private static final SingletonWithEagerInit instance = new SingletonWithEagerInit();

	// private constructor
	private SingletonWithEagerInit() {
		// load resource
	}
	
	public static SingletonWithEagerInit getInstance() {
		return SingletonWithEagerInit.instance;
	}
}
