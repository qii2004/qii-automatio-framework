package hiscoxusa.oneshield.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.Before;
import hiscoxusa.oneshield.model.UI_HostEnvironments;
import hiscoxusa.oneshield.utils.BrowserWebdriverSetup;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        plugin = {"pretty"}
        ,features = "src/test/resources/features"
        ,glue= "hiscoxusa/oneshield/cucumber"
        ,snippets = SnippetType.CAMELCASE
)
public class SerenityWithCucumberTestSuite {

}

