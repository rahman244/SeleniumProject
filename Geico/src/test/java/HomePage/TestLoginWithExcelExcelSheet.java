package HomePage;

import base.XlsDataReaderUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class TestLoginWithExcelExcelSheet extends LoginWithExcel {
    LoginWithExcel loginObject;
    @BeforeMethod
    public void init(){
        loginObject = PageFactory.initElements(driver, LoginWithExcel.class);
        navigateToLoginPage();
    }
    @Test(dataProvider = "supplyData")
    public void signInWithInvalidIDPassUsingExcel(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String errMessage = SendLoginInfo(email, passCode);
        Assert.assertEquals(message,errMessage);
    }
}
