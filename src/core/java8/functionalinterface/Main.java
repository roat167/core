package core.java8.functionalinterface;

public class Main implements FunctionalInterface_1, FunctionalInterface_2 {

	@Override
	public void doSomething2() {
	}

	@Override
	public void doSomething(String st) {
	}

	
	/**
	 * Must override the defaultMethod1()
	 * Main class won't compile without having it's own defaultMethod1() implementation
	 */
	@Override
	public void defaultMethod1(String st) {
		//FunctionalInterface_1.super.defaultMethod1(st);
		//FunctionalInterface_2.super.defaultMethod1(st);
		System.out.println("Main Class :: defaultMethod1()::" + st);
		FunctionalInterface_1.print("This java");
	}

	public static void main(String[] args) {
		System.out.println("Let's use FunctionalInterface");
		System.out.println("==================================");
		Main clz = new Main();
		clz.defaultMethod1("Olive Apple");
	}
}
