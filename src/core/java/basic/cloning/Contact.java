package io.kapp.core.java.basic.cloning;

import java.util.Date;

//Deep cloning with clone : All objects implement clone method
public class Contact {
	String name;
	String gender;
	Date dob;

	public Contact() {
	}

	public Contact(String name, String gender, Date dob) {
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}

	public Contact clone() {
		Contact p = new Contact();
		p.name = this.name;
		p.gender = this.gender;
		p.dob = this.dob;

		return p;
	}
}