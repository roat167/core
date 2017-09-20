package core.java.basic;

/** Static belong to class, it used for memory management
 * Static: 
 * - variable (class variable) 
 * - method (class method)
 * - block 
 * - nested class
 */

public class Static {
	// Static variable
	// it get memory only once in class area at the time of class loading
	private static String commonMsg = "Common msg";
	
	// Static method
	// can be invoked without the need for creating an instance of a class.
	// can access static data member and can change the value of it.
	// Restriction: can not use non static data member or call non-static method directly
	// this and super keyword can't be use in static context
	public static void displayMsg(String msg) {
		System.out.println(msg);
	}
	
	// Static block: used to initialize the static data member.
	// It is executed before main method at the time of class loading
	static {
		System.out.println("invoked static block.......");
	}
	
	public static void main(String[] args) {
		System.out.println(Static.commonMsg);
		Static.displayMsg("Uses static method");
		
		Static.NestedClass inner = new Static.NestedClass();
		inner.displayText("Static Nested Class from outerClass Static");
	}

	// can access static data members of outer class including private.
	// can be accessed by outer class name.
	// cannot access non-static data members and methods.
	// cannot access non-static (instance) data member or method.
	static class NestedClass {
		
		static {
			System.out.println("Invoke static block of nested class");
		}
		
		void displayText(String txt) {
			System.out.println("Hello " + txt);
		}
	}
}


