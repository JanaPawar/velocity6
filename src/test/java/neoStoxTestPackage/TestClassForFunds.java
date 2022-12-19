package neoStoxTestPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeoStoxPOMClasses.HomePage;
import NeoStoxPOMClasses.PasswordPage;
import NeoStoxPOMClasses.SignInButton;
import NeoStoxPOMClasses.SignInPage;
import neoStoxBasePackage.BaseClass;
import neoStoxutilityPackage.Utility1;


public class TestClassForFunds extends BaseClass {
  
	    HomePage home;
	    PasswordPage password;
	    SignInButton sButton;
	    SignInPage signIn;

		
		 @BeforeClass
		  public void neoStoxLaunching() throws IOException
		 {
			 launchNeostox();
			 home=new HomePage(driver);
			 sButton=new SignInButton(driver);
			 signIn=new SignInPage(driver);
			 password=new PasswordPage(driver);
			 
		 }
		 @BeforeMethod
		 public void logInToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException 
		 {
			 sButton.clickOnSignInButton();
			 
			 signIn.enterPhoneNumb(Utility1.readDataFromPropertyFile("mobileNum"));
			 
			 signIn.ClickOnSignInButton();
			 Thread.sleep(1000);
			 
			 password.enterPassword(Utility1.readDataFromPropertyFile("password"));
			 
			 password.clickOnSubmitButton();
			 Thread.sleep(2000);
			 home.popUpHandel();
			 
		  
		 }

	  @Test
	  public void ValidateFunds()
	  {
		  Assert.assertNotNull(home.getBalance());
		  Reporter.log("AC balance is "+home.getBalance(), true);
	  }
	  
	  
	  @AfterMethod
	  public void logOut()
	  {
		  home.clickOnLogOutButton(driver);
	  }

	 

	  @AfterClass
	  public void closeBrouser() throws InterruptedException 
	  {
		  closingBrowser(driver);
	  }

	}


  

