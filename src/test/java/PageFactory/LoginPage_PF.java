package PageFactory;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

	WebDriver driver;

	public LoginPage_PF(WebDriver driver) {

		this.driver = driver;
		// PageFactory.initElements(driver, this); //LoginPage_PF.class

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);

		PageFactory.initElements(factory, this);

	}

	@FindBy(id = "name")
	@CacheLookup
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(xpath = "//button[@onclick='performLogin()']")
	WebElement btn_login;

	@FindBy(partialLinkText = "raghav")
	List<WebElement> myLinks;

	@FindBy(how = How.ID, using = "name")
	WebElement abc;

	public void enterUsername(String username) {

		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {

		txt_password.sendKeys(password);
	}

	public void clickOnLogin() {

		btn_login.click();
	}

}
