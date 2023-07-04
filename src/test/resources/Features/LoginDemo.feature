@SmokeScenario
Feature: Feature to Test Login Functionality

  @smoketest
  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage

 @smoketest
  Scenario: check login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the homepage
    
     @smoketest
  Scenario: check login with valid credentials
    Given user calculated 1/0
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the homepage

 @smoketest
  Scenario: check login with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    And clicks on login button
    Then error message is displayed - Invalid Credentials

  @unittest
  Scenario Outline: Check if login is successfull with valid credentials
    Given user is on login page
    When user enters <Username> and <Password>
    And clicks on login button
    Then user is navigated to the homepage

    Examples: 
      | Username | Password |
      | user1    | pass1    |
      | user2    | pass2    |
