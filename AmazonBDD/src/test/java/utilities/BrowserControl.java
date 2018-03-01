package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserControl extends WebConnector {
	@Before
	public void openBrowser() throws Exception {
		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "../AmazonBDD/src/test/java/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
			else if (browserType.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","../AmazonBDD/src/test/java/resources/geckodriver.exe");
				driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}
	

	@After
	public void closeBrowser () throws Exception {
		driver.quit();
		}
		
	}

