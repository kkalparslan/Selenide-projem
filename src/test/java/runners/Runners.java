package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
        },
        monochrome=true, // testler koşulduktan sonra terminalde bu testte yönelik verilen bilgileri
                         // beyaz sade bir renkle almaya yarıyor
        features = "./src/test/resources/features",
        glue = {"stepdefinitions"},
        dryRun = false,
        tags = "@scrollwithjs"
                    )

public class Runners {
}
