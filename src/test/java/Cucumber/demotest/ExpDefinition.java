package Cucumber.demotest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpDefinition {
	@Given("^User is in the login page to login$")
	public void beforeLogin() throws Throwable {
		System.out.println("User is in the login page !!");
	}

	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\" to login$")
	public void doLogin(String usr, String pwd) throws Throwable {
		System.out.println("user has logged in using "+usr+" and "+pwd);
	}

	@Then("^Home page must be displayed$")
	public void afterLogin() throws Throwable {
		System.out.println("Logged in successfully !!");
	}


}
