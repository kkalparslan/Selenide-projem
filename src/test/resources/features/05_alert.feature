Feature: alerts

    @alert
    Scenario: TC_01 alert
      Given User should go to the url "https://testcenter.techproeducation.com/index.php?page=javascript-alerts"
      And User should click alert prompt button
      And User should write "Hello" in the alert box and click OK
      Then User should verify the text is "Hello"
