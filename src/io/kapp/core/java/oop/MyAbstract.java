package io.kapp.core.java.oop;

public class MyAbstract {
	public static void main(String[] args) {
		Shape rec = new Retangle(); // upcasting
		rec.doSomething();
		rec.draw();
		// rec.method1(); // compile error, Shape doesn't have method1

		Elipse elipse = new Elipse();
		elipse.doSomething();
		elipse.draw();
		elipse.method1();
	}
}

abstract class Shape {
	abstract void draw();

	void doSomething() {
		System.out.println("Shape dosomething()");
	}
}

class Retangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing retangle...");
	}

	void method1() {
		System.out.println("Rectangle method1()");
	}
}

class Elipse extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing elipse...");
	}

	void method1() {
		System.out.println("Elipse method1()");
	}
}