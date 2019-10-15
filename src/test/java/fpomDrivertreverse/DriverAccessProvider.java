package fpomDrivertreverse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface DriverAccessProvider {
	
static WebDriver getDriverInstance () {
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}
	
	
}
