package fpomDrivertreverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.DriverFactory;

public  class AutomationElement extends DriverFactory implements DriverAccessProvider 
{

	
		public  WebElement AutomationElement1(String locator) {
		
		{
			return DriverFactory.getDriverInstance().findElement(By.xpath(locator));
		}
		
	}
	
	}