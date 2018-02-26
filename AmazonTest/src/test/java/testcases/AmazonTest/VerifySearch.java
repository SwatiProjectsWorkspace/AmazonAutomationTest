package testcases.AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class VerifySearch {

	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "../AmazonTest/src/test/java/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximize browser window (screen, tablet view)
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.co.uk");
		Thread.sleep(3000);
	
//		//  find dropdown element using ID
//		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
//		dropdown.click();

//		//Find dropdown element using name
//		WebElement dropdown = driver.findElement(By.name("url"));
//		dropdown.click();
//		
//		//Find dropdown element using xpath
//		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//		dropdown.click();
//		
		
//		//find dropdown element using CSS selector
//		WebElement dropdown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
//		dropdown.click();

		//Select "All departments" option from search dropdown
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")) .sendKeys("All Departments");
		//type toys into search field
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")) . sendKeys("toys");
		//click on search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.findElement(By.cssSelector("input.nav-input")).click();
		Thread.sleep(3000);
		
		//Verify search results display
		String actualText = driver.findElement(By.xpath("//h1[@id='s-result-count']")).getText();
		Assert.assertTrue(actualText.contains("toys"));
		
		//Close browser
		driver.quit();
		
	}

}
