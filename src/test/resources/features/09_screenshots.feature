
  Feature: screenshots

    @wholescreenshot
    Scenario: TC_01 whole screen shot
      Given User should go to the url "https://www.google.com"
      And User should take all screen shot

      @googleimage
      Scenario: TC_02 screenshot of a specific element
      Given User should go to the url "https://www.google.com"
      And User should take screenshot of google image

