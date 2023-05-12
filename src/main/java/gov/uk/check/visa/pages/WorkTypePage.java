package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
   /*
2.WorkTypePage - nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'*/
    // nextStepButton, selectJobtypeList


    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthCareProfessional;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement DigitalTechnologyProfessional;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement AcademicOrRsearcher;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement WorkInArtsOrCulture;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement ProfessionalSportsperson;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement ReligiousWorker;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement IWantToStartABusiness;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement IWantToDoAnotherTypeOfJobShowMeOtherWorkVisas;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;


    public void selectJobType(String job){
        CustomListeners.test.log(Status.PASS, "clickOnSelectReasonForVisit" + job);
        switch (job)
        {
            case "healthCareProfessional" : clickOnElement(healthCareProfessional);
                break;
            case "DigitalTechnologyProfessional" : clickOnElement(DigitalTechnologyProfessional);
                break;
            case "AcademicOrRsearcher" : clickOnElement(AcademicOrRsearcher);
                break;
            case "WorkInArtsOrCulture" : clickOnElement(WorkInArtsOrCulture);
                break;
            case "ProfessionalSportsperson": clickOnElement(ProfessionalSportsperson);
                break;
            case "ReligiousWorker": clickOnElement(ReligiousWorker);
                break;
            case "IWantToStartABusiness": clickOnElement(IWantToStartABusiness);
                break;
            case "IWantToDoAnotherTypeOfJobShowMeOtherWorkVisas": clickOnElement(IWantToDoAnotherTypeOfJobShowMeOtherWorkVisas);
                break;
            default: break;
        }
    }

    public void clickOnContinueButton(){
        CustomListeners.test.log(Status.PASS, "clickOnSelectReasonForVisit" + continueButton);
        clickOnElement(continueButton);
    }
}
