package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    /*
    .DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
  'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select moreOrLess stay) and
  'void clickNextStepButton()'
*/

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButtonDurationPage;

    public void selectLengthOfStay(String moreOrLess){
        CustomListeners.test.log(Status.PASS, "selectLengthStay" + moreOrLess);
        switch (moreOrLess){
            case "lessThanSixMonths": clickOnElement(lessThanSixMonths);
                break;
            case "moreThanSixMonths": clickOnElement(moreThanSixMonths);
                break;
            default:break;
        }

    }

    public void clickNextStepButton(){
        CustomListeners.test.log(Status.PASS, "clickOnNextStepButton" + continueButtonDurationPage);
        clickOnElement(continueButtonDurationPage);
    }
}
