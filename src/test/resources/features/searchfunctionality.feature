Feature: To validate the flipkart application
Background:

Given Launch the Flipkart application
When close the popup
Then It should navigate to home page 
@tc001 @Regression
Scenario: To validate the search functionality
Given user enter the text in the search field
When clicks the search button
Then It should navigate to the search result page and display the relevent details
And Select Minimum and maximum amount
And Select the Brand
And Select the Ram
And select the batterycapacity
Then it should display Relavant result
@tc002 @Regression
Scenario: To validate the Faction Functionality
Given User to move the fashion link
When curser to move to the Kids link
And move to girls dress and click
And click the price high to low link
Then it display the relevant detals and get the title 