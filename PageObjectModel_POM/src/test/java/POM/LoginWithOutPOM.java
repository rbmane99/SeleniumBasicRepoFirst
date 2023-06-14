package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithOutPOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//launch chrome browser
		ChromeOptions co= new ChromeOptions();
		co.addArguments("-remote-allow-origins=*");
		WebDriver driver= WebDriverManager.chromedriver().capabilities(co).create();
//		open url
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//		username
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("standard_user");
		
//		password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
//		loginBtn
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
	}

}
