package hiscoxusa.oneshield.cucumber;

import cucumber.api.java.Before;
import hiscoxusa.oneshield.model.UI_HostEnvironments;
import hiscoxusa.oneshield.utils.BrowserWebdriverSetup;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
 public class WebHooks {
    @Before
    public void printHello() {
        BrowserWebdriverSetup.setupBrowserWebDriver();
        System.setProperty("webdriver.base.url", UI_HostEnvironments.ENV.getUiHostName());
    }

}
