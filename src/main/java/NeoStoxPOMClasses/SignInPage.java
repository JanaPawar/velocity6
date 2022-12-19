package NeoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage 
{
	@FindBy(name="ctl00$MainContent$signinsignup$txt_mobilenumber")private WebElement MobNumField;
	@FindBy(xpath="//a[@class='btn btn-signup']")private WebElement signInButton;

	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterPhoneNumb(String mNum)
	{
		MobNumField.sendKeys(mNum);
	}
	public void ClickOnSignInButton()
	{
		signInButton.click();	
	}
}
