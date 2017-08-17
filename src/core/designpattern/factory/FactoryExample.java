package core.designpattern.factory;

/**
 * Factory pattern is Creational Design Pattern
 * 
 * when: - a super class (interface, abstract class, normal class) and multiple
 * sub classes base on the input, then return one of its sub-class - need a new
 * instance of a custom builder instead of the global one - need to explicitly
 * define types of objects, that factory can build - need to separated builder
 * and creator interface
 */

public class FactoryExample {
	public static void main(String[] args) {
		/**
		 * Benefit: 
		 * - Provide approach to code for Interface rather than implementation 
		 * - Remove instantiation of actual implementation classes from client 
		 * code less coupled and easy to change
		 * - Abstraction between implementation and client classes through Inheritance
		 */

		// Based on the input parameter, different sub classes is Created and
		// Return
		Walker w1 = WalkerFactory.createWalker(WalkerType.NORMAL, new int[] { 0, 2, 10, 25, 25 });
		Walker w2 = WalkerFactory.createWalker(WalkerType.ARMOR, new int[] { 2, 4, 25, 30, 50 });
		Walker w3 = WalkerFactory.createWalker(WalkerType.BURNING, new int[] { 1, 2, 15, 20, 30 });

		System.out.println("====================Normal Walker====================================");
		System.out.println(w1);
		System.out.println("====================Armor Walker=====================================");
		System.out.println(w2);
		System.out.println("====================Burning Walker===================================");
		System.out.println(w3);
	}
}
