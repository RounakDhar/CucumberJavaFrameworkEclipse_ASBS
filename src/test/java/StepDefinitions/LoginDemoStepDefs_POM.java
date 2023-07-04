package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoStepDefs_POM {
	
	WebDriver driver;
	
	
	public LoginDemoStepDefs_POM(WebDriver driver) {
		
		this.driver = driver;
		
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();

		System.out.println("Inside Step - User is on Login Page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		System.out.println("Inside Step -User Enters Username and Password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		System.out.println("Inside Step - Clicks on Login Button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		System.out.println("Inside Step -User is navigated to the HomePage");
	}

	@When("^user enters (.+) and (.+)$")
	public <Username, Password> void user_enters_user1_and_pass1(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		System.out.println("Inside Step - User Enters Username and Password");
	}

}
