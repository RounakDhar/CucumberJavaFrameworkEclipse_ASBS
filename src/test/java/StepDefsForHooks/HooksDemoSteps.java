package StepDefsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {

//	WebDriver driver = null;
//
//	@Before(order = 1) //"@SanityTest"
//	@SuppressWarnings("deprecation")
//	public void browserSetup() {
//
//		System.out.println("I am Inside Browser Setup");
//
//		System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
//		driver = new EdgeDriver();
//
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//		driver.manage().window().maximize();
//	}
//
//	@Before(order = 0)
//	public void steup2() {
//
//		System.out.println(" I am inside setup2 \n");
//	}
//
//	@After(order = 1)
//	public void tearDown() {
//
//		System.out.println("I am Inside Tear Down");
//
//		driver.close();
//	}
//
//	@After(order = 2)
//	public void tearDown2() {
//
//		System.out.println("   I am Inside Tear Down\n");
//
//		driver.close();
//	}
//
//	@BeforeStep
//	public static void beforeSteps() {
//		System.out.println("I am Inside Before Step");
//
//	}
//
//	@AfterStep
//	public static void afterSteps() {
//		System.out.println("I am Inside After Step");
//
//	}
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
//	}
//
//	@When("user enter valid username and password")
//	public void user_enter_valid_username_and_password() {
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
//	}

}
