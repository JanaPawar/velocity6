package neoStoxBasePackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import neoStoxutilityPackage.Utility1;



public class BaseClass 
{
	
	protected static WebDriver driver;
	public void launchNeostox() throws IOException
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\Notes\\Automation Java\\Java\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=  (WebDriver) new ChromeDriver();
	driver.get(Utility1.readDataFromPropertyFile("url"));
	driver.manage().window().maximize();
	//Reporter.log("Launching browser",true);
	Utility1.wait(driver, 1000);
	
	
	//System.out.println();
	}
	
	public static void closingBrowser(WebDriver driver) throws InterruptedException
	{
		
		
	//Reporter.log("closing browser", true);
	Thread.sleep(500);
	driver.close();
	
	
	}
	
	
}


