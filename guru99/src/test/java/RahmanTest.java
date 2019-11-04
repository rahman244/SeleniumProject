import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RahmanTest extends Rahman {
    Rahman Rah;

    @BeforeMethod

    public void init() {

        Rah = PageFactory.initElements(driver, this.getClass());
    }



     @Test(priority = 3)
    public void manetest() {
        Rah.mane();

    }
    @Test(priority = 0)
    public void manetest1() {
        System.out.println("I am (priority first)");

    }
    @Test(priority = 2)
    public void manetest2() {
        System.out.println("I am (priority = 2)");

    }
    @Test(priority = 0)
    public void manetest3() {
        System.out.println("I am (priority  first too");

    }

    @AfterMethod
    public void close()
    {
        driver.close();
    }

}






