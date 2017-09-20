package core.java.oop;

public class InterfaceUsage {
	/**
	 * Interface: is used to achieve abstraction, support the functionality of
	 * multiple inheritance, achieve loose coupling.
	 */
	public static void main(String[] args) {
		// savingAcc and checkingAcc are implementation of AccountInterface
		AccountInterface savingAccount = new SavingAcc(100.0, "65400135");
		AccountInterface checkingAccount = new CheckingAcc(25.0, "55500240");

		// class implements interface by deriving from it and providing a
		// definition for the method
		savingAccount.calculateInterest();
		checkingAccount.calculateInterest();

		System.out.println(savingAccount.toString());
		System.out.println(checkingAccount.toString());
	}
}
