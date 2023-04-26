package stepdefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TestCenterPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;


public class TestCenterStepDefinition {

    TestCenterPage testCenterPage = new TestCenterPage();

    @Given("User should enter username")
    public void user_should_enter_username() {
        testCenterPage.userName.setValue("techproed");
    }
    @Given("User should enter userpassword")
    public void user_should_enter_userpassword() {
        testCenterPage.userPassword.setValue("SuperSecretPassword");
    }
    @When("User should click submit button")
    public void user_should_click_submit_button() {
        testCenterPage.submitBttn.click();
    }
    @Then("User should verify that he is on homepage")
    public void userShouldVerifyThatHeIsOnHomepage() {
        //        Assert.assertTrue(testCenterPage.messageText.isDisplayed());//JUNIT
        //        testCenterPage.messageText.shouldBe(Condition.visible);
        testCenterPage.messageText.shouldBe(visible); // SELENIDE ASSERTION
        /**
         * FAIL EDERSE EKRAN GORUNTUSU OTOMATIK OLARAK ALINIR VE build DOSYASINA KAYDEDILIR
         */
    }

    // DROPDOWN STEP DEFS
    @And("User should selects if {string} is not selected")
    public void userShouldSelectsIfIsNotSelected(String text) {
        //eğer text = checkbox1 ve checkbox1 seçili değilse checkbox1 e tıkla
        if(text.equals("Checkbox1") && !testCenterPage.checkbox1.isSelected()){
            testCenterPage.checkbox1.click();
           // Assert.assertTrue(testCenterPage.checkbox1.isSelected()); selenium assert
           // testCenterPage.checkbox1.shouldBe(Condition.checked); //selenide assert kısa veriyonu aşağıda
            testCenterPage.checkbox1.shouldBe(checked);
        }
        if (text.equals("Checkbox2") && !testCenterPage.checkbox2.isSelected()){
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }
        if (text.equals("Red")&& !testCenterPage.red.isSelected()){
            testCenterPage.red.shouldNotBe(checked);//secili olmadigini test et
            testCenterPage.red.click();//sec
            testCenterPage.red.shouldBe(checked);//secili oldugunu test et
        }

        if (text.equals("Football")&& !testCenterPage.football.isSelected()){
            testCenterPage.football.shouldNotBe(checked);//secili olmadigini test et
            testCenterPage.football.click();//sec
            testCenterPage.football.shouldBe(checked);//secili oldugunu test et
        }
    }

    @And("The user should select {int} as the year, {string} as the month, and {int} as the day.")
    public void theUserShouldSelectAsTheYearAsTheMonthAndAsTheDay(int year, String month, int day) {
     //   testCenterPage.year.selectOption(2000); makul değil index=2000 e gider.
     //   testCenterPage.year.selectOption(String.valueOf(year));//METIN = "2000". CALISIR
        testCenterPage.year.selectOption(String.valueOf(year));  // VALUE = "2000" CALİSİR
        sleep(3000);
        testCenterPage.month.selectOption(month); // görünen metin ile seç = "June" --POPULER--
        sleep(3000);
        testCenterPage.day.selectOptionByValue(String.valueOf(day)); // value = "15"
        sleep(3000);
    }

