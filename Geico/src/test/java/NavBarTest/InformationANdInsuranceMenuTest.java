package NavBarTest;

import NavBar.InformationAndInsuranceMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class InformationANdInsuranceMenuTest extends InformationAndInsuranceMenu {
    InformationAndInsuranceMenu object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver, InformationAndInsuranceMenu.class);
    }
    @Test
    public void testInformationMenuItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareInformationMenu();
    }
    @Test
    public void testInsuranceMenuItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareInsuranceMenu();
    }
}
