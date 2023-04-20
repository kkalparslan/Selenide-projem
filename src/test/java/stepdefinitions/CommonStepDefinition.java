package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Date;

import static com.codeborne.selenide.Selenide.*;

public class CommonStepDefinition {

    @Given("User should go to the url {string}")
    public void user_should_go_to_the_url(String string) {
        open(string); //bir sayfaya gitmek için open() fonksiyonu kullnılır
    }

    @Then("User should be wait {int} seconds")
    public void user_should_be_wait_seconds(Integer int1) {
        // selenide default olarak 4 saniye bekler. 4 saniyeden fazla beklemek için sleep methodu kullanılır.
        sleep(int1*1000);  //selenide de bekleme milisecond kabul eder. saniye ye çevirmek için 1000 ile çarpılmalıdır.
    }
    @Then("User should go the previous page")
    public void user_should_go_the_previous_page() {
        back();
    }
    @Then("User should go the next page")
    public void user_should_go_the_next_page() {
        forward();
    }
    @Then("User should refresh the page")
    public void user_should_refresh_the_page() {
        refresh();
    }

    @And("User should keeps the page open")
    public void userShouldKeepsThePageOpen() {
        //        Varyasilan selenide ayarlarinda, browser otomatik kapanmakdadir
        //        Configuration.holdBrowserOpen=false;//VARSAYILAN
        Configuration.holdBrowserOpen=true;
    }

    @And("User should take all screen shot")
    public void userShouldTakeAllScreenShot() {
        screenshot("image"); // parametreyi ekran görüntüsünü dinamik yapmak için (new Date().toString())
        // şeklinde yapılabiliyor. Ancak benim cihaz dahil windowslarda ss çıkmayabiliyor.
    }

    @Given("User should select the browser {string}")
    public void userShouldSelectTheBrowser(String browserTipi) {
        switch (browserTipi){
            case "headless":
                Configuration.headless=true;
                break;
            case "firefox":
                Configuration.browser="firefox";
                break;
            case "safari":
                Configuration.browser="safari";
                break;
            case "edge":
                Configuration.browser="edge";
                break;
            default:
                Configuration.browser="chrome";
                break;
        }
    }
}
