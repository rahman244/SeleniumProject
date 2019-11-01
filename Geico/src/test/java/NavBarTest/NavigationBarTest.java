package NavBarTest;

import NavBar.NavigationBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NavigationBarTest extends NavigationBar {
    NavigationBar n1;
    @BeforeMethod
    public void init(){
        n1 = PageFactory.initElements(driver, NavigationBar.class);
    }
    @Test
    public void testClickInsurance() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnInsurance();
    }
    @Test
    public void testClickInformation() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       clickOnInformation();
    }
    @Test
    public void testClickLocation()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnLocationIcon();
    }
    @Test
    public void testClickLogin()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickLogin();
    }
    @Test
    public void testClickSearchIcon()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSearchIcon();
    }
    @Test
    public void testClickOnGeicoLogo()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnGeicoLogo();
    }
    @Test
    public void testnavBarClickWithExcelKeyword() throws InterruptedException {
        sendKeywordFromExcel();
    }
}
