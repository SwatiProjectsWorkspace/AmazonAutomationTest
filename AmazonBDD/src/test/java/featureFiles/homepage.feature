Feature:
As an amazon user
I should be able to navigate through homepage
So that I can see what's on offer

Background:
Given I am on homepage

Scenario: Verify home page title
Then I should see "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more" pagetitle


Scenario: Verify searching for toys
When I type "toys" into "//input[@id='twotabsearchtextbox']" field
And I click on "//input[@type='submit']" element
Then I should see "toys" in "//h1[@id='s-result-count']" element


Scenario Outline: Data driven for search functionality
When I type "<searchWord>" into "//input[@id='twotabsearchtextbox']" field
And I click on "//input[@type='submit']" element
Then I should see "<searchWord>" in "//h1[@id='s-result-count']" element
Examples:
| searchWord  |
| toys        |
|shoes        |

Scenario: Verify if logo is clickable
When I click on "//div[@id='nav-logo']" logo
Then I should see changed "https://www.amazon.co.uk/ref=nav_logo" url

Scenario: Verify try Prime link on logo
When I click on "Try Prime" on home page
Then I should see "//div[@id='primeDetailPage']"


Scenario: Verify your amazon.co.uk link
When I click on "Your Amazon.co.uk" your amazon link
Then I should see "//input[@id='ap_email']" email box

Scenario: Verify Last minute Christmas deals link
When I click on "Today's Deals" today deals link
Then I should see  "Today's Deals" in "div.gbh1-bold" today deal on page


Scenario: Verify gifts card and top up link
When I click on "Gift Cards & Top Up" gift card and top up link
Then I should see "//div[@id='merchandised-content']/table/tbody/tr/td/map" gifts and topup card text

Scenario: Verify Sell link
When I click on "Sell" sell link
Then I should see  "span.color-orange" increase image

Scenario: Verify help link
When I click on "Help" help link
Then I should see "Hello. What can we help you with?" in "//div[@class='a-section a-spacing-extra-large a-spacing-top-extra-large ss-landing-container']" help page

Scenario: Verify basket link
When I click on "a#nav-cart" basket link
Then I should see "form#activeCartViewForm" cart information

Scenario: Verify Your list link
When I put cursor on "a#nav-link-wishlist" your list 
And I put my cursor on "Find a List" find a list element
Then I should see "Find a Wish List" in "//div[@class='a-section a-spacing-none a-spacing-top-none pin-agnostic top-nav-container']" find a wish list page

Scenario: Verify Hello. Sign in Your Account
When I put my cursor on "a#nav-link-yourAccount" hello sign-in your account
And I click on "a.nav-action-button" sign in button
Then I should see "https://www.amazon.co.uk/ap/signin" changed sign in url

Scenario: Verify shop by department link
When I put cursor on "div#nav-shop" shop by Department logo
And I put cursor on "//span[text()='Fire TV']" fire tv
And I click on "//span[text()='All-New Fire TV']" all new fire tv element
Then I should see "div#imgTagWrapperId" AllNewFireTV page

Scenario Outline: Data driven search in dropdown for books
When I click on "select#searchDropdownBox" searchDropdown options
And I select "//option[text()='Books']" books from items
Then I should see "<searchword>" in "input#twotabsearchtextbox" search box
And I click on "span#nav-search-submit-text" submit button
Examples:
|searchword|
|The Great Gatsby|
|Inferno|
|Alice in Wonderland|

Scenario: Verify the footer link
When I go to "div#navFooter" link
And I click on "Careers" careers link
Then I should see "h1.find-jobs" find job is present
And I should navigate back to home page

Scenario: Verify the footer help link
When I go to "div#navFooter" footer link
And I click on help "Help" link
Then I should see "//div[@class='a-section a-spacing-extra-large a-spacing-top-extra-large ss-landing-container']/h1" help you with element

Scenario: Verify navigation from home and various pages
When I go to "div#navFooter" footer 
And I click on "Sell on Amazon" sell on amazon link
And I should see "https://services.amazon.co.uk/services/sell" changed sell link
And I navigate back to home page
And I go to "div#navFooter" footer link again
And I click on "Delivery Rates & Policies"
Then I should see "//div[@class='help-content']/h1" help content
And I should navigate back to home page

