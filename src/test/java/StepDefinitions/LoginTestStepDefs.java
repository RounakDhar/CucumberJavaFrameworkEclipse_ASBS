package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("deprecation")
public class LoginTestStepDefs {

	WebDriver driver = null;
	
	
	@SuppressWarnings({ "deprecation", "deprecation" })
	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("Inside Step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:" + projectPath);

		System.setProperty("webdriver.firefox.driver", projectPath + "/src/test/resources/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@And("user is on login page")
	public void user_is_on_login_page() {

		driver.navigate().to("https://example.testproject.io/web/");
		//driver.get("https://example.testproject.io/web/");

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {

		driver.findElement(By.id("name")).sendKeys("Test");
		driver.findElement(By.id("password")).sendKeys("12345");

		Thread.sleep(2000);

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		driver.findElement(By.xpath("//button[@onclick='performLogin()']")).click();
	}

//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//
//		driver.findElement(By.xpath("//button[@onclick='performLogout()']")).isDisplayed();
//
//		Thread.sleep(2000);
//
//		driver.close();
//
//	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_user1_and_pass1(String username, String password) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		Thread.sleep(2000);
		
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		driver.findElement(By.xpath("//button[@onclick='performLogout()']")).isDisplayed();

		Thread.sleep(2000);

		driver.close();

	}

	

}
