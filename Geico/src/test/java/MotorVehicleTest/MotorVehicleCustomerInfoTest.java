package MotorVehicleTest;

import HomePage.InsuranceProducts;
import MotorVehicle.MotorVehicleCustomerInfo;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MotorVehicleCustomerInfoTest extends MotorVehicleCustomerInfo {
    @BeforeMethod
    public void init() throws InterruptedException {
        MotorVehicleCustomerInfo obj1 = PageFactory.initElements(driver,MotorVehicleCustomerInfo.class);
        InsuranceProducts obj2 = PageFactory.initElements(driver,InsuranceProducts.class);
        navigateToMotorVehiclePage();
    }
    @Test
    public void testClickOnNoRD(){
        clickOnNoRD();
    }
    @Test
    public void isDivVisible(){
        Assert.assertTrue(isNoDivVisible());
    }
}
