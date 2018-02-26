package testcases.AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIinkYourAmazon {

	public static void main(String[] args) {
		// verify link Your amazon
		System.setProperty("webdriver.chrome.driver", "../AmazonTest/src/test/java/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.co.uk");
		//Verify link of the page
		driver.findElement(By.linkText("Your Amazon.co.uk")).click();
		//driver.findElement(By.linkText("Forgot Password")).click();
		
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("sadforyou@gmail.com");
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("rockstar");
		
		WebElement submit = driver.findElement(By.id("signInSubmit"));
		submit.click();
	}
 
}
