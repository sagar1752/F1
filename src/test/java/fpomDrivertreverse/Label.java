package fpomDrivertreverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.DriverFactory;

public class Label //extends AutomationElement 

{
  

	public Label(String locator) {
		//super(locator);
		configureWebDrivers(locator);

	}
	
	public WebDriver  configureWebDrivers(String locator) {
		
		{
			return (WebDriver) DriverFactory.getDriverInstance().findElement(By.xpath(locator));
		}
	}
	
		
}