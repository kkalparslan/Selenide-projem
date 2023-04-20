
  Feature: actions

    @draganddrop
    Scenario: TC_01 drag and drop
      Given User should go to the url "https://jqueryui.com/droppable/"
      And User should switch to frame 1
      And User should drag and drop the source element
      Then User should keeps the page open


    @draganddropby
    Scenario: TC_02 drag and drop by
      Given User should go to the url "https://jqueryui.com/droppable/"
      And User should switch to frame 1
      And User should drag the source element to coordinates 300 by 10
      And User should verify the element has been dragged to coordinate 300 by 10