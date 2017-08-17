package core.java.basic;

/**
 * The covariant return type specifies that the return type may vary in the same
 * direction as the subclass. Before Java5, it was not possible to override any
 * method by changing the return type. Since Java5, it is possible to override
 * method by changing the return type if subclass overrides any method whose
 * return type is Non-Primitive but its return type to subclass type
 */
public class CovariantReturnType {
	public static void main(String[] args) {
		new B().get().message();
		/**
		 * Return type of get() method of A class is A
		 * return type of get() method of B class is B
		 * Both method have different return type 
		 * But it is method overriding. 
		 * >>This is known as covariant return Type<<
		 */
	}
}

class A {
	A get() {
		return this;
	}
}

class B extends A {
	B get() {
		return this;
	}

	void message() {
		System.out.println("Covaraiant return type");
	}
}
