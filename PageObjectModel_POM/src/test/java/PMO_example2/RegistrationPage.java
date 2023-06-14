package PMO_example2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver driver;
	
	public RegistrationPage(WebDriver d) {
		driver = d;
	}
		
//	Locate the webElements from the page
	
	By firstName = By.cssSelector("input[name='firstName']");
	By lastName  = By.name("lastName");
	By phone     = By.name("phone");
	By email_id  = By.id("userName");
	By address   = By.name("address1");
	By city      = By.name("city");
	By state     = By.name("state");
	By postalCode= By.name("postalCode");
	By country   = By.name("country");
	By username  = By.id("email");
	By password  = By.name("password");
	By confirm   = By.name("confirmPassword");
	By submit    = By.name("submit");
	
//	method to work on these elements
		
	public void enterFirstName(String fN) {
		driver.findElement(firstName).sendKeys(fN);
	}
	
	public void enterLastName(String lN) {
		driver.findElement(lastName).sendKeys(lN);
	}
	
	public void enterPhoneNum(String pN) {
		driver.findElement(phone).sendKeys(pN);
	}
	
	public void enterEmail(String email) {
		driver.findElement(email_id).sendKeys(email);
	}
	
	public void entercity(String city1) {
		driver.findElement(city).sendKeys(city1);
	}
	
	public void enteraddress(String add) {
		driver.findElement(address).sendKeys(add);
	}
	
	public void enterstate(String state1) {
		driver.findElement(state).sendKeys(state1);
	}
	
	public void enterpostal(String postal) {
		driver.findElement(postalCode).sendKeys(postal);
	}
	
	public void selectCountry(int countryCount) {
		Select options = new Select(driver.findElement(country));
		options.selectByIndex(countryCount);
	}
	
	public void enterUserID(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void enterConfirmPass(String pass2) {
		driver.findElement(confirm).sendKeys(pass2);
	}
	
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
	
	public void scrollDown() {
		Actions act =  new Actions(driver);
		act.sendKeys(Keys.END).perform();
	}
}
