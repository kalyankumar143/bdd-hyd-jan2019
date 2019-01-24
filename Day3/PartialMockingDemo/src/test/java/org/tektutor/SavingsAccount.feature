Feature: Implement a Savings account class
	
	Scenario: Should be able deposit amount to an existing account
		Given the accountNo is "1234"
		And the current balance is INR "50000.00"
		When I deposit INR "4000.00"
		Then I expect the current balance as INR "54000.00"
	
