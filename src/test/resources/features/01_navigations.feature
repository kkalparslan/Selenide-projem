
@google
Feature: Navigations

  Scenario: TC 01 Navigation Test
    Given User should go to the url "https://www.google.com"
    And User should be wait 5 seconds
    Then User should go to the url "https://www.amazon.com"
    And User should be wait 5 seconds
    Then User should go the previous page
    And User should be wait 5 seconds
    Then User should go the next page
    And User should be wait 5 seconds
    Then User should refresh the page
    And User should be wait 5 seconds
    And User should keeps the page open