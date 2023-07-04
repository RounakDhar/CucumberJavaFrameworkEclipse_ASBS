package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	 WebDriver driver;

	public HomePage_PF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this); //HomePage_PF.class

	}

	@FindBy(xpath = "//button[@onclick='performLogout()']")
	WebElement btn_logout;

	public void checkLogOutIsDisplayed() {

		btn_logout.isDisplayed();
	}

}
