package core.java8.functionalinterface;

@FunctionalInterface
public interface FunctionalInterface_2 {
	void doSomething2();
	default void defaultMethod1(String st) {
		System.out.println("Called FunctionalInterface_2 defaultMethod1::" + st);
	}	
}
