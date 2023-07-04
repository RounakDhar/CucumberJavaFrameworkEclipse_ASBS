Feature: Check Home Page Functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify Quick Launch toolbar is present
    When user clicks on dashboard link
    Then Quick Launch toolbar is displayed
