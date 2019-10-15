package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class launchbrowser extends DriverFactory
{
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    //String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver ; 
         
  @Test
  public void verifyHomepageTitle() {
	  // in driver has 22 methods declaration
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.chrome.driver", "/Users/sagarshinde/Documents/seleniumSW/chromeDriver/chromedriver");
      ChromeDriver driver = new ChromeDriver();
      //chromeDriver driver = new ChromeDriver();  // has 62 methods
     
      
//      driver.get("http://newtours.demoaut.com/");
//      String expectedTitle = "Welcome: Mercury Tours";
//      String actualTitle = driver.getTitle();
//      Assert.assertEquals(actualTitle, expectedTitle);
     // driver.close();
  }
  
}