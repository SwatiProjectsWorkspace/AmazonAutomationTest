package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;

public class ProductPageStepDefinitions extends WebConnector {
	@Given("^I am on Home page$")
	public void i_am_on_Home_page() throws Throwable {
		driver.get(baseUrl);
		Thread.sleep(3000);
	}

	@When("^I type perfumes \"([^\"]*)\" into \"([^\"]*)\"  search box field$")
	public void i_type_perfumes_into_search_box_field(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.xpath(arg2)).sendKeys(arg1);
	}
	
	@When("^I click on \"([^\"]*)\" submit element$")
	public void i_click_on_submit_element(String arg1) throws Throwable {
	    driver.findElement(By.xpath(arg1)).click();
	}

	@Then("^I should see perfumes \"([^\"]*)\" in \"([^\"]*)\" search result page$")
	public void i_should_see_perfumes_in_search_result_page(String arg1, String arg2) throws Throwable {
	    String text = driver.findElement(By.xpath(arg2)).getText();
	    Assert.assertTrue(text.contains(arg1));
	}

	
	@Then("^I click on \"([^\"]*)\" calvin perfume$")
	public void i_click_on_calvin_perfume(String arg1) throws Throwable {
	   driver.findElement(By.xpath(arg1)).click();
	   Thread.sleep(3000);
	}

	@Then("^I should product detail for \"([^\"]*)\" in \"([^\"]*)\" in the page$")
	public void i_should_product_detail_for_in_in_the_page(String arg1, String arg2) throws Throwable {
	    String text = driver.findElement(By.cssSelector(arg2)).getText();
	    Assert.assertTrue(text.contains(arg1));
	    Thread.sleep(3000);
	}
	@Given("^I am on product page \"([^\"]*)\"$")
	public void i_am_on_product_page(String arg1) throws Throwable {
	    driver.get(arg1);
	    Thread.sleep(3000);
	}

	@When("^I click on \"([^\"]*)\" customer review link$")
	public void i_click_on_customer_review_link(String arg1) throws Throwable {
	    driver.findElement(By.cssSelector(arg1)).click();
	    Thread.sleep(3000);
	}

	@Then("^I should be taken to \"([^\"]*)\" customer reviews$")
	public void i_should_be_taken_to_customer_reviews(String arg1) throws Throwable {
	    Actions mousehoverCustomerReview = new Actions(driver);
	    mousehoverCustomerReview.moveToElement(driver.findElement(By.cssSelector(arg1))).build().perform();
	    Thread.sleep(3000);
	}

	@When("^I see sizerange on \"([^\"]*)\" perfume$")
	public void i_see_sizerange_on_perfume(String arg1) throws Throwable {
	   Actions mousehoverSizeRange = new Actions(driver);
	   mousehoverSizeRange.moveToElement(driver.findElement(By.cssSelector(arg1))).build().perform();
	}

	@When("^I click on \"([^\"]*)\" size of perfume$")
	public void i_click_on_size_of_perfume(String arg1) throws Throwable {
	    driver.findElement(By.cssSelector(arg1)).click();
	}

	@Then("^\"([^\"]*)\" (\\d+) ml size should be selected$")
	public void ml_size_should_be_selected(String arg1, int arg2) throws Throwable {
	    driver.findElement(By.cssSelector(arg1)).isSelected();
	    Thread.sleep(3000);
	}

	@When("^I select quantity from \"([^\"]*)\" dropdown$")
	public void i_select_quantity_from_dropdown(String arg1) throws Throwable {
		Select dropdown = new Select(driver.findElement(By.cssSelector(arg1)));
		dropdown.selectByVisibleText("3");
		Thread.sleep(3000);
		
	}

	@When("^I click on \"([^\"]*)\" add to cart button$")
	public void i_click_on_add_to_cart_button(String arg1) throws Throwable {
	    driver.findElement(By.cssSelector(arg1)).submit();
	}

	@When("^I click on \"([^\"]*)\" prooceed to checkout$")
	public void i_click_on_prooceed_to_checkout(String arg1) throws Throwable {
	    driver.findElement(By.cssSelector(arg1)).click();
	}

	@Then("^I should see \"([^\"]*)\" sign in page$")
	public void i_should_see_sign_in_page(String arg1) throws Throwable {
	    driver.findElement(By.cssSelector(arg1)).isSelected();
	}

	


}
