Feature: Test Login functionality

  @webproject
  Scenario: Check login is Successfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage

  @webproject
  Scenario Outline: Check if login is successfull with valid credentials
    Given user is on login page
    When user enters <Username> and <Password>
    And clicks on login button
    Then user is navigated to the homepage

    Examples: 
      | Username | Password |
      | Test     |    12345 |
      | Cases    |    12345 |
