package HomeOwnersPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CustomerInfoTest extends CustomerInfo{
    CustomerInfo object;
    @BeforeMethod
    public void init() {
        object = PageFactory.initElements(driver,this.getClass());
    }
    @Test
    public void testStreetTipText() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        streetTipText();
    }
    @Test
    public void testCoverageDateTipText()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        coverageDateTipText();
    }
    @Test
    public void testWarning1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareWarningMessage();
    }
    @Test
    public void isDivOneVisible() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        divOneVisible();
    }
    @Test
    public void isDivTwoVisible() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        divTwoVisible();
    }
    @Test
    public void isDivThreeVisible() throws InterruptedException {
        divThreeVisible();
    }
    @Test
    public void isDivFourVisible() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        divFourVisible();
    }
}