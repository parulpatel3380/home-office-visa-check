package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {
       /*
    ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
    */

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement touristVisa;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workAcademicVisitOrBusiness;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement study;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement transit;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinPartnerAndJointFamily;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement getMarriedOrEnterIntoCivilPartner;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement stayWithYourChild;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement haveMedicalTreatment;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-8']")
    WebElement forOfficialDiplomaticOrBusiness;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButtonOnReasonTravel;

    public void selectReasonForVisit(String reason) {
        CustomListeners.test.log(Status.PASS, "clickOnSelectReasonForVisit" + study);
        switch (reason)
        {
            case "Tourism or visiting family and friends" : clickOnElement(touristVisa);
                break;
            case "workAcademicVisitOrBusiness" : clickOnElement(workAcademicVisitOrBusiness);
                break;
            case "study" : clickOnElement(study);
                break;
            case "transit" : clickOnElement(transit);
                break;
            case "joinPartnerAndJointFamily": clickOnElement(joinPartnerAndJointFamily);
                break;
            case "getMarriedOrEnterIntoCivilPartner": clickOnElement(getMarriedOrEnterIntoCivilPartner);
                break;
            case "stayWithYourChild": clickOnElement(stayWithYourChild);
                break;
            case "haveMedicalTreatment": clickOnElement(haveMedicalTreatment);
                break;
            case "forOfficialDiplomaticOrBusiness": clickOnElement(forOfficialDiplomaticOrBusiness);
                break;
            default: break;
        }

    }

    public void clickNextStepButton() {
        CustomListeners.test.log(Status.PASS, "clickOnContinueButtonOnReasonTravel" + continueButtonOnReasonTravel);
        clickOnElement(continueButtonOnReasonTravel);

    }
}
