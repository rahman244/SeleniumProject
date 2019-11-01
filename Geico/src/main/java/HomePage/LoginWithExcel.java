package HomePage;

import base.ReusableAPI;
import base.XlsDataReaderUtil;
import base.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class LoginWithExcel extends CommonClass{
    @FindBy(id = "userName")
    public static WebElement loginTextBox;
    @FindBy(id = "userPassword")
    public static WebElement passwordTextBox;
    @FindBy(id = "loginButton")
    public static WebElement loginButton;
    @FindBy(id="userPassword-msgs")
    public static WebElement errorMessage;

    public static void navigateToLoginPage(){
        TestLogger.log(LoginWithExcel.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to("https://ecams.geico.com/ecams/login.xhtml?r=true");
    }
    public void clickSubmit(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        loginButton.click();
    }
    public void clearInputBox(WebElement webElement){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        webElement.clear();
    }
    public String SendLoginInfo(String email, String password) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        loginTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
        Thread.sleep(2000);
        clickSubmit();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userPassword-msgs")));
        String errMessage = errorMessage.getText();
        clearInputBox(loginTextBox);
        clearInputBox(passwordTextBox);
        return errMessage;
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcelForLogin();
        return testData.iterator();
    }

}
