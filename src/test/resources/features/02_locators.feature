@locators
  Feature: locators

    Scenario: TC01 locators
      Given User should go to the url "https://testcenter.techproeducation.com/index.php?page=form-authentication"
      And User should be wait 3 seconds
      And User should enter username
      And User should be wait 3 seconds
      And User should enter userpassword
      And User should be wait 3 seconds
      When User should click submit button
      And User should be wait 3 seconds
      Then User should verify that he is on homepage

      # 1. feature file oluştur
      # 2. test case leri yaz
      # 3. yeni test adımları için yeni bir step definitions class oluştur ve step definitions
      # (java methodları) oluştur.
      # 4. page class olustur--> pages klasorunun altinda
      # 5. kullanici adi, sifresi ve submit butonunu o sayfada bul
