package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {
    // username
    public SelenideElement userName = $(By.id("exampleInputEmail1"));

    //userpassword
    public SelenideElement userPassword = $("#exampleInputPassword1");

    //submitbutton
    public SelenideElement submitBttn = $(By.xpath("//button[@type='submit']"));

    //Message
    public SelenideElement messageText = $(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));

    // checkbox
    public SelenideElement checkbox1 = $(By.id("box1"));
    public SelenideElement checkbox2 = $(By.id("box2"));

    // radio buttons
    public SelenideElement red = $(By.id("red"));
    public SelenideElement football = $(By.id("football"));

    // dropdowns
    public SelenideElement year = $(By.id("year"));
    public SelenideElement month = $(By.id("month"));
    public SelenideElement day = $(By.id("day"));

    // alerts
    public SelenideElement promtButton = $(By.xpath("//button[@onclick='jsPrompt()']"));
    public SelenideElement sonuc = $("#result");

    // iframe and multiple windows
    public SelenideElement techProLink = $(By.xpath("//a[@type='button']"));

    // ACTIONS
    public SelenideElement source = $("#draggable");
    public SelenideElement target = $("#droppable");

    // EXPLICIT WAIT
    public SelenideElement startButton= $(By.xpath("//button[.='Start']"));
    public SelenideElement helloWorld = $(By.xpath("//div[@id='finish']"));

    // SCREENSHOT
    public SelenideElement googleImage = $(".lnXdpd");

    // JS EXECUTOR
    public SelenideElement tiensFooter =$(".main-top");
}
