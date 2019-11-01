package AutoInsuranceTest;

import AutoInsurancePackage.AutoInsuranceCustomerInfo;
import AutoInsurancePackage.getQuotePopUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoInsuranceCustomerInfoTest extends AutoInsuranceCustomerInfo {
    @BeforeMethod
    public void init(){
        AutoInsuranceCustomerInfo obj1 = PageFactory.initElements(driver,AutoInsuranceCustomerInfo.class);
        getQuotePopUp obj2 = PageFactory.initElements(driver,getQuotePopUp.class);
    }
    @Test
    public void testFirstNameErrorMessage(){
        clickNextWithoutFillingFirstName();
    }
    @Test
    public void testLastNameErrorMessage(){
        clickNextWithoutFillingLastName();
    }

}
