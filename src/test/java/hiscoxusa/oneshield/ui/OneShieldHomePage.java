package hiscoxusa.oneshield.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

import java.util.List;

public class OneShieldHomePage extends PageObject {


    @FindBy(css = "span[osviewid='PAI_1256246_AB_1494946']")
    WebElementFacade exchange;

    @FindBy(css = "span[osviewid='PAI_1266946_AB_1489746']")
    WebElementFacade carrierBranches;

    @FindBy(css = "span[osviewid='PAI_1268846_AB_1493646']")
    WebElementFacade newOffice;

    @FindBy(css = "input[osviewid='PAI_1271846_OT_63_OI_1_BI_1261746_CI_17087146']")
    WebElementFacade officeSubtype;

    @FindBy(css = "input[osviewid='PAI_1271846_OT_63_OI_1_BI_1261746_CI_17086746']")
    WebElementFacade officeName;
    @FindBy(css = "input[osviewid='PAI_1271846_OT_63_OI_1_BI_1261746_CI_16016545']")
    WebElementFacade regionList_dropdown;

    @FindBy(css = "span[osviewid='PAI_1271846_OT_63_OI_1_BI_1113245_AB_1316645']")
    WebElementFacade addAddress_button;

    @FindBy(css = "input[osviewid='PAI_1072845_OT_405_OI_1_BI_1107445_CI_16019045']")
    WebElementFacade zipCode;
    @FindBy(css = "input[osviewid='PAI_1072845_OT_405_OI_1_BI_1107445_CI_16018845']")
    WebElementFacade AddressName;


    @FindBy(css = "[osviewid='PAI_1072845_AB_1309945']")
    WebElementFacade saveChanges_button;

    @FindBy(css = "span[osviewid='PAI_1271846_AB_1313145']")
    WebElementFacade saveChanges;

    @FindBy(css = "span[osviewid='PAI_1272046_AB_1493846']")
    WebElementFacade Exit;

    @FindBy(css = "ul[aria-hidden=\"false\"]>li")
    List<WebElementFacade> list;

    @FindBy(xpath = "//div[text()= 'Contact Details']")
    WebElementFacade contactDetails_label;

    @FindBy(xpath = "//div[text()= 'Office Details']")
    WebElementFacade officeDetails_label;

    //CRegion
    @FindBy(css = "span[osviewid='PAI_1266946_AB_1487146']")
    WebElementFacade serviceTeritorries;

    @FindBy(css = "span[osviewid='PAI_1267846_AB_1512046']")
    WebElementFacade addRegion;

    @FindBy(css = "input[osviewid='PAI_1084145_OT_2290609_OI_1_BI_1281246_CI_17210046']")
    WebElementFacade regionName;

    @FindBy(css = "span[osviewid='PAI_1084145_AB_1319945']")
    WebElementFacade saveRegion;

    @FindBy(css = "span[osviewid='PAI_1306146_AB_1521646']")
    WebElementFacade exit;


    public void entersOfficeDetails() {
        officeSubtype.sendKeys("Claims Office");
        officeName.sendKeys("Sarah_Admins", Keys.TAB);

        regionList_dropdown.click();
        regionList_dropdown.sendKeys("Apple_Bhagyaraj - Territory", Keys.TAB);

        addAddress_button.waitUntilClickable();
        addAddress_button.click();

        AddressName.sendKeys("Sarah Demo");
        zipCode.sendKeys("12345");
        if (!zipCode.containsText("12345")) {
            zipCode.clear();
            zipCode.sendKeys("12345");
        }
    }

    public void ClicksExchangeOnMenuBar() {
        exchange.click();
    }

    public void ClicksCarrierBranchesFromSubMenu() {
        carrierBranches.click();
    }

    public void clicksNewOfficeButton() {
        newOffice.click();
    }

    public void saveOfficeDetails() {
        saveChanges_button.isCurrentlyVisible();
        saveChanges_button.waitUntilClickable().click();
        saveChanges_button.click();
    }

    public String sees() {

        officeDetails_label.waitUntilPresent();
        String text = officeDetails_label.getText() + contactDetails_label.getText();
        System.out.println("---View Sub Tabs----:: " + text);
        return text;

    }

    public void Serviceteritorries() {
        serviceTeritorries.click();
    }

    public void AddRegion() {
        addRegion.click();
    }

    public void Regionname() {
        regionName.sendKeys("Automation testing", Keys.TAB);
        saveRegion.click();
        exit.click();
    }
}
