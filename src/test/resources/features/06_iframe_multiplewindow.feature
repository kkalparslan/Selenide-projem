Feature: iframe _ windows


    @iframe
    Scenario: TC_01 iframe and window
      Given User should go to the url "https://testcenter.techproeducation.com/index.php?page=iframe"
      And User should switch to frame 1
      And User should click to Back to TechProEducation.com button
      And switch to window 2
      And User should keeps the page open