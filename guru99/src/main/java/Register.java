import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;







public class Register extends CommonClass {

    @FindBy(xpath = "// input[@name='firstName']")
    public static WebElement firstName;


    @FindBy(xpath = "// input[@name='lastName']")
    public static WebElement lastName;


    @FindBy(xpath = "// input[@name='phone']")
    public static WebElement phone;

    @FindBy(xpath = "// input[@name='userName']")
    public static WebElement email;


    public void contactInformation() {

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        firstName.sendKeys("Papia");

        lastName.sendKeys("Rahman");
        phone.sendKeys("1234567");
        email.sendKeys("pr@.com");
    }
}