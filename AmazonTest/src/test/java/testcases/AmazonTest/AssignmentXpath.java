package testcases.AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AssignmentXpath {

	public static void main(String[] args) throws InterruptedException {
		// To design xpath for 20 elements
		
		System.setProperty("webdriver.chrome.driver", "../AmazonTest/src/test/java/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.co.uk");
		Thread.sleep(3000);
	
		
//Shop by department
		WebElement dropdown = driver.findElement(By.xpath("//span[@class = 'nav-line-2']"));
		dropdown.click();

//try prime on amazaon logo
driver.findElement(By.xpath("//a[@class='nav-logo-tagline nav-sprite nav-prime-try']")).click();

//on amazon logo so that it should take you to home page
driver.findElement(By.xpath("//div[@id='nav-logo']")).click();

//click on shop now
driver.findElement(By.xpath("//div[@id='image-shoveler-ns_7BRY2CF72S1V4B9RCW3W_3594_']")).click();

//for price filters
driver.findElement(By.xpath("//div[@id='widgetFilters']")).click();

		



//for try prime
driver.findElement(By.xpath("//a[@id='nav-link-prime']")).click();

//start your 30 day trial
driver.findElement(By.xpath("//span[@class='a-button a-spacing-small a-button-primary']")).click();

//Create your amazon account
driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();

//enter user name
WebElement name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
name.sendKeys("Ram");

driver.findElement(By.xpath("//div[@id='auth-customerName-missing-alert']"));

//sign in -email
WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
email.sendKeys("sadforyou@gmail.com");

//missing email
driver.findElement(By.xpath("[//div[@id='auth-email-invalid-email-alert']"));

 //forget passsword
 driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']")).click();
 
 //password
 WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
 password.sendKeys("rockstar");

// click sign in 
 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
 
 
 
 
//	last order date for christmas		
 driver.findElement(By.xpath("//map[@id='nav-swm-holiday-map']")).click();

  driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
	
//Find dropdown element 
   driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']")).click();
 
 
 
 
// What are cookies
 driver.findElement(By.xpath("//div[@id='asin-shoveler-ns_11WSNK05QEAE4CJZM2FH_236_']")).click();
		
// Careers
 driver.findElement(By.xpath("//a[@class='nav_a']")).click();
 
//Get Help
		driver.findElement(By.xpath("//a[@class = 'a-link-normal']"));		
				
//Amazon video
		driver.findElement(By.xpath("//div[@id='nav-subnav']"));
		
//Select "Amazon Global stores" option from search dropdown
    driver.findElement(By.xpath("//a[@id='nav-link-wishlist']")).click();
 
    driver.findElement(By.xpath("//a[@id='a-autoid-0-announce']")).click();
		
		
	}

}
