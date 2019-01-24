package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SavingsAccountTest {

	@Test
	public void testDepositWhenBalanceIsZero() {
		SavingsAccount savingsAccount = new SavingsAccount(1234);

		//Partial mocking
		SavingsAccount savingsAccountSpy = spy ( savingsAccount );

		//Stubbing - hardcoding response of getBalance method
		doReturn(0.0).when(savingsAccountSpy).getBalance();

		double actualBalance = savingsAccountSpy.deposit( 5000.00 );

		double expectedBalance = 5000.00;

		assertEquals ( expectedBalance, actualBalance, 0.0001 );

		verify ( savingsAccountSpy, times(1) ).getBalance();
		verify ( savingsAccountSpy, times(1) ).updateBalance(anyDouble());
	}
}
