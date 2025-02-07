package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.Pretest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Actions {
	
	WebDriver driver= Pretest.driver;
	@Given("launch Chrome browser")
	public void launchBrowser() {
		driver.get("https://www.linkedin.com");
	
	}
	@When("navigate to linkedin")
	public void navigate() {
System.out.println("Navigate to linkedin");		
	}
	
	@When("click Sign in")
	public void signin(String st)
	{
		
		System.out.println(st);
		
	}
 
	@Then("I validate the outcomes")
	public void validate()
	{
		System.out.println("check result");

		
	}
	
	@Given("launch Chrome browser for OpenMRS")
	public void launchOpenMRS()
	{
		driver.get("https://o2.openmrs.org/openmrs/login.htm");

	}
	@When("navigate to OpenMRS")
	
	public void navOpenMRS()
{
		System.out.println("Navigate to OpenMRS");		

	}

	@When("click Sign in to OpenMRS")	
	public void SigninMRS()
{
		
		System.out.println("Sign in to OpenMRS");		

	}
	@Then("I validate the outcomes in OpenMRS")
	public void ValidateMRS()
{
		System.out.println("Validate registration");		

	}
	
}
