Feature: Develop a RPN Calculator to evaluate math expressions given as reverse polish notation.
         This application will take valid postfix math expression, evaluates it and gives out the result.

	Scenario Outline: Should be able to evaluate simple addition
		Given the input is <input> 
		When I invoke evaluate method
		Then I expect <output> as the result

		Examples:
			| input      |  output |
			| "10 15 +"  |  "25.0" |
			| "100 150 +"|  "250.0"|
			| "200 15 +" |  "215.0"|

	Scenario Outline: Should be able to evaluate simple subtraction 
		Given the input is <input> 
		When I invoke evaluate method
		Then I expect <output> as the result

		Examples:
			| input      |  output |
			| "25 15 -"  |  "10.0" |
			| "150 100 -"|  "50.0" |
			| "200 15 -" |  "185.0"|

	Scenario Outline: Should be able to evaluate simple multiplication 
		Given the input is <input> 
		When I invoke evaluate method
		Then I expect <output> as the result

		Examples:
			| input      |  output   |
			| "25 10 *"  |  "250.0"  |
			| "150 100 *"|  "15000.0"|
			| "200 10 *" |  "2000.0" |

	Scenario Outline: Should be able to evaluate simple division 
		Given the input is <input> 
		When I invoke evaluate method
		Then I expect <output> as the result

		Examples:
			| input      |  output   |
			| "25 5 /"   |  "5.0"    |
			| "100 100 /"|  "1.0"    |
			| "200 10 /" |  "20.0"   |


	Scenario: Should be able to evaluate complex rpn expression 
		Given the input is "15 7 1 1 + - / 3 * 2 1 1 + + -" 
		When I invoke evaluate method
		Then I expect "5.0" as the result
