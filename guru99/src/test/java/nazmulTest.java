import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;


public class nazmulTest extends Aaraf{
    Aaraf naz;

    @BeforeMethod
    public void init() {
        naz = PageFactory.initElements(driver,this.getClass());
    }
    @Test
    public void test() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        contactInformation();
    }
}

