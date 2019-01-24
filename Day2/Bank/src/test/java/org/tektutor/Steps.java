package org.tektutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import io.restassured.*;
import io.restassured.specification.*;
import io.restassured.response.Response;

public class Steps {

	private int accountNo;
	private String accountHolderName;
	private double actualBalance, expectedBalance;
	private String endPointUrl;

	private int statusCode;
	private Response response;
/*
	@Given("an account with account no {int} exits")
	public void an_account_with_account_no_exits(Integer accountNo) {
		this.accountNo = accountNo;
	}
	@Given("the current balance is {string}")
	public void the_current_balance_is(String expectedBalance) {
		this.expectedBalance = Double.parseDouble(expectedBalance);
	}

	@When("I invoke getBalance API")
	public void i_invoke_getBalance_API() {
		//this.endPointUrl = url;	
		RestAssured.baseURI = this.endPointUrl;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		response = request.get("");

		statusCode = response.getStatusCode();
	}

	@Then("I should see {string} as the balance")
	public void i_should_see_as_the_balance(String actualBalance) {
		this.actualBalance = Double.parseDouble ( actualBalance );
		assertEquals ( this.expectedBalance, this.actualBalance, 0.0001 );
	}
*/
}
