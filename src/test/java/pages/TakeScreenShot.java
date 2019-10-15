package pages;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TakeScreenShot extends DriverFactory {

	@Test

    public void testGuru99TakeScreenShot() throws Exception  {

//		WebDriver driver ;
//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
//    	driver = new FirefoxDriver();

        //goto url

        //driver.get("http://demo.guru99.com/V4/");

        //Call take screenshot function

        this.takeSnapShot() ;     

    }

    /**

     * This function will take screenshot

     * @param webdriver

     * @param fileWithPath

     * @throws Exception

     */

    public static void takeSnapShot() throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)getDriverInstance());

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("/Users/sagarshinde/workspace/F1/ScreenShots");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}

