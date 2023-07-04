Feature: Feature to Test Google Search Functionality

@GoogleSearch
  Scenario: Validate Google Search is Working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
