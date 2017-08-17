package core.java.domain;

import java.time.LocalDate;

public class Employee {	
	
	private String code;
	private String name;
	private Gender gender;
	private LocalDate dob;
	private String emailAddress;
	private double salary;
	

	public Employee(String code, String name, Gender gender, LocalDate dob, double salary) {
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.emailAddress = name + "@test.io";
		this.salary = salary;
	}
	
	public String getCode() {
		return this.code;
	}

	public String getName() {
		return this.name;
	}

	public Gender getGender() {
		return this.gender;
	}

	public LocalDate getDob() {
		return this.dob;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public double getSalary() {
		return this.salary;
	}
	
	public void display() {
		System.out.printf("Name: %s\t\tCode: %s\tGender: %s\tBirthday: %s\tSalary: %.2f \n", this.name, this.code, this.gender, this.dob, this.salary);
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\t\tCode: %s\tGender: %s\tBirthday: %s\tSalary: %.2f", this.name, this.code, this.gender, this.dob, this.salary);
	}
}
