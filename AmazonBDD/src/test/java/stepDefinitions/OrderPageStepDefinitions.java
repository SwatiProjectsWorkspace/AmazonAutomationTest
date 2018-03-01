package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;

public class OrderPageStepDefinitions extends WebConnector {

	
	@When("^I enter email \"([^\"]*)\" in \"([^\"]*)\" box$")
	public void i_enter_email_in_box(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.cssSelector(arg2)).sendKeys(arg1);
	    Thread.sleep(3000);
	}

	@When("^I enter password \"([^\"]*)\" in \"([^\"]*)\" password field$")
	public void i_enter_password_in_password_field(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.cssSelector(arg2)).sendKeys(arg1);
	    Thread.sleep(3000);
	}
	
	@When("^I click on \"([^\"]*)\" submit button there$")
	public void i_click_on_submit_button_there(String arg1) throws Throwable {
	    driver.findElement(By.cssSelector(arg1)).click();
	}

	@Then("^I should see \"([^\"]*)\" text in \"([^\"]*)\" delivery address page$")
	public void i_should_see_text_in_delivery_address_page(String arg1, String arg2) throws Throwable {
	   String text = driver.findElement(By.cssSelector(arg2)).getText();
	   Assert.assertTrue(text.contains(arg1));
	   Thread.sleep(3000);
	}
	@When("^I click on \"([^\"]*)\" delivery to thi address button$")
	public void i_click_on_delivery_to_thi_address_button(String arg1) throws Throwable {
	    driver.findElement(By.xpath(arg1)).click();
	    Thread.sleep(3000);
	    }

	@Then("^I should see \"([^\"]*)\" in \"([^\"]*)\" on shopping cart page$")
	public void i_should_see_in_on_shopping_cart_page(String arg1, String arg2) throws Throwable {
	    String text = driver.findElement(By.cssSelector(arg2)).getText();
	    Assert.assertTrue(text.contains(arg1));
	}

	@When("^I click on \"([^\"]*)\" continue option$")
	public void i_click_on_continue_option(String arg1) throws Throwable {
	    driver.findElement(By.xpath(arg1)).click();
	}

	@Then("^I should see payment method options \"([^\"]*)\" in \"([^\"]*)\" payment page$")
	public void i_should_see_payment_method_options_in_payment_page(String arg1, String arg2) throws Throwable {
	    String text = driver.findElement(By.xpath(arg2)).getText();
	    Assert.assertTrue(text.contains(arg1));
	}



}
