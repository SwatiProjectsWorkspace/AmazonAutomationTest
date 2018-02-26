package testcases.AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openbrowsers {

	public static void main(String[] args) throws InterruptedException {
		// Open firefox browser
		System.setProperty("webdriver.gecko.driver", "../AmazonTest/src/test/java/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.co.uk");
		Thread.sleep(3000);

		driver.quit();
		
	}

}
