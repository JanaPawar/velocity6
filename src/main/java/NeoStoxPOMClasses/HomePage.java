package NeoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neoStoxutilityPackage.Utility1;

public class HomePage 
{
	@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement okButton;
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
	@FindBy(id="lbl_username")private WebElement userName;
	@FindBy(id="lbl_curbalancetop")private WebElement Balance;
	@FindBy(xpath="//span[text()='Logout']")private WebElement logOutButton;
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void popUpHandel()
	
	{
		okButton.click();
	
		closeButton.click();
	}
	public String getUserName()
	{
		String actualUserName = userName.getText();
		return actualUserName;
	}
	public String getBalance()
	{
		String accountBalence = Balance.getText();
		return accountBalence;
		
	}
	public void clickOnLogOutButton(WebDriver driver)
	{
		userName.click();
		Utility1.wait(driver, 1000);
		logOutButton.click();
	}
	
	

}
