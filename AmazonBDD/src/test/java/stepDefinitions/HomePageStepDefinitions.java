package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.WebConnector;

public class HomePageStepDefinitions extends WebConnector {
	@Given("^I am on homepage$")
	public void i_am_on_homepage() throws Throwable {
	    driver.get(baseUrl);
	    Thread.sleep(3000);
	}
	
	    @Then("^I should see \"([^\"]*)\" pagetitle$")
	    public void i_should_see_pagetitle(String arg1) throws Throwable {
	    	Assert.assertEquals(arg1, driver.getTitle());
	}
	    @When("^I type \"([^\"]*)\" into \"([^\"]*)\" field$")
	    public void i_type_into_field(String arg1, String arg2) throws Throwable {
	        driver.findElement(By.xpath(arg2)).sendKeys(arg1);
	        Thread.sleep(3000);
}
	    @When("^I click on \"([^\"]*)\" element$")
	    public void i_click_on_element(String arg1) throws Throwable {
	    	driver.findElement(By.xpath(arg1)).click();
	    	Thread.sleep(3000);
	    }

	    
	    @Then("^I should see \"([^\"]*)\" in \"([^\"]*)\" element$")
	    public void i_should_see_in_element(String arg1, String arg2) throws Throwable {
	    	String text = driver.findElement(By.xpath(arg2)).getText();
	    	Assert.assertTrue(text.contains(arg1));
	    }
	    
	    @When("^I click on \"([^\"]*)\" on home page$")
	    public void i_click_on_on_home_page(String arg1) throws Throwable {
	    	driver.findElement(By.linkText(arg1)).click();
	        
	    }

	    @Then("^I should see \"([^\"]*)\"$")
	    public void i_should_see(String arg1) throws Throwable {
	    	driver.findElement(By.xpath(arg1)).click();
	       
	    }
	    
	    @When("^I click on \"([^\"]*)\" logo$")
	    public void i_click_on_logo(String arg1) throws Throwable {
	        driver.findElement(By.xpath(arg1)).click();
	    }
	    

	    @Then("^I should see changed \"([^\"]*)\" url$")
	    public void i_should_see_changed_url(String arg1) throws Throwable {
	       Assert.assertTrue(arg1.contains("ref=nav_logo"));
	    }
	    
	    @When("^I click on \"([^\"]*)\" your amazon link$")
	    public void i_click_on_your_amazon_link(String arg1) throws Throwable {
	       driver.findElement(By.linkText(arg1)).click();
	    }

	    @Then("^I should see \"([^\"]*)\" email box$")
	    public void i_should_see_email_box(String arg1) throws Throwable {
	       driver.findElement(By.xpath(arg1)).isSelected();
	       Thread.sleep(3000);
	    }
	    
	    @When("^I click on \"([^\"]*)\" today deals link$")
	    public void i_click_on_today_deals_link(String arg1) throws Throwable {
	        driver.findElement(By.linkText(arg1)).click();
	    }

	    @Then("^I should see  \"([^\"]*)\" in \"([^\"]*)\" today deal on page$")
	    public void i_should_see_in_today_deal_on_page(String arg1, String arg2) throws Throwable {
	    	String text = driver.findElement(By.cssSelector(arg2)).getText();
	    	Assert.assertTrue(text.contains(arg1));
	    }
	    
	    @When("^I click on \"([^\"]*)\" gift card and top up link$")
	    public void i_click_on_gift_card_and_top_up_link(String arg1) throws Throwable {
	        driver.findElement(By.linkText(arg1)).click();
	    }

	    @Then("^I should see \"([^\"]*)\" gifts and topup card text$")
	    public void i_should_see_gifts_and_topup_card_text(String arg1) throws Throwable {
	        driver.findElement(By.xpath(arg1)).isDisplayed();
	    }
	   
	    @When("^I click on \"([^\"]*)\" sell link$")
	    public void i_click_on_sell_link(String arg1) throws Throwable {
	        driver.findElement(By.linkText(arg1)).click();
	    }

	    @Then("^I should see  \"([^\"]*)\" increase image$")
	    public void i_should_see_increase_image(String arg1) throws Throwable {
	        driver.findElement(By.cssSelector(arg1)).isDisplayed();
	    }
	    
	    @When("^I click on \"([^\"]*)\" help link$")
	    public void i_click_on_help_link(String arg1) throws Throwable {
	       driver.findElement(By.linkText(arg1)).click();
	    }