    // ALERT STEP DEFS
    @And("User should click alert prompt button")
    public void userShouldClickAlertPromptButton() {
        testCenterPage.promtButton.click();
    }
    @And("User should write {string} in the alert box and click OK")
    public void userShouldWriteInTheAlertBoxAndClickOK(String text) throws InterruptedException {
        switchTo().alert().sendKeys(text); // alert e feature file dan gelen metin girildi.
        sleep(3000);
        switchTo().alert().accept();
        sleep(3000);
        /**
         * selenide sleep. dynamic. ihtiyaç olursa bekler//thread sleep hard. her halükarda bekler.
         */
    }
    @Then("User should verify the text is {string}")
    public void userShouldVerifyTheTextIs(String message) {
        testCenterPage.sonuc.shouldHave(text(message));
        /**
         * Condition sınıfını static import yapınca sadece text() metodunu kullanabiliriz.
         * Featura file dan gelen metnin sonuç elementinde içerildiğini doğruluyoruz. TERCIH EDİLEN
         * Assert.assertTrue(testCenterPage.sonuc.getText().contains(message)); =>junit ile de assert edilebilir.
         */
    }
    @And("User should switch to frame {int}")
    public void user_should_switch_to_frame(Integer frame) {
        switchTo().frame(frame-1); // 1-1 = 0 index = 1. iframe
    }
    @And("User should click to Back to TechProEducation.com button")
    public void user_should_click_to_back_to_tech_pro_education_com_button() throws InterruptedException {
        testCenterPage.techProLink.click();
        System.out.println("TechPro Linkine Tiklandi ve Yeni pencere acildi");
        Thread.sleep(3000);
        //    System.out.println("SAYFA URL I : "+ WebDriverRunner.url());//DRIVER HALA TEST PAGE DE
        System.out.println("SAYFA URL I : "+ url()); //DRIVER HALA TEST PAGE DE
    }
    @And("switch to window {int}")
    public void switch_to_window(Integer targetWindow) throws InterruptedException {
        switchTo().window(targetWindow-1, Duration.ofSeconds(5));// INDEX. Duration.ofSeconds(5)) zorunlu degil
        System.out.println("Yeni pencereye gecil yapildi");
        Thread.sleep(3000);
        System.out.println("YENI SAYFA URL I : "+url());//YENI SAYFA URL NI VERECEKDIR
    }

    @And("User should drag and drop the source element")
    public void userShouldDragAndDropTheSourceElement() {
        //seleniumda;
        //Actions actions=new Actions(Buraya da Driver'ı koymamız gerekiyordu);

        //selenide de kısaca actions()
        //actions().dragAndDrop(testCenterPage.source, testCenterPage.target).perform(); bu şekilde de çalışır ama
        // build() ile birlikte kullanmak daha güzel olur.

        //1.dragAndDrop
        actions().
                dragAndDrop(testCenterPage.source, testCenterPage.target) // kaynak elementi hedefe surukle
                .build() // baglantiyi olustur (OPTIONAL)
                .perform(); // verilen komutlari yap (ZORUNLU)
    }
    @Given("User should drag the source element to coordinates {int} by {int}")
    public void user_should_drag_the_source_element_to_coordinates_by(Integer int1, Integer int2) {
        actions()
                .dragAndDropBy(testCenterPage.source,int1,int2)
                .build()
                .perform();
    }
    @Given("User should verify the element has been dragged to coordinate {int} by {int}")
    public void user_should_verify_the_element_has_been_dragged_to_coordinate_by(Integer int1, Integer int2) {
        String styleValue=testCenterPage.source.getAttribute("style");
        System.out.println(styleValue);
        Assert.assertTrue(styleValue.contains(String.valueOf(int1)) && styleValue.contains(String.valueOf(int2)));
    }

    @And("User should click the start button")
    public void user_should_click_the_start_button() {
        testCenterPage.startButton.click();
    }
    @And("User should verify the text {string}")
    public void user_should_verify_the_text(String message) {
        //Assert.assertEquals(message, testCenterPage.helloWorld.getText()); //fail; problem of wait
       // 1 WebDriverWait
//        WebDriverWait wait=new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(testCenterPage.helloWorld)); // explicit wait
//        Assert.assertEquals(message, testCenterPage.helloWorld.getText()); //pass; the problem solved with explicit wait

        //2. Selenide wait
        /**
         * burada selenium veya junit teki assertion ları (old fashion) webdriver wait kullanmaktansa, selenide deki daha
         * modern, kullanışlı ve kolay olan selenide assertionları ile birlikte explicit wait kullanılabilir
         */
//        testCenterPage.helloWorld.should(visible, Duration.ofSeconds(10)); // selenide wait
//        Assert.assertEquals(message, testCenterPage.helloWorld.getText());

        //3. Selenide wait
        testCenterPage.helloWorld.shouldHave(text("Hello World!"), Duration.ofSeconds(10));
        /**
         * burada tek satırda hem explicit wait kullanmıi hem de assertion yapmış olduk
         */
        System.out.println(testCenterPage.helloWorld.getText());
    }
}
