package PMO_example2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
//		launch the webapp
		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
		driver.manage().window().maximize();
//		create page class obj
		RegistrationPage register = new RegistrationPage(driver);
		
		register.enterFirstName("Rutuja");
		register.enterLastName("Mane");
		register.enterPhoneNum("1212567890");
		register.enterEmail("abx@gmail.com");
		register.enteraddress("flat-20");
		register.entercity("Pune");
		register.enterstate("Maharashtra");
		register.enterpostal("411104");
		register.selectCountry(4);
		register.enterUserID("RutujaMMMM");
		register.enterpassword("qwe@121");
		register.enterConfirmPass("qwe@121");
		register.scrollDown();
		register.clickSubmit();
		Thread.sleep(4000);
		
		
	}

}
