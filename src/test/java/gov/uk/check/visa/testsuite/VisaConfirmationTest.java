package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {
    StartPage startPage;
    DurationOfStayPage durationOfStayPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    WorkTypePage workTypePage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        startPage =new StartPage();
        durationOfStayPage= new DurationOfStayPage();
        resultPage=new ResultPage();
        reasonForTravelPage = new ReasonForTravelPage();
        selectNationalityPage= new SelectNationalityPage();
        workTypePage= new WorkTypePage();
        familyImmigrationStatusPage= new FamilyImmigrationStatusPage();
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void anAustralianCominToUKForTourism(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        reasonForTravelPage.clickNextStepButton();
        resultPage.confirmResultMessageAustralia("You will not need a visa to come to the UK");

    }
    @Test(groups = {"regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("workAcademicVisitOrBusiness");
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectLengthOfStay("moreThanSixMonths");
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobType("healthCareProfessional");
        workTypePage.clickOnContinueButton();
        resultPage.confirmResultMessage("You need a visa to work in health and care");

    }
    @Test(groups = {"sanity","regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("joinPartnerAndJointFamily");
        reasonForTravelPage.clickNextStepButton();
        //  familyImmigrationStatusPage.selectImmigrationStatus("1");
        //familyImmigrationStatusPage.clickNextStepButton();
        resultPage.getResultMessageJoinFamily();
    }


}
