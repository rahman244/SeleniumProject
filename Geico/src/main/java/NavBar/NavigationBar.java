package NavBar;

import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;
import DataReaderCommonClass.ReadFromExcel;

public class NavigationBar extends CommonClass{
    @FindBy(css = "ul.desktop-links > li:nth-child(2)>a")
    public static WebElement information;
    @FindBy(css = "#header-left-links > ul> li > a")
    public static WebElement insurance;
    @FindBy(css = "#header-middle-links > a")
    public static WebElement geicoLogo;
    @FindBy(css = "#header-right-links>ul>li>a>span.icon-geolocation")
    public static WebElement locationIcon;
    @FindBy(className = "login header-right-label open")
    public static WebElement login;
    @FindBy(css = "#header-right-links > ul > li:nth-child(3) > a > span")
    public static WebElement searchIcon;

    @FindBy(xpath = "//div[@data-side-panel='information']")
    public static WebElement infoDiv;
    @FindBy(xpath = "//div[@data-side-panel='insurance']")
    public static WebElement insuranceDiv;
    @FindBy(xpath = "//div[@data-side-panel='login']")
    public static WebElement loginDiv;
    @FindBy(xpath = "//div[@data-side-panel='location']")
    public static WebElement locationDiv;
    @FindBy(xpath = "//div[@data-side-panel='search']")
    public static WebElement searchDiv;

    public void clickOnInsurance() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        insurance.click();
        Thread.sleep(2000);
        Assert.assertEquals(true,insuranceDiv.isDisplayed());
    }
    public void clickOnInformation() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        information.click();
        Thread.sleep(2000);
        Assert.assertEquals(true,infoDiv.isDisplayed());
    }
    public void clickOnGeicoLogo() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        geicoLogo.click();
        Thread.sleep(2000);
        String Url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.geico.com/",Url);
    }
    public void clickOnLocationIcon()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locationIcon.click();
        Thread.sleep(2000);
        Assert.assertEquals(true,locationDiv.isDisplayed());
    }
    public void clickLogin() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locationIcon.click();
        Thread.sleep(2000);
        Assert.assertTrue(loginDiv.isDisplayed());
    }
    public void clickOnSearchIcon()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchIcon.click();
        Thread.sleep(2000);
        Assert.assertEquals(true,searchDiv.isDisplayed());
    }
    public void navBarClickWithExcelKeyword(String keyword) throws InterruptedException {
        switch (keyword){
            case "insurance":
                clickOnInsurance();
                break;
            case "information":
                clickOnInformation();
                break;
            case "location":
                clickOnLocationIcon();
                break;
            case "login":
                clickLogin();
                break;
            case "search":
                clickOnSearchIcon();
                break;
            case "logo":
                clickOnGeicoLogo();
                break;
        }
    }
    public void sendKeywordFromExcel() throws InterruptedException {
        ReadFromExcel objReadFromObject = new ReadFromExcel();
        List<String> data = objReadFromObject.getDataFromExcelForKeywordDriven();
        for (String st:data){
            navBarClickWithExcelKeyword(st);
        }
    }
}
