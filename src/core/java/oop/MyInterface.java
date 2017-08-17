package core.java.oop;

/**
 * Interface: is used to achieve abstraction, support the functionality of
 * multiple inheritance, achieve loose coupling.
 */

interface A {
	// By default, variable declared in interface became static and final
	int x = 1;

	public void getX();
}

interface B {
	public void getY();
}

interface C extends A, B { // Interface can extends multiple interface
	class I { // using class inside interface
		int z = 3;

		public I() {
			System.out.println("instantiate class I...");
		}
	}
}

public class MyInterface implements C {
	int y = 2;
	@Override
	public void getX() {
		System.out.println(A.x + 10);
	}

	@Override
	public void getY() {
		System.out.println(this.y);
	}

	public static void main(String[] args) {
		MyInterface c1 = new MyInterface();
		// using its implementation
		A a = new MyInterface();
		B b = new MyInterface();
		C c = new MyInterface();

		System.out.println("========x From c1==========");
		c1.getX();
		System.out.println("========x From a==========");
		a.getX();

		System.out.println("========y From b==========");
		b.getY();
		System.out.println("========y From c==========");
		c.getY();

		// initialize inner class of interface
		// C.I innerClass = new C.I();
	}

}
