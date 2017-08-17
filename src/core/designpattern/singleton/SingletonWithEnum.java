package io.kapp.core.designpattern.singleton;

/**
 * Remember that Java enum values are globally accessible, so is the singleton
 */
public enum SingletonWithEnum {

	INSTANCE;

	public static void doSomething() {
		// implements
	}
}
