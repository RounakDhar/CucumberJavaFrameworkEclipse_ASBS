Feature: Check Login Functionality

@SanityTest
  Scenario: 
    Given user is on login page
    When user enter valid username and password
    And clicks on login button
    Then user is navigated to the home page
