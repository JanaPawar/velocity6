package NeoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import neoStoxutilityPackage.Utility1;

public class PasswordPage 
{
	@FindBy(id="txt_accesspin")private WebElement passwordFild;
    @FindBy(xpath="//a[text()='Submit']")private WebElement SubmitButton;
    public PasswordPage (WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    public void enterPassword(String Pass)
    {   
    	passwordFild.sendKeys(Pass);
    }
    public void clickOnSubmitButton()
    {
    	SubmitButton.click();
    }
}
