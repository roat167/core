package core.java.oop;

/**
 * Class: an abstract definition that has attribute(properties, states) and
 * actions(method, behavior)
 * 
 * Object: a specific instance of class which separate/different state from
 * other objects
 *
 */
public class ClassNObject {
	public static void main(String[] args) {
		Person p1 = new Person("Jen", 25); // Create object p1 of class person
		System.out.println(p1.toString());
		
		Person p2 = new Person("Jon", 37); // Create object p1 of class person
		System.out.println(p2.toString());
	}
}

/**
 * Class definition of Person which has person name and age
 */
class Person {
	String name;
	int age;	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {		
		return String.format("Name: %s, Age: %d \n", this.name, this.age);
	}
}
