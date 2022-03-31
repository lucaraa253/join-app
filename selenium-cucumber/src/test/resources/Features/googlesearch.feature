Feature: to test google search functionality

@googletest
  Scenario: check if the google search feature functions correctly
    Given  browser is open
    And user is on home page
    When user enters the search criteria in the search bar
    And user clicks on the search button
    Then user is navigated to the display page of the searched item
