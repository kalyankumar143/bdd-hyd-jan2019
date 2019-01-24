package org.tektutor;

public class Account {
	
	private int accountNo;
	private String accountHolderName;
	private double accountBalance;

	public Account( int accountNo, String accountHolderName, double accountBalance ) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
}

