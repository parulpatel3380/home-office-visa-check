package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    /*
    FamilyImmigrationStatusPage - nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
            (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
*/
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yes;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement no;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectImmigrationStatus(String status){
        CustomListeners.test.log(Status.PASS, "selectImmigrationStatus" + status);
        switch (status){
            case "1": clickOnElement(yes);
                break;
            case "2":clickOnElement(no);
                break;
            default:break;
        }

    }


    public void clickNextStepButton(){
        CustomListeners.test.log(Status.PASS, "clickOnNextStep" + nextStepButton);
        clickOnElement(nextStepButton);

    }
}
