package RentersInsuranceTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class PropertySalesTest extends PropertySales {
    @BeforeMethod
    public void init(){
        PropertySales obj1 = PageFactory.initElements(driver, PropertySales.class);
        navigateToPropertyType();
    }
    @Test
    public void testClickOnHomeOwnersRD(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnHomeOwnersRD();
        }
    @Test
    public void testClickOnRentersRD(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       clickOnRentersRD();
       }
    @Test
    public void testClickOnCondoRD(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCondoRD();
       }
    @Test
    public void testClickOnMobileHomeRD(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnMobileHomeRD();
      }
    @Test
    public void testClickOnLandLordRD(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       clickOnLandLordRD();
    }
}
