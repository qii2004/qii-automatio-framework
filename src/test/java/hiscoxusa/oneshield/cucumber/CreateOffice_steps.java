package hiscoxusa.oneshield.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import hiscoxusa.oneshield.cucumber.steps.SystemAdminUser;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

public class CreateOffice_steps {

    @Managed
    WebDriver driver;

    @Steps
    SystemAdminUser systemAdminUser;

    @Given("^(?:.*) is a valid sa user of the OneShield application$")
    public void sarahIsAValidSaUserOfTheOneShieldApplication(List<String> login_credentials) {
        systemAdminUser.startsOnOneShieldLogin();
        systemAdminUser.entersLoginCredentials(login_credentials);
    }
    @When("^(?:.*) enter valid details about the office she wants to creates$")
    public void sarahEnterValidDetailsAboutTheOfficeSheWantsToCreates() {
        systemAdminUser.goesToLegalEntityPage();
        systemAdminUser.entersNewOfficeDetails();
        systemAdminUser.savesNewOfficeDetails();
    }

    @Then("^(?:.*) should see (.*) and (.*)$")
    public void sarahShouldSeeOfficeDetailsAndContactDetails(String text1, String text2) {
        assertThat(systemAdminUser.seesTextOnPage()).contains(text2).contains(text1);
    }
}
