package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoStepDefs {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("Inside Step - User is on Login Page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("Inside Step -User Enters Username and Password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("Inside Step - Clicks on Login Button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("Inside Step -User is navigated to the HomePage");
	}

	@When("^user enters (.+) and (.+)$")
	public void user_enters_user_and_pass(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("Inside Step -User Enters Username and Password");
		System.out.println(username);
		System.out.println(password);
		
	}

	@Then("error message is displayed - Invalid Credentials")
	public void error_message_is_displayed_invalid_credentials() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}
	
	@Given("user calculated {int}\\/{int}")
	public void user_calculated(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		int i = 1/0;
		System.out.println(i);
	}



}
