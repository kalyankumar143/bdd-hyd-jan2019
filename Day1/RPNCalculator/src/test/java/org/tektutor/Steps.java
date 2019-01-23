package org.tektutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

public class Steps {
	private String rpnMathExpression;
	private RPNCalculator rpnCalculator = null;
	double expectedResult, actualResult;

	@Given("^the input is \"(.*?)\"$")
	public void the_input_is(String rpnMathExpression) throws Throwable {
		this.rpnMathExpression = rpnMathExpression;
		rpnCalculator = new RPNCalculator();
		expectedResult = actualResult = 0.0;
	}

	@When("^I invoke evaluate method$")
	public void i_invoke_evaluate_method() throws Throwable {
		actualResult = rpnCalculator.evaluate ( rpnMathExpression );
	}

	@Then("^I expect \"(.*?)\" as the result$")
	public void i_expect_as_the_result(String strExpectedResult) throws Throwable {
		expectedResult = Double.parseDouble ( strExpectedResult );	

		assertEquals ( expectedResult, actualResult, 0.0001 );
	}

}
