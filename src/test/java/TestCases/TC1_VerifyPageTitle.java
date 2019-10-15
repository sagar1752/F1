package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.DriverFactory;

//import com.ctm.nexgen.core.DriverFactory;

//import com.ctm.nexgen.core.DriverFactory;

//import com.ctm.nexgen.core.DriverFactory;

//import com.ctm.nexgen.core.DriverFactory;

public class TC1_VerifyPageTitle extends DriverFactory
{

	
	@Test
	public void testGooglePageTitleInIEBrowser() throws Exception {
		getDriverInstance().navigate().to("http://www.google.com");
		String strPageTitle = getDriverInstance().getTitle();
		System.out.println("Page title: - "+strPageTitle);
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
		takeSnapShot();
		//loadPropertiesFile();
		WebElement belowDiv =getDriverInstance().findElement(By.xpath("//div[@id='prm-pt']"));
		belowDiv.findElement(By.xpath("//div[@id='SIvCob']//a[1]")).click();
		
		getDriverInstance().findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google सर्च']")).isDisplayed();
		
		belowDiv.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google सर्च']")).isDisplayed();
		
		
		//There is also possibility to use WebDriverWait with ExpectedConditions (to make sure that Frame will be available).

		//With string as parameter

		(new WebDriverWait(driver, 5)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame-name"));
		//With locator as a parameter

		(new WebDriverWait(driver, 5)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.id("frame-id"))));
		
	}

	
}

