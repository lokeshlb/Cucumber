package Cucumber.demotest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SOStepDef {
	@Given("^user not logged in$")
	public void user_not_logged_in() throws Throwable {
		System.out.println("User is in login page");
	}

	@When("^user performs login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_performs_login_using_and(String arg1, String arg2) throws Throwable {
		System.out.println(arg1+" "+arg2);
	}

	@Then("^logged in Successfully$")
	public void logged_in_Successfully() throws Throwable {
		System.out.println("User logged in successfully !!");
	}
}
