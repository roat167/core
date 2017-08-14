package io.kapp.core.java.basic.cloning;

import java.io.Serializable;

//Deep cloning with Serialization: All objects implement Serializable
public class Contact_1 implements Serializable {
	private static final long serialVersionUID = 1L;

	String name;
	int age;

	public Contact_1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Name: %s, age: %d ", this.name, this.age);
	}
}
