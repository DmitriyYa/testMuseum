package Helppers;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * Created by dima on 28.10.16.
 */
public class WorkWithScreenshots {

    public static File screenShot(WebDriver driver) {
        File screenshoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        return screenshoot;
    }

    public static String getPathScreenShot(File screenShot){
        String result="./" + screenShot.getName();
        return result;
    }

}
