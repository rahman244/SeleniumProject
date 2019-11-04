import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rahman extends CommonClass {
    @FindBy(xpath = "//input [@id='email']")
    public static WebElement UserName;
    @FindBy(xpath = "//input [@name='password']")
    public static WebElement password;

    @FindBy(xpath = "//input [@name='confirmPassword']")
    public static WebElement confirmPassword;
    @FindBy(xpath = "//input [@type='submit']")
    public static WebElement submit;

    public static void mane()


    {


        password.sendKeys("1234");
        confirmPassword.sendKeys("1234");
        submit.click();


    }
    }







