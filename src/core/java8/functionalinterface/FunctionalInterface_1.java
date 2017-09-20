package core.java8.functionalinterface;

/**
 * From Java 8, interfaces are enhanced to have method with implementation. We
 * can use default and static keyword to create interfaces with method
 * implementation
 * 
 * FunctionalInterface: An interface with exactly one abstract method. 
 * Ex: Runnable, Consumer, Supplier, Function and Predicate.
 * 
 * @FunctionalInterface annotation is added so that we can mark an interface as
 *                      functional interface.
 */

@FunctionalInterface
public interface FunctionalInterface_1 {
	void doSomething(String st);

	default void defaultMethod1(String st) {
		System.out.println("Called defaultMethod1::" + st);
	}

	default String defaultMethod2(String st) {
		System.out.println("Called defaultMethod2::" + st);
		return st;
	}
	
	static void print(String st) {
		System.out.println("Called static method print::" + st);
	}

	// Note: "A default method cannot override a method from java.lang.Object"
}
