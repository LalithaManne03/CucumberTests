package Stepdef;

import org.openqa.selenium.WebDriver;

import Hooks.Pretest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountActions {
	
	
	@Given("I want to write a step with (.+)$")
	public void writeTest(String name)
	{
		System.out.println(name);
		
	}
	   
	   @When("^I check for the (.+) in step")
	   		public void checktest(Integer value)
	   		{
	   		System.out.println(value);
		   
			   }
	    @Then("^I verify the (.+) in step$")
	    public void verify(String status)
	    {
	    	System.out.println(status);
	    }
}



