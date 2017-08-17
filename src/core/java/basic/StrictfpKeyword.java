package core.java.basic;

/**
 * strictfp keyword ensures that you will get the same result on every platform
 * if you perform operations in the floating-point variable. provide better
 * control over the floating-point arithmetic.
 * 
 * It can be applied with class, interface and method, but NOT abstract method,
 * variable or constructor
 */
public class StrictfpKeyword {
	strictfp void strictfpMethod() {

	}
}

strictfp class Clazz {
}

strictfp interface StrictfpInterface {
}
