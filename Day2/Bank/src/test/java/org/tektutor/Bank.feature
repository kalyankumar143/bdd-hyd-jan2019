Feature: Implement a banking application that supports retrieving balance, depositing amount, 
         withdrawing amoun and fund transfer between accounts from same bank.

	Scenario: Should be able retrieve current balance, given an account number
		Given an account with account no "100" exits
		And the current balance is "500000.00"
		When I invoke getBalance endpoint url "http://localhost:8080/bank/getbalance"
		Then I should see "500000.00" as the balance
