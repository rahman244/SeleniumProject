package RentersInsuranceTest;

import base.CommonClass;
import base.ReusableAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class PropertySales extends CommonClass{
    @FindBy(xpath = "//label[@for='ho3']")
    public static WebElement homeOwnersRD;
    @FindBy(xpath = "//label[@for='ho4']")
    public static WebElement rentersRD;
    @FindBy(xpath = "//label[@for='ho6']")
    public static WebElement condoRD;
    @FindBy(xpath = "//label[@for='mobile']")
    public static WebElement mobileHomeRD;
    @FindBy(xpath = "//label[@for='dp3']")
    public static WebElement landLordRD;

    public void navigateToPropertyType(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to("https://propertysales.geico.com/PropertyTypeLanding");
    }
    public String clickOnElementRD(WebElement element){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        element.click();
        sendKeysToZipCodeBox();
        clickContinue();
       return driver.getCurrentUrl();
    }
    public void clickContinue(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement continueButton = driver.findElement(By.id("submitButton"));
        continueButton.click();
    }
    public void sendKeysToZipCodeBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebElement zipCodeBox = driver.findElement(By.id("LandingViewData_NIP001PropertyZip"));
        zipCodeBox.sendKeys("11435");
    }
    public void clickOnHomeOwnersRD(){
        Assert.assertEquals(clickOnElementRD(homeOwnersRD),"https://propertysales.geico.com/CustomerInformation");
    }
    public void clickOnRentersRD(){
        Assert.assertEquals(clickOnElementRD(rentersRD),"https://propertysales.geico.com/Diva/Conversation");
    }
    public void clickOnCondoRD(){
        Assert.assertEquals(clickOnElementRD(condoRD),"https://propertysales.geico.com/CustomerInformation");
    }
    public void clickOnMobileHomeRD(){
        Assert.assertEquals(clickOnElementRD(mobileHomeRD),"https://propertysales.geico.com/MobileHome/PleaseCall");
    }
    public void clickOnLandLordRD(){
        Assert.assertEquals(clickOnElementRD(landLordRD),"https://propertysales.geico.com/CustomerInformation");
    }

}
