package core.designpattern.builder;

/**
 * Builder pattern use to create a companion object, builder to construct domain
 * legal object. It helps simplify create object that has many fields or complex
 * by reducing the confusion in properties oder.
 * 
 * the build() method in builder call the actual constructor or concrete object
 * and return it. Set concrete class's constructor to private Builder class: is
 * static inner class of the concrete class (here it is Hero class)
 * 
 * From Iluwatar:>> The intention of the Builder pattern is to find a solution
 * to the telescoping constructor anti-pattern. The telescoping constructor
 * anti-pattern occurs when the increase of object constructor parameter
 * combination leads to an exponential list of constructors. Instead of using
 * numerous constructors, the builder pattern uses another object, a builder,
 * that receives each initialization parameter step by step and then returns the
 * resulting constructed object at once.
 * 
 * The Builder pattern has another benefit. It can be used for objects that
 * contain flat data (html code, SQL query, X.509 certificate...), that is to
 * say, data that can't be easily edited. This type of data cannot be edited
 * step by step and must be edited at once. The best way to construct such an
 * object is to use a builder class.<<
 */
public class BuilderExample {

	public static void main(String[] args) {
		System.out.println("==================Hunter====================================");
		Hero hunter = new Hero.Builder("Daryl", Profession.HUNTER)
				.withArmor(Armor.LEATHER)
				.withWeapon(Weapon.BOW)
				.build();
		System.out.println(hunter.toString());
		
		System.out.println("==================Warrior===================================");
		Hero warrior = new Hero.Builder("Jesus", Profession.WARRIOR)				
				.withWeapon(Weapon.BOW)
				.build();
		System.out.println(warrior.toString());
		
		System.out.println("==================Assualt===================================");
		Hero assualt = new Hero.Builder("Rosita", Profession.ASSUALT)				
				.withWeapon(Weapon.MACHINE_GUN)
				.build();
		System.out.println(assualt.toString());		
	}
}
