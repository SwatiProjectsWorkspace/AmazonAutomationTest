package testcases.AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class VerifyHeaderLinks {

	public static void main(String[] args) throws InterruptedException {
		// To open browser
		System.setProperty("webdriver.chrome.driver", "../AmazonTest/src/test/java/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.uk");
		Thread.sleep(3000);
		
		//To verify Your amazon.co.uk
		driver.findElement(By.linkText("Your Amazon.co.uk")).click();
Thread.sleep(3000);
//u can find the title ctrl F (search title)
Assert.assertEquals("Amazon Sign In", driver.getTitle());



//Verify today's deal link
driver.get("https://www.amazon.co.uk");
Thread.sleep(3000);
driver.findElement(By.linkText("Today's Deals")).click();
Thread.sleep(3000);

Assert.assertEquals("Amazon UK Deals - Discover Our Daily Deals", driver.getTitle());

//Verify christmas store link page
driver.get("https://www.amazon.co.uk");
Thread.sleep(3000);
driver.findElement(By.linkText("Christmas Store")).click();
Thread.sleep(3000);

Assert.assertEquals("The Christmas Store @ Amazon.co.uk", driver.getTitle());

//Verify gift cards and top up
driver.get("https://www.amazon.co.uk");
Thread.sleep(3000);
driver.findElement(By.linkText("Gift Cards & Top Up")).click();
Thread.sleep(3000);

Assert.assertEquals("Gift Cards & Gift Vouchers : Amazon.co.uk", driver.getTitle());
driver.close();

	}

}
