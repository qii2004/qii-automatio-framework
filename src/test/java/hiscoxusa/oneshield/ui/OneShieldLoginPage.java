package hiscoxusa.oneshield.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

import java.util.List;

//@DefaultUrl("https://hiscpvt-hiscoxusa.oneshield-web-northeurope.azure.hiscox.com/hiscoxusa.oneshield/index.jsp#gateway")
//@DefaultUrl("https://osqa-oneshield-web-northeurope.azure.hiscox.com/oneshield/index.jsp#gateway")
@DefaultUrl("https://hiscpvt-oneshield-web-northeurope.azure.hiscox.com/oneshield/index.jsp#gateway")
public class OneShieldLoginPage extends PageObject {
    final String PARTNER_NUMBER_LOCATOR = "input[osviewid='PAI_2_OT_310_OI_1_BI_1075_CI_6376001']";
    final String USERNAME_LOCATOR = "input[osviewid='PAI_2_OT_310_OI_1_BI_1075_CI_8780402']";
    final String PASSWORD_LOCATOR = "input[osviewid='PAI_2_OT_310_OI_1_BI_1075_CI_8780502']";
    public static final int PARTNER_NO_INDEX = 0;
    public static final int USER_NAME_INDEX = 2;
    public static final int PASSWORD_INDEX = 3;

    @FindBy(css = PARTNER_NUMBER_LOCATOR)
    WebElementFacade partner_number;

    @FindBy(css = USERNAME_LOCATOR)
    WebElementFacade userName;

    @FindBy(css = PASSWORD_LOCATOR)
    WebElementFacade password;

    @FindBy(css = "span[osviewid='PAI_2_AB_559205']")
    WebElementFacade login;

    public void logsIntoOneshieldApplication(List<String> loginCredentials) {
        this.partner_number.sendKeys(loginCredentials.get(PARTNER_NO_INDEX), Keys.TAB);
        this.userName.sendKeys(loginCredentials.get(USER_NAME_INDEX), Keys.TAB);
        this.password.sendKeys(loginCredentials.get(PASSWORD_INDEX), Keys.TAB);
        this.login.click();
    }
}
