package TestCases;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DriverFactory;
public class TC3_getWindowHandles extends DriverFactory {
	@Test
	public void getWindowHandles () throws Exception {
		driver.get("http://www.rediff.com/");
		//Switching to a iframe to fetch the details of the price
		String parent = driver.getWindowHandle();
		for(int i=0; i<3; i++)
		{
			String list [] = {"TCS","WIPRO","NIIT"};
			driver.switchTo().frame("moneyiframe");
			driver.findElement(By.id("query")).sendKeys(list[i]);
			driver.findElement(By.cssSelector(".getquoteinput")).submit();
			//Switching to a top window
			//driver.switchTo().defaultContent();

			Set<String> wSet= driver.getWindowHandles();
			System.out.println("Number of windows:::" + wSet.size());
			for(String x :  wSet)
			{
				if((x.equals(parent)))
				{
					driver.switchTo().window(x);
					System.out.println("Title:::"+ driver.getTitle());
				}
			}
			
			//Confirmation about the focus is using getTitle() method
			String title = driver.getTitle();
			System.out.println("Title::"  + title);
		}
		String url = driver.getCurrentUrl();
		System.out.println("url is ::: " + url);

		//Method fetches the name of the window which has focus
		//String parent = driver.getWindowHandle();
		System.out.println("Name of the window:::" + parent);
		//Set is a DataStructure available in the package java.util
		//Set allows unique values.It doest not allow duplicates compared to list.
		//Set cannot be retrieved using index. So,set is not index based like list.
		//Number of elements in the set can be retrieved using size() method
		//Method fetches all the names of the window
		Set<String> wSet= driver.getWindowHandles();
		System.out.println("Number of windows:::" + wSet.size());

		System.out.println("################Logic 1 - Using Enhanced for loop#################");
		for(String x :  wSet)
		{
			if(!(x.equals(parent)))
			{
				driver.switchTo().window(x);
				System.out.println("Title:::"+ driver.getTitle());
				if(driver.getTitle().contains("WIPRO"))
				{
					String price = driver.findElement(By.id("ltpid")).getText();
					System.out.println("The price is:::" + price);
					break;
				}
			}
		}
		
		
		// close second last window
		for(String x :  wSet)
		{
			System.out.println("Number of windows:::" + wSet.size());
			
			for (int i =0; i<=wSet.size(); i++) {
				
				driver.switchTo().window(x);
				
				if(i==wSet.size()-1) {
					driver.close();
					break;
				}
			}
		}
		
		
		
		System.out.println("########################Logic 2 - Using Iterator###################");
		Iterator<String> it = wSet.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println("Title:::"+ driver.getTitle());
			if(driver.getTitle().contains("Tata"))
			{
				String price = driver.findElement(By.id("ltpid")).getText();
				System.out.println("The price is:::" + price);
			}
		}
		System.out.println("###################Logic 3 - Using Single Dimension Array#############");
		Object[] wNames =  wSet.toArray();
		for(int i=0;i<wNames.length;i++)
		{
			driver.switchTo().window(wNames[i].toString());
			System.out.println("Title:::"+ driver.getTitle());
			if(driver.getTitle().contains("Tata"))
			{
				String price = driver.findElement(By.id("ltpid")).getText();
				System.out.println("The price is:::" + price);
			}
		}
	}
}

