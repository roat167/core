package core.java.oop;

/*
 * Incomplete class definition (declared but not define, eg: calculateInterest)
 */
public abstract class AccountAbstraction implements AccountInterface {
	private String accountNumber;
	private Double interestRate;

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public abstract void calculateInterest();
}

class SavingAcc extends AccountAbstraction {
	private double amount;
	
	public SavingAcc(double amount, String accountNumber) {
		this.amount = amount;
		this.setAccountNumber(accountNumber);
	}

	@Override
	public Double getBalance() {
		return this.amount;
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			this.amount += amount;
		}
	}

	@Override
	public void withdraw(double amount) {
		if (this.amount > amount) {
			this.amount -= amount;
		}
	}

	@Override
	public String toString() {
		return String.format("SavingAcc: ACC: %s, Balance: %f", this.getAccountNumber(), this.getBalance());
	}

	@Override
	public void calculateInterest() {		
		this.amount += this.amount * 0.01; 
	}
}

class CheckingAcc extends AccountAbstraction {
	private double amount;

	public CheckingAcc(double amount, String accountNumber) {
		this.amount = amount;
		this.setAccountNumber(accountNumber);
	}

	@Override
	public Double getBalance() {
		return this.amount;
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			this.amount += amount;
		}
	}

	@Override
	public void withdraw(double amount) {
		if (this.amount > amount) {
			this.amount -= amount;
		}
	}

	@Override
	public String toString() {
		return String.format("CheckingAcc: ACC: %s, Balance: %f", this.getAccountNumber(), this.getBalance());
	}

	@Override
	public void calculateInterest() {
		this.amount += 0;		
	}
}
