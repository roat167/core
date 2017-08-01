package io.kapp.core.java.oop;

public class MyAbstract {

}

abstract class Shape {
	abstract void draw();
}

class Retangle extends Shape {

	@Override
	void draw() {		
		System.out.println("Drawing retangle...");
	}	
}

class Elipse extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing elipse...");		
	}	
}