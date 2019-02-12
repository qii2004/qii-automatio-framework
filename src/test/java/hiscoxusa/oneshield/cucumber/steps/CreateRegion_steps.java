package hiscoxusa.oneshield.cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateRegion_steps
{

    @Managed
    WebDriver driver;

    @Steps
    SystemAdminUser systemAdminUser;

    @When("^user enter valid details about the Region$")
    public void userentervaliddetailsabouttheRegion(){
        systemAdminUser.CreateRegion();
    }
    @Then("^user should see Region Name$")
    public void usershouldseeRegionName() {

    }

}
