
@crossbrowser
  Feature: cross browser

   @headless
   Scenario: TC_01 headless
     Given User should select the browser "headless"
     Given User should go to the url "https://www.amazon.com/"
     Then User should take all screen shot

     # aslında yine arka planda chrome ile çalışıyor ama browser görünmeden testi yürütüyor. süre hemen hemen aynı gibi
     # olsa da biraz daha az gibi..Headless tarayıcılar, kullanıcı arayüzü (UI) olmadan çalışan tarayıcılardır.
       # Bu tarayıcılar, web sayfalarının otomatik testleri, veri toplama işlemleri ve web sayfalarının içeriklerinin
         # otomatik olarak oluşturulması gibi çeşitli amaçlar için kullanılabilirler. Genel olarak headless browser denir.

    @chrome
    Scenario: TC_02 chrome
      Given User should select the browser "chrome"
      Given User should go to the url "https://www.amazon.com/"
      Then User should take all screen shot

    @edge
    Scenario: TC_03 edge
      Given User should select the browser "edge"
      Given User should go to the url "https://www.amazon.com/"
      Then User should take all screen shot

    # safari windows da edge browser da mac te hata veriyor..

      # Test caselerin farklı tarayıcılarda çalıştırılmasına cross browser (çapraz tarayıcı testi) testing denir.
      # Selenide test caseleri default olarak chrome da çalışır.
      # Configuration class farklı browserlar için kullanılabilir.