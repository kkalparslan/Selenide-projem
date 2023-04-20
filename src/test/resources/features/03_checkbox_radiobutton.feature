

  Feature: checkbox and radio button

    @checkbox
    Scenario: TC01 checkbox
      Given User should go to the url "https://testcenter.techproeducation.com/index.php?page=checkboxes"
      And User should selects if "Checkbox1" is not selected
      And User should selects if "Checkbox2" is not selected
      And User should keeps the page open


    @red
    Scenario: TC02 radio button
      Given User should go to the url "https://testcenter.techproeducation.com/index.php?page=radio-buttons"
      And User should selects if "Red" is not selected
      And User should keeps the page open


    @football
    Scenario: TC03 radio button
      Given User should go to the url "https://testcenter.techproeducation.com/index.php?page=radio-buttons"
      And User should selects if "Football" is not selected
      And User should keeps the page open

