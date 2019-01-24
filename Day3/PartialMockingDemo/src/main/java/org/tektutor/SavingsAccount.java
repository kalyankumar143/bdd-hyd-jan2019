package org.tektutor;

public class SavingsAccount {

	private int accountNo;
	private double balance;

	public SavingsAccount( int accountNo ) {
		this.accountNo = accountNo;
		this.balance   = 0.0;
	}

	public double updateBalance ( double balance ) {
		this.balance = balance;
		System.out.println ( "Updated balance in DB" );
		return this.balance;
	}

	public double getBalance() {
		System.out.println ("DB interaction happens here in getBalance method ...");
		return balance;
	}

	public double deposit( double amount ) {
		double currentBalance = getBalance();

		balance = currentBalance + amount;

		System.out.println ( "Original deposit method invoked ...");

		updateBalance ( balance );
	
		return balance;
	}
}
