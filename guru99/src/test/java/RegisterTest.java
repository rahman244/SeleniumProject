import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class RegisterTest extends Register{
    Register reg;

    @BeforeMethod
    public void init() {
        reg = PageFactory.initElements(driver,this.getClass());
    }
    @Test
    public void test() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        contactInformation();
    }
}
