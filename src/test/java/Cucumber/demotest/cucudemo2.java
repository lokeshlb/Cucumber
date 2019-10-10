package Cucumber.demotest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucudemo2 {
	String str;
	@When("^Enter Hello World$")
	public void action() throws Throwable{
		str="Hello World";
	}
	
	
	@Then("^String will be displayed in the console$")
	public void display() throws Throwable{
		System.out.println(str);
	}

}
