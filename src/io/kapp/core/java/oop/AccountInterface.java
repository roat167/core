package io.kapp.core.java.oop;

/**
 *Interface declare a set of related method outside of any class
 */
public interface AccountInterface {
	Double getBalance();
	void deposit(double amount);
	void withdraw(double amount);
	void calculateInterest();
}
