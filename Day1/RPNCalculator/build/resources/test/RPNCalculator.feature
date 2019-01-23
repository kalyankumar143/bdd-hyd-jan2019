Feature: Develop a RPN Calculator to evaluate math expressions given as reverse polish notation.
         This application will take valid postfix math expression, evaluates it and gives out the result.

	Scenario: Should be able to evaluate simple addition
		Given the input is "10 15 +"
		When I invoke evaluate method
		Then I expect "25.0" as the result

