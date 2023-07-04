package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM {

	WebDriver driver;

	public LoginPage_POM(WebDriver driver) {

		this.driver = driver;
		if (!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("this is not login page. The Current Page is" + driver.getCurrentUrl());
		}
		;

	}

	By txt_username_login = By.id("name");
	By txt_password_login = By.id("password");
	By btn_login = By.xpath("//button[@onclick='performLogin()']");
	By btn_logout = By.xpath("//button[@onclick='performLogout()']");

	public void enterUsername(String username) {

		driver.findElement(txt_username_login).sendKeys(username);
	}

	public void enterPassword(String password) {

		driver.findElement(txt_password_login).sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(btn_login).click();
	}

	public void loginValidUsers(String username, String password) {

		driver.findElement(txt_username_login).sendKeys(username);
		driver.findElement(txt_password_login).sendKeys(password);

		driver.findElement(btn_login).click();

	}

	public void checkLogOutIsDisplayed() {

		driver.findElement(btn_logout).isDisplayed();
	}

}
