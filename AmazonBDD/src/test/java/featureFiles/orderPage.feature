Feature: 
As a customer
I want to add a product to the cart
So that I can buy it

Background:
Given I am on product page "https://www.amazon.co.uk/Issey-Miyake-DIsseyl-Toilette-Spray/dp/B000052ZSS/ref=sr_1_35_s_it?s=beauty&ie=UTF8&qid=1514728644&sr=1-35&keywords=perfumes" 
And I select quantity from "select#quantity" dropdown
And I click on "input#add-to-cart-button" add to cart button
And I click on "a#hlb-ptc-btn-native" prooceed to checkout

Scenario: Entering the email and password information 
When I enter email "sadforyou@gmail.com" in "input#ap_email" box
And I enter password "rockstar" in "input#ap_password" password field
And I click on "input#signInSubmit" submit button there
Then I should see "Deliver to multiple addresses" text in "div#shipmultiplebox" delivery address page

@include
Scenario: Delivery to address
When I enter email "sadforyou@gmail.com" in "input#ap_email" box
And I enter password "rockstar" in "input#ap_password" password field
And I click on "input#signInSubmit" submit button there
And I click on "(//a[@data-action='page-spinner-show'])[1]" delivery to thi address button
And I click on "(//input[@class='a-button-text'])[1]" continue option
Then I should see payment method options "Select a payment method" in "//h1[@class='a-spacing-base']" payment page