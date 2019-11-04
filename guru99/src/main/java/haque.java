import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class haque extends CommonClass {
    @FindBy(xpath = "//input[@name='address1']")
    public static WebElement address1 ;

    @FindBy(xpath="//input[@name='city']")
    public static WebElement city;

    @FindBy(xpath = "//input[@name='state']")

    public static WebElement state;

    @FindBy(xpath = "//input[@name='postalCode']")

    public static WebElement postalCode;
@FindBy(xpath= "//select [@name='country']")
public static WebElement country;

    public void add()
    {

        address1.sendKeys("123 main st");
        city.sendKeys("Richardson");
        state.sendKeys("teksas");
        postalCode.sendKeys("12345");
        country.sendKeys("paris");


    }

}
