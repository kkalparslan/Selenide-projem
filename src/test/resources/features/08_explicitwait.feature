  Feature: explicit wait

    @wait
    Scenario: TC_01 explicit wait
      Given User should go to the url "https://the-internet.herokuapp.com/dynamic_loading/1"
      And User should click the start button
      And User should verify the text "Hello World!"
      And User should keeps the page open

        # local, elemente (has, özel) göre verilen bir wait çeşidi. maksimum bekleme süresini versekte elmenti gördüğü
        # anda bekleme süresinin tamamlanmasını beklemeden diğer işleme geçer.