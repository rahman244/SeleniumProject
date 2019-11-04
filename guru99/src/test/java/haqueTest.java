import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class haqueTest extends haque{
    haque haq;


    @BeforeMethod

    public void init() {
        haq = PageFactory.initElements(driver,this.getClass());
    }

@Test
public void addressTest()
{

    haq.add();

}



    @AfterMethod
    public void close()
    {
        driver.close();
    }

}
