package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShots {
	public static void takeScreenshot(WebDriver driver, String Name){

	{
        try {
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\EclipseWS\\MyCodewithFramwork\\src\\test\\resources\\ScreenShots" + Name + ".png");
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot saved: " + destination.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error while taking screenshot: " + e.getMessage());
        }
    }
	}
}
