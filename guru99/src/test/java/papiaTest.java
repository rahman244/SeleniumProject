import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class papiaTest extends Aaraf {
    Aaraf pap;

    @BeforeMethod
    public void init() {
        pap = PageFactory.initElements(driver, this.getClass());
    }

    @Test
    public void test() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        contactInformation();
    }

}