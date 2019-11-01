package HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FeedbackTest extends Feedback{
    Feedback objFeedback;
    @BeforeMethod
    public void init(){
        objFeedback = PageFactory.initElements(driver,Feedback.class);
    }
    @AfterMethod
    public void switchToDefaultContent(){
        driver.switchTo().defaultContent();
    }
    @Test
    public void testVeryDissatisfiedHeaderMessage(){
        veryDissatisfiedHeaderMessage();
    }
    @Test
    public void testVeryDissatisfiedBodyMessage(){
        veryDissatisfiedBodyMessage();
    }
    @Test
    public void testDissatisfiedHeaderMessage(){
        dissatisfiedHeaderMessage();
    }
    @Test
    public void testDissatisfiedBodyMessage(){
        dissatisfiedBodyMessage();
    }
    @Test
    public void testSomewhatSatisfiedHeaderMessage(){
        somewhatSatisfiedHeaderMessage();
    }
    @Test
    public void testSomewhatSatisfiedBodyMessage(){
        somewhatSatisfiedBodyMessage();
    }
    @Test
    public void testSatisfiedHeaderMessage(){
        satisfiedHeaderMessage();
    }
    @Test
    public void testSatisfiedBodyMessage(){
        satisfiedBodyMessage();
    }
    @Test
    public void testVerySatisfiedHeaderMessage(){
        verySatisfiedHeaderMessage();
    }
    @Test
    public void testVerySatisfiedBodyMessage(){
        verySatisfiedBodyMessage();
    }
}
