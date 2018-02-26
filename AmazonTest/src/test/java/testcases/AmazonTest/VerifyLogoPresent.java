package testcases.AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class VerifyLogoPresent {

	public static void main(String[] args) throws InterruptedException {
		//To open chrome browser
		System.setProperty("webdriver.chrome.driver", "../AmazonTest/src/test/java/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk");
		Thread.sleep(3000);
		
	
		// To find logo
		WebElement logo = driver.findElement(By.xpath("//div[@id='nav-logo']"));
		Assert.assertTrue(logo.isDisplayed());
				
	 //close browser
		driver.quit();
				
	

	}

}
