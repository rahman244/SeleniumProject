package HomePage;

import base.CommonClass;
import base.ReusableAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reporting.TestLogger;

public class Feedback extends CommonClass{

   @FindBy(name = "OnlineOpinion1")
    public static WebElement feedbackFrame;
    @FindBy(xpath = "//label[@for='overall_0']")
    public static WebElement veryDissatisfiedIcon;
    @FindBy(xpath = "//label[@for='overall_1']")
    public static WebElement dissatisfiedIcon;
    @FindBy(xpath = "//label[@for='overall_2']")
    public static WebElement somewhatSatisfiedIcon;
    @FindBy(xpath = "//label[@for='overall_3']")
    public static WebElement satisfiedIcon;
    @FindBy(xpath = "//label[@for='overall_4']")
    public static WebElement verySatisfiedIcon;
    @FindBy(xpath = "//div[@id='foot']/button")
    public static WebElement submitButton;
    @FindBy(id="thank-you-header")
    public static WebElement ThankYouHeader;
    @FindBy(xpath = "//p[@id=\"tyMessage\"]/p")
    public static WebElement ThankYouBody;

    public void switchToFrame(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.id("oo_tab")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(feedbackFrame));
    }
    public void selectSatisfactionIcon(WebElement element){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+" Satisfaction level: "+element.getText());
        element.click();
    }
    public void clickSubmit(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        submitButton.click();
    }
    public void giveFeedback(WebElement element){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        switchToFrame();
        selectSatisfactionIcon(element);
        clickSubmit();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tyMessage")));
    }
    public String getThankYouForFeedbackMessageHeader(WebElement element){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giveFeedback(element);
        return ThankYouHeader.getText();
    }
    public String getThankYouForFeedbackMessageBody(WebElement element){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        giveFeedback(element);
        return ThankYouBody.getText();
    }
    public String getActualThankYouHeader(){
        return "Thanks for your feedback!";
    }
    public String getActualThankYouBody(){
        return "While we research each report we receive, we cannot guarantee that your comment will receive a response.";
    }
    public void veryDissatisfiedHeaderMessage(){
        Assert.assertEquals(getActualThankYouHeader(),getThankYouForFeedbackMessageHeader(veryDissatisfiedIcon));
    }
    public void veryDissatisfiedBodyMessage(){
        Assert.assertEquals(getActualThankYouBody(),getThankYouForFeedbackMessageBody(veryDissatisfiedIcon));
    }
    public void dissatisfiedHeaderMessage(){
        Assert.assertEquals(getActualThankYouHeader(),getThankYouForFeedbackMessageHeader(dissatisfiedIcon));
    }
    public void dissatisfiedBodyMessage(){
        Assert.assertEquals(getActualThankYouBody(),getThankYouForFeedbackMessageBody(dissatisfiedIcon));
    }
    public void somewhatSatisfiedHeaderMessage(){
        Assert.assertEquals(getActualThankYouHeader(),getThankYouForFeedbackMessageHeader(somewhatSatisfiedIcon));
    }
    public void somewhatSatisfiedBodyMessage(){
        Assert.assertEquals(getActualThankYouBody(),getThankYouForFeedbackMessageBody(somewhatSatisfiedIcon));
    }
    public void satisfiedHeaderMessage(){
        Assert.assertEquals(getActualThankYouHeader(),getThankYouForFeedbackMessageHeader(satisfiedIcon));
    }
    public void satisfiedBodyMessage(){
        Assert.assertEquals(getActualThankYouBody(),getThankYouForFeedbackMessageBody(satisfiedIcon));
    }
    public void verySatisfiedHeaderMessage(){
        Assert.assertEquals(getActualThankYouHeader(),getThankYouForFeedbackMessageHeader(verySatisfiedIcon));
    }
    public void verySatisfiedBodyMessage(){
        Assert.assertEquals(getActualThankYouBody(),getThankYouForFeedbackMessageBody(verySatisfiedIcon));
    }
}
