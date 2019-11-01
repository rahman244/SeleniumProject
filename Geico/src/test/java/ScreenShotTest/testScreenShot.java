package ScreenShotTest;

import base.CommonClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class testScreenShot extends CommonClass {
    String screenShot1 = "ScreenShot";
    @Test
    public void testCaptureScreenShot(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        captureScreenshot(driver, screenShot1);
    }
}
