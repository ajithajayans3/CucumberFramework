Feature: Feature to test login functionality


Scenario: Verify the login is successful or not

Given user is on login page
When user enteres username and password
And clicks on login button
Then user is navigated to the home page