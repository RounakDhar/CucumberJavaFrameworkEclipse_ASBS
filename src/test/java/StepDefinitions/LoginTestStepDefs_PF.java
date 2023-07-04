package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("deprecation")
public class LoginTestStepDefs_PF {

	WebDriver driver = null;
	LoginPage_PF loginpage;
	HomePage_PF homepage;

	public LoginTestStepDefs_PF(WebDriver driver) {

		this.driver = driver;

	}

	@SuppressWarnings({ "deprecation", "deprecation" })
	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("I am Inside ===LoginTestStepDefs_PF===");

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
		// driver.get("https://example.testproject.io/web/");

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {

		loginpage = new LoginPage_PF(driver);
		
		loginpage.enterUsername(null);
		loginpage.enterPassword(null);

		Thread.sleep(2000);

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		
		loginpage = new LoginPage_PF(driver);

		loginpage.clickOnLogin();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() throws InterruptedException {
		
		homepage = new  HomePage_PF(driver);

		homepage.checkLogOutIsDisplayed();
		Thread.sleep(2000);

		driver.close();

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_user1_and_pass1(String username, String password) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		
		loginpage = new LoginPage_PF(driver);

		loginpage.enterUsername(username);
		loginpage.enterPassword(password);

		Thread.sleep(2000);

		

	}

}
