package testcases.AmazonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class VerifyHomePageTitle {

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "../AmazonTest/src/test/java/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.co.uk");
		Thread.sleep(3000);

		//Verify title of the page
		String expectedTitle = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more"; 
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		//Verify page Url
		String expectedUrl = "www.amazon.co.uk/";
		String actualUrl = driver.getCurrentUrl();
	
		Assert.assertEquals(expectedUrl, actualUrl);
		
		driver.quit();
	}

}
