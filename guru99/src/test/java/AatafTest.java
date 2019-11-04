import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AatafTest extends Aaraf{

    Aaraf Aar;

    @BeforeMethod
    public void init() {
        Aar = PageFactory.initElements(driver,this.getClass());
    }
    @Test
    public void test() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        contactInformation();
    }

    @Test
    public void test2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        contactInformation();
    }
    @Test
    public void test3() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        contactInformation();
    }
    @AfterMethod
    public  void close(){


        driver.close();
    }

}


