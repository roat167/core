package core.java.basic;

/**
 * Final: use for restriction purpose
 * - variable: value cannot be changed. It will be constant
 * - method: cannot be overridden
 * - class: cannot be extended
 */
public class Final {
	// blank final variable
	static final int a;
	
	// final variable
	final int b = 90;
	
	static {
		a = 10;
	}	
	
	// final method
	final int addMethod(int val) {
		//a = a + val; // a is constant 
		return Final.a + val;
	}

	public static void main(String[] args) {
		Final test = new Final();
		System.out.println(test.addMethod(10));		
	}
}

final class ImmutableClass { // no class can extends it
	
}
