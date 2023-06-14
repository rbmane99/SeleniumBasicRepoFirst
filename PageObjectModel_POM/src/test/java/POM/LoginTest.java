package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		
//		launch the browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		
//		create object for login page
		//LoginPageWithPOM page = new LoginPageWithPOM(driver);
		LoginTwo_withPageFact page = new LoginTwo_withPageFact(driver);
		
//		open url
		driver.get("https://www.saucedemo.com/");
		page.enterUserName("standard_user");
		page.enterPassword("secret_sauce");
		page.loginClick();
		Thread.sleep(3000);
	}
}
