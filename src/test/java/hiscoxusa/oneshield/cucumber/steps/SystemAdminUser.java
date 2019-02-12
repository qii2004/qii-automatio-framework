package hiscoxusa.oneshield.cucumber.steps;

import hiscoxusa.oneshield.ui.OneShieldHomePage;
import hiscoxusa.oneshield.ui.OneShieldLoginPage;
import hiscoxusa.oneshield.utils.BrowserWebdriverSetup;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SystemAdminUser {
    OneShieldLoginPage oneShieldLoginPage;
    OneShieldHomePage oneShieldHomePage;

    @Managed
    WebDriver driver;

    @Step
    public void startsOnOneShieldLogin() {
      oneShieldLoginPage.open();
    }

    @Step
    public void entersLoginCredentials(List<String> loginCredentials) {
        oneShieldLoginPage.logsIntoOneshieldApplication(loginCredentials);
    }

    @Step
    public void goesToLegalEntityPage() {
        oneShieldHomePage.ClicksExchangeOnMenuBar();
        oneShieldHomePage.ClicksCarrierBranchesFromSubMenu();
        oneShieldHomePage.clicksNewOfficeButton();
    }

    public void entersNewOfficeDetails() {
        oneShieldHomePage.entersOfficeDetails();
    }

    public void savesNewOfficeDetails() {
        oneShieldHomePage.saveOfficeDetails();
    }

    public String seesTextOnPage() {
        return oneShieldHomePage.sees();
    }

    public void CreateRegion() {
        oneShieldHomePage.ClicksExchangeOnMenuBar();
        oneShieldHomePage.Serviceteritorries();
        oneShieldHomePage.AddRegion();
        oneShieldHomePage.Regionname();
    }
}
