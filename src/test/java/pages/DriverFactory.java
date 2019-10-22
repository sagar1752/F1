package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.ctm.nexgen.core.DriverFactory;

//import com.ctm.nexgen.core.DriverFactory;



//import javaConcept.select;

public class DriverFactory  {
	
//	public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal();
	//static CoreLogger logger = new CoreLogger();
	
	//public WebDriver driver;
	
public static WebDriver driver;
//chrome driver path
	static String driverPath = "/Users/sagarshinde/Documents/seleniumSW/chromeDriver/chromedriver";

	//static String driverPath = "/Users/sagarshinde/Documents/seleniumSW/firefox/geckodriver";

	public static WebDriver getDriverInstance () {
		
		return driver;
		
	}

	@BeforeClass
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		//System.setProperty("webdriver.gecko.driver", driverPath);
		//webdriver.firefox.marionette
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		getDriverInstance().manage().window().maximize();
		
		
	}
	
	//@AfterClass
	public void tearDown() {
		if(getDriverInstance()!=null) {
			System.out.println("Closing chrome browser");
			getDriverInstance().quit();
		}
	}
		
		public void afterMethod(ITestResult result)
		{
		    try
		 {
		    if(result.getStatus() == ITestResult.SUCCESS)
		    {

		        //Do something here
		        System.out.println("passed **********");
		    }

		    else if(result.getStatus() == ITestResult.FAILURE)
		    {
		         //Do something here
		        System.out.println("Failed ***********");

		    }

		     else if(result.getStatus() == ITestResult.SKIP ){

		        System.out.println("Skiped***********");

		    }
		}
		   catch(Exception e)
		   {
		     e.printStackTrace();
		   }

		}
		
	
	
	
	public  static void loadPropertiesFile () throws IOException {
		 Properties obj = new Properties();	
		    File file = new File("/Users/sagarshinde/workspace/F1/config.properties");
		    FileInputStream objfile = new FileInputStream(file);									
		    obj.load(objfile);
		    driver.get(obj.getProperty("URL"));
	}
	
	
	
	public static void takeSnapShot() throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)getDriverInstance());

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("/Users/sagarshinde/workspace/F1/ScreenShots"+System.currentTimeMillis()+".png");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	
	public void waitElementClickable(By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='brandSlider']/div[1]/div/div/div/img)[50]")));
		element.click();
	

	}

	public static void navigateUrl(String url) throws Exception {
	
	getDriverInstance().navigate().to("http://www.google.com");
	//String strPageTitle = getDriverInstance().getTitle();
//	System.out.println("Page title: - "+strPageTitle);
//	Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	takeSnapShot();
	
	}
	public static void implicitWait(int wait) {
	driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	
	}
	
//public static WebDriver driver(Class<?> clazz) {
//	if (DriverFactory.class.isAssignableFrom(clazz)) {
//		return (WebDriver) threadLocalDriver.get();
//	} else {
//		//logger.logMessage(GenericMessageTypes.CRITICAL,
//				System.out.println("This class is not authorized to access the driver. Setting driver to null");
//		return null;
//	}
//}

//public static void setDriver(WebDriver driver) {
//	threadLocalDriver.set(driver);
//}
//
//private WebDriver getDriver() {
//	return DriverFactory.driver(this.getClass());
//}

}
