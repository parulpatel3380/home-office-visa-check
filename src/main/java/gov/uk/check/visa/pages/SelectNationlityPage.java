package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationlityPage extends Utility {
    /*
    SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create methods  'void selectNationality(String nationality)'
    and 'void clickNextStepButton()'*/

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement nextStepButtonAcceptAdditional;

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButtonNationality;

    public void selectNationality(String nationality){
        clickOnElement(nextStepButtonAcceptAdditional);
        CustomListeners.test.log(Status.PASS,"selectNationality"+nationalityDropDownList);
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);

    }

    public void clickNextStepButton(){
        CustomListeners.test.log(Status.PASS,"clickOnContinue"+continueButtonNationality);
        clickOnElement(continueButtonNationality);

    }



    public void clickOnCookie(){
        CustomListeners.test.log(Status.PASS,"selectNationality"+nationalityDropDownList);
        clickOnElement(nextStepButtonAcceptAdditional);

    }

}
