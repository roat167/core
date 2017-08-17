package core.designpattern.abstractfactory;

/**
 * Abstract Factory (Creational Pattern): You can think of it as the factory of
 * factories (factory pattern). ex: DocumentBuilderFactory, XPathFactory
 * 
 * =====When====================================================================
 * - system should be independent of how its products are created - system with
 * one of multiple families or products - particular dependency that need to be
 * construct in run-time eg: which product to be call from a family on run-time
 * - need to supply one/more parameters that known at runtime before resolved
 * dependency
 * 
 * Notes: Factory Pattern versus Abstract Factory==============================
 * 
 * Factory Pattern:============================================================
 * 
 * - Have single factory class(ex: WalkerFactory) that return the different
 * sub-classes based on the input provided, the factory class uses if-else or
 * switch statement to achieve this.
 * 
 * Abstract Factory:===========================================================
 * 
 * - Get rid of if-else/switch statement 
 * - have a factory class for each sub-classes 
 * - an abstract class that will return sub-classes based on the factory class
 */
public class AbstractFactoryExample {	
	
	public static void main(String[] args) {
		AbstractFactoryConsumer c1 = new AbstractFactoryConsumer();
		
		System.out.println("============North Kingdom=========================");
		c1.createKingdom(new NorthKingdomFactory());
		System.out.printf("King: %s, Castle: %s \n", c1.getKing().getDescription(), c1.getCastle().getDescription());
		
		System.out.println("============West Kingdom==========================");
		c1.createKingdom(new WestKingdomFactory());
		System.out.printf("King: %s, Castle: %s \n", c1.getKing().getDescription(), c1.getCastle().getDescription());
	}	
}
