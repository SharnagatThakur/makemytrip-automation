Feature: One Way Trip Search Functionality

  Scenario: User should be able to search for flights for one way trip
    When User navigates to MakeMyTrip URL
    Then User should be able to remove any pop ups on the home page
    Then User should be able provide From City input field
    And User should be able provide To City input field
    And User should be able to provide departure date
    And User clicks on the search button
    Then User should be landed to search page with flight details