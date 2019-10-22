package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.DriverFactory;

public class hyperlink extends DriverFactory {
	
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public static void Hyperlink () throws InterruptedException {
		
		getDriverInstance().get("https://www.google.com/");
	
		
		WebElement searchbox =getDriverInstance().findElement(By.xpath("//input[@title='Search']"));
		searchbox.sendKeys("selenium");
		searchbox.submit();
		
		implicitWait(10);	
		
		int allLinksCount =getDriverInstance().findElements(By.tagName("a")).size();
		List<WebElement>  allLinks =getDriverInstance().findElements(By.tagName("a"));
		System.out.println("WebElement"+allLinks);
		
		for (int i=0; i<=allLinksCount; i++) {
			
			if(allLinks.get(i).getText().contains("7 Days")) {
				allLinks.get(i).click();
				break;
			}
			
			
		}
	}
}
