Feature: Login
Description: This feature is to test the login functionality

Scenario: Successful Login with valid credentials
Given User is on Home page
When User enters UserName and Password
And Clicks on Login button
Then He can vist the practice page
When Clicks on User icon
Then All the User options will be displayed
And User clicks on LogOut option
Then User will LogOut