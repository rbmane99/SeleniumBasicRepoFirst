package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//witout page factory
public class LoginPageWithPOM {

	
	WebDriver driver;
	//constructor
	LoginPageWithPOM(WebDriver d){
		driver = d;
	}
	
	//locate WebElements
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");
	
	public void enterUserName(String name) {
		driver.findElement(username).sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void loginClick() {
		driver.findElement(loginBtn).click();
		
	}
	//adding somethin
}