	    @Then("^I should see \"([^\"]*)\" in \"([^\"]*)\" help page$")
	    public void i_should_see_in_help_page(String arg1, String arg2) throws Throwable {
	        String text = driver.findElement(By.xpath(arg2)).getText();
	        Assert.assertTrue(text.contains(arg1));
	    }
	    
	    @When("^I click on \"([^\"]*)\" basket link$")
	    public void i_click_on_basket_link(String arg1) throws Throwable {
	       driver.findElement(By.cssSelector(arg1)).click();
	    }

	    @Then("^I should see \"([^\"]*)\" cart information$")
	    public void i_should_see_cart_information(String arg1) throws Throwable {
	        driver.findElement(By.cssSelector(arg1)).isDisplayed();
	    }
	    @When("^I put cursor on \"([^\"]*)\" your list$")
	    public void i_put_cursor_on_your_list(String arg1) throws Throwable {
	        Actions mouseHoverYourLists = new Actions(driver);
	        mouseHoverYourLists.moveToElement(driver.findElement(By.cssSelector(arg1))).build().perform();
	        Thread.sleep(3000);
	    }
	    

	    @When("^I put my cursor on \"([^\"]*)\" find a list element$")
	    public void i_put_my_cursor_on_find_a_list_element(String arg1) throws Throwable {
	        Actions mouseHoverFindAList = new Actions(driver);
	       driver.findElement(By.linkText(arg1)).click();
	        Thread.sleep(3000);
	    }

	    @Then("^I should see \"([^\"]*)\" in \"([^\"]*)\" find a wish list page$")
	    public void i_should_see_in_find_a_wish_list_page(String arg1, String arg2) throws Throwable {
	        String text = driver.findElement(By.xpath(arg2)).getText();
	        Assert.assertTrue(text.contains(arg1));
	    }
	    @When("^I put my cursor on \"([^\"]*)\" hello sign-in your account$")
	    public void i_put_my_cursor_on_hello_sign_in_your_account(String arg1) throws Throwable {
	        Actions mousehoverHelloSignIn = new Actions(driver);
	        mousehoverHelloSignIn.moveToElement(driver.findElement(By.cssSelector(arg1))).build().perform();
	        Thread.sleep(3000);
	    }

	    @When("^I click on \"([^\"]*)\" sign in button$")
	    public void i_click_on_sign_in_button(String arg1) throws Throwable {
	       driver.findElement(By.cssSelector(arg1)).click();
	    }

	    @Then("^I should see \"([^\"]*)\" changed sign in url$")
	    public void i_should_see_changed_sign_in_url(String arg1) throws Throwable {
	        Assert.assertTrue(arg1.contains("ap/signin"));
	    }
	    
	    @When("^I put cursor on \"([^\"]*)\" shop by Department logo$")
	    public void i_put_cursor_on_shop_by_Department_logo(String arg1) throws Throwable {
	        Actions mousehoverDepatment = new Actions(driver);
	        mousehoverDepatment.moveToElement(driver.findElement(By.cssSelector(arg1))).build().perform();
	        Thread.sleep(3000);
	    }

	    @When("^I put cursor on \"([^\"]*)\" fire tv$")
	    public void i_put_cursor_on_fire_tv(String arg1) throws Throwable {
	        Actions mousehoverFireTV = new Actions(driver);
	        mousehoverFireTV.moveToElement(driver.findElement(By.xpath(arg1))).build().perform();
	        Thread.sleep(3000);
	    }

	    @When("^I click on \"([^\"]*)\" all new fire tv element$")
	    public void i_click_on_all_new_fire_tv_element(String arg1) throws Throwable {
	        driver.findElement(By.xpath(arg1)).click();
	    }

	    @Then("^I should see \"([^\"]*)\" AllNewFireTV page$")
	    public void i_should_see_AllNewFireTV_page(String arg1) throws Throwable {
	        driver.findElement(By.cssSelector(arg1)).isDisplayed();
	    }

	    @When("^I click on \"([^\"]*)\" searchDropdown options$")
	    public void i_click_on_searchDropdown_options(String arg1) throws Throwable {
	        driver.findElement(By.cssSelector(arg1)).click();
	    }

	    @When("^I select \"([^\"]*)\" books from items$")
	    public void i_select_books_from_items(String arg1) throws Throwable {
	        driver.findElement(By.xpath(arg1)).click();
	    }

	    @Then("^I should see \"([^\"]*)\" in \"([^\"]*)\" search box$")
	    public void i_should_see_in_search_box(String arg1, String arg2) throws Throwable {
	    	driver.findElement(By.cssSelector(arg2)).sendKeys(arg1);
	    Thread.sleep(3000);
	    	
	    }
	    
