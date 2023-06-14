package PMO_example2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registrationPage_pageFactory {

	WebDriver driver;
	
	public registrationPage_pageFactory(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "input/[@name='firstName']")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(id="userName")
	WebElement email_id;
	
	@FindBy(name="address1")
	WebElement add;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPass;
	
	@FindBy(name="submit")WebElement btn;
	
	public void enterFirstName(String fN) {
		firstname.sendKeys(fN);
	}
	
	public void enterLastName(String lN) {
		lastname.sendKeys(lN);
	}
	
	public void enterPhoneNum(String pN) {
		phone.sendKeys(pN);
	}
	
	public void enterEmail(String email) {
		email_id.sendKeys(email);
	}
	
	public void entercity(String city1) {
		city.sendKeys(city1);
	}
	
	public void enteraddress(String add1) {
		add.sendKeys(add1);
	}
	
	public void enterstate(String state1) {
		state.sendKeys(state1);
	}
	
	public void enterpostal(String postal) {
		postalCode.sendKeys(postal);
	}
	
	public void selectCountry(int countryCount) {
		Select options = new Select((country));
		options.selectByIndex(countryCount);
	}
	
	public void enterUserID(String user) {
		username.sendKeys(user);
	}
	
	public void enterpassword(String passs) {
		pass.sendKeys(passs);
	}
	
	public void enterConfirmPass(String pass2) {
		confirmPass.sendKeys(pass2);
	}
	
	public void clickSubmit() {
		btn.click();
	}
	
	public void scrollDown() {
		Actions act =  new Actions(driver);
		act.sendKeys(Keys.END).perform();
	}
}


