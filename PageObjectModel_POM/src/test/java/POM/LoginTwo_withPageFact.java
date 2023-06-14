package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTwo_withPageFact {
//	using page factory
	
	WebDriver driver;
	
//	constructor
	LoginTwo_withPageFact(WebDriver d){
		driver = d;
//		this method will create web element
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	
	public void enterUserName(String name) {
		username.sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void loginClick() {
		loginBtn.click();
		
	}
	
}