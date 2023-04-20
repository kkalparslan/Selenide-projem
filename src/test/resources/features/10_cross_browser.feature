
@crossbrowser
  Feature: cross browser

#    @headless
#    Scenario: TC_01 headless
#      Given User should select the browser "headless"
#      Given User should go to the url "https://www.amazon.com/"
#      Then User should take all screen shot

    @chrome
    Scenario: TC_02 headless
      Given User should select the browser "chrome"
      Given User should go to the url "https://www.amazon.com/"
      Then User should take all screen shot

    @edge
    Scenario: TC_03 headless
      Given User should select the browser "edge"
      Given User should go to the url "https://www.amazon.com/"
      Then User should take all screen shot