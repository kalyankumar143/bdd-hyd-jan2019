package org.tektutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class Steps {

	private SavingsAccount savingsAccount;
	private int accountNo;
	private double expectedBalance, actualBalance, currentBalance;
	private double amountDeposited;

	@Given("^the accountNo is \"(.*?)\"$")
	public void the_accountNo_is(String strAccountNo) throws Throwable {
		accountNo = Integer.parseInt( strAccountNo );
		savingsAccount = new SavingsAccount ( accountNo );
	}

	@Given("^the current balance is INR \"(.*?)\"$")
	public void the_current_balance_is_INR(String currentBalance) throws Throwable {
		this.currentBalance  = Double.parseDouble ( currentBalance );
	}

	@When("^I deposit INR \"(.*?)\"$")
	public void i_deposit_INR(String amountDeposited) throws Throwable {
		this.amountDeposited = Double.parseDouble ( amountDeposited );		
	}

	@Then("^I expect the current balance as INR \"(.*?)\"$")
	public void i_expect_the_current_balance_as_INR(String expectedBalance) throws Throwable {
		this.expectedBalance = Double.parseDouble ( expectedBalance );
		//Partial mocking
		SavingsAccount savingsAccountSpy = spy ( savingsAccount );

		//Stubbing - hardcoding response of getBalance method
		doReturn(currentBalance).when(savingsAccountSpy).getBalance();

		double actualBalance = savingsAccountSpy.deposit( amountDeposited );

		assertEquals ( this.expectedBalance, actualBalance, 0.0001 );

		verify ( savingsAccountSpy, times(1) ).getBalance();
		verify ( savingsAccountSpy, times(1) ).updateBalance(anyDouble());
	}

}
