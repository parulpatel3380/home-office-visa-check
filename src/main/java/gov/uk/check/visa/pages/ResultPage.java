package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {
    /*
 .ResultPage - resultMessage locator and create methods 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)*/
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement VerifyMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement verifyMessageHealthCare;


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement verifyMessageJoinFamily;
    public String getResultMessageJoinFamily(){
        CustomListeners.test.log(Status.PASS,"Verify Message "+verifyMessageJoinFamily);
        return getTextFromElement(verifyMessageJoinFamily);
    }

    public void confirmResultMessageJoinFamily(String expectedMessage){
        CustomListeners.test.log(Status.PASS,"Verify Message "+verifyMessageJoinFamily);
        String message = getResultMessageJoinFamily();
        Assert.assertTrue(expectedMessage.equals(message));
    }

    public String getResultMessage(){
        CustomListeners.test.log(Status.PASS,"Verify Message "+VerifyMessage);
        return getTextFromElement(VerifyMessage);
    }

    public void confirmResultMessage(String expectedMessage){
        CustomListeners.test.log(Status.PASS,"Verify Message "+VerifyMessage);
        String message = getResultMessage();
        Assert.assertTrue(expectedMessage.equals(message));
    }

    public void confirmResultMessageAustralia(String expectedMessage){
        CustomListeners.test.log(Status.PASS,"Verify Message "+verifyMessageHealthCare);
        String message = getResultMessageAustralia();
        Assert.assertTrue(expectedMessage.equals(message));
    }

    public String getResultMessageAustralia(){
        CustomListeners.test.log(Status.PASS,"Verify Message "+verifyMessageHealthCare);
        return getTextFromElement(verifyMessageHealthCare);
    }
}
