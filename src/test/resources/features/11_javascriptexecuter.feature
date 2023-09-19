Feature: js executor

  @scrollwithjs
  Scenario: js executor

    Given User should go to the url "https://b2c-tr.tiens.com/"
    And User should take all screen shot
    And User should scroll as footer element is visible
    And User should take all screen shot
    # Then User should keeps the page open