	    @Then("^I click on \"([^\"]*)\" submit button$")
	    public void i_click_on_submit_button(String arg1) throws Throwable {
	    	Actions mousehoverSubmit = new Actions(driver);
	    	mousehoverSubmit.moveToElement(driver.findElement(By.cssSelector(arg1))).click();
	    }

	    @When("^I click on \"([^\"]*)\" link$")
	    public void i_click_on_link(String arg1) throws Throwable {
	    	WebElement footer = driver.findElement(By.cssSelector(arg1));
	    	footer.findElement(By.tagName("td")).getSize();
	    	 
	    }
	    @When("^I go to \"([^\"]*)\" link$")
	    public void i_go_to_link(String arg1) throws Throwable {
	        Actions mousehoverFooter = new Actions(driver);
	        mousehoverFooter.moveToElement(driver.findElement(By.cssSelector(arg1))).build().perform();
	        Thread.sleep(3000);
	    }

	    @When("^I click on \"([^\"]*)\" careers link$")
	    public void i_click_on_careers_link(String arg1) throws Throwable {
	       driver.findElement(By.linkText(arg1)).click();
	       Thread.sleep (3000);
	    }

	    @Then("^I should see \"([^\"]*)\" find job is present$")
	    public void i_should_see_find_job_is_present(String arg1) throws Throwable {
	    	Boolean isdiplayed = driver.findElement(By.cssSelector(arg1)).isDisplayed();
	    	Thread.sleep(3000);
	    }

	    @Then("^I should navigate back to home page$")
	    public void i_should_navigate_back_to_home_page() throws Throwable {
	        driver.navigate().back();
	        Thread.sleep(3000);
	    }

	    @When("^I go to \"([^\"]*)\" footer link$")
	    public void i_go_to_footer_link(String arg1) throws Throwable {
	      Actions mousehoverFooter = new Actions(driver);
	      mousehoverFooter.moveToElement(driver.findElement(By.cssSelector(arg1))).build().perform();
	      Thread.sleep(3000);
	    }

	    @When("^I click on help \"([^\"]*)\" link$")
	    public void i_click_on_hlp_link1(String arg1) throws Throwable {
	        driver.findElement(By.linkText(arg1)).click();
	        Thread.sleep(3000);
	    }
	    
	    
	    @Then("^I should see \"([^\"]*)\" help you with element$")
	    public void i_should_see_help_you_with_element(String arg1) throws Throwable {
	      driver.findElement(By.xpath(arg1)).isDisplayed();
	      Thread.sleep(3000);
	      driver.navigate().back();
	      Thread.sleep(3000);
	    }

	    @When("^I go to \"([^\"]*)\" footer$")
	    public void i_go_to_footer(String arg1) throws Throwable {
	        Actions mousehoverFooterSell = new Actions(driver);
	        mousehoverFooterSell.moveToElement(driver.findElement(By.cssSelector(arg1))).build().perform();
	        Thread.sleep(3000);
	    }

	    @When("^I click on \"([^\"]*)\" sell on amazon link$")
	    public void i_click_on_sell_on_amazon_link(String arg1) throws Throwable {
	        driver.findElement(By.linkText(arg1)).click();
	        Thread.sleep(3000);
	    }

	    @When("^I should see \"([^\"]*)\" changed sell link$")
	    public void i_should_see_changed_sell_link(String arg1) throws Throwable {
	    	Assert.assertTrue(arg1.contains("services/sell"));
	    	 Thread.sleep(3000);
	    }

	    @When("^I navigate back to home page$")
	    public void i_navigate_back_to_home_page() throws Throwable {
	        driver.navigate().back();
	        Thread.sleep(3000);
	    }

	    @When("^I go to \"([^\"]*)\" footer link again$")
	    public void i_go_to_footer_link_again(String arg1) throws Throwable {
	     Actions mousehoverFooter = new Actions(driver);
	     mousehoverFooter.moveToElement(driver.findElement(By.cssSelector(arg1))).build().perform();
	     Thread.sleep(3000);
	    }

	    @When("^I click on \"([^\"]*)\"$")
	    public void i_click_on(String arg1) throws Throwable {
	        driver.findElement(By.linkText(arg1)).click();
	        Thread.sleep(3000);
	    }

	    @Then("^I should see \"([^\"]*)\" help content$")
	    public void i_should_see_help_content(String arg1) throws Throwable {
	        driver.findElement(By.xpath(arg1)).isDisplayed();
	        Thread.sleep(3000);
	        driver.navigate().back();
	    }


	     
	   
}