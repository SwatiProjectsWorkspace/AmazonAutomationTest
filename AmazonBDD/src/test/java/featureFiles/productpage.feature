Feature:
As a customer
I want to search for product
So that I can buy the product 

Background:
Given I am on product page "https://www.amazon.co.uk/Calvin-Klein-Parfum-Spray-Women/dp/B000JBWZQC/ref=sr_1_16_s_it?s=beauty&ie=UTF8&qid=1514664917&sr=1-16&keywords=perfumes"

Scenario: Verify searching for perfume
Given I am on Home page
When I type perfumes "perfumes" into "//input[@id='twotabsearchtextbox']"  search box field
And I click on "//input[@type='submit']" submit element
Then I should see perfumes "perfumes" in "//span[@id='s-result-count']" search result page
And I click on "//a[@title='Calvin Klein Eau De Parfum Spray for Women, 50 ml']" calvin perfume
And I should product detail for "Calvin Klein Eau De Parfum Spray for Women" in "span#productTitle" in the page
 
Scenario: Verify the customer reviews are present
When I click on "span#acrCustomerReviewText" customer review link
Then I should be taken to "h2#dp-customer-review-header" customer reviews
 
Scenario: To select size of perfume
When I see sizerange on "div#variation_size_name" perfume
And I click on "span#a-autoid-10" size of perfume 
Then "button#a-autoid-10-announce" 100 ml size should be selected
 
Scenario: To select quantity from dropdown list and adding the product to the basket
When I select quantity from "select#quantity" dropdown 
And I click on "input#add-to-cart-button" add to cart button
And I click on "a#hlb-ptc-btn-native" prooceed to checkout
Then I should see "input#ap_email" sign in page


  