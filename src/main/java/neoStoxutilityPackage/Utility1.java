package neoStoxutilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;




public class Utility1 {

	public static String readDataFromPropertyFile(String key) throws IOException
	{
		//create object of Properties class
		
		Properties prop=new Properties();
		//create object of FileInputStream
		FileInputStream myFile=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\NeoStox\\Neo.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		//Reporter.log("reading value of "+key+" from property file",true);
		return value;		
	}
	
	
	
	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\My Drivers\\Notes\\Automation Java\\Java\\selenium screenshot"+fileName+".png");
		FileHandler.copy(source, dest);
	//	Reporter.log("taking screenshot ",true);
	}
	//
	
	public static void wait(WebDriver driver,int time)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	//	Reporter.log("waiting for "+time+"milis",true);
	}
	//

}
