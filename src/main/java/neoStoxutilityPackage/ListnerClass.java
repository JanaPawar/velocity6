//package neoStoxutilityPackage;
//
//import java.io.IOException;
//
//
//import neoStoxBasePackage.BaseClass;
//
//@Listeners(neoStoxutilityPackage.ListnerClass.class)
//public class ListnerClass extends BaseClass implements ITestListener
// {
//	public void onTestSuccess(ITestResult result) {
//		//Reporter.log("TC"+result.getName()+" is completed successfuly",true);
//	}
//	
//	public void onTestSkipped(ITestResult result) 
//	{
//		//Reporter.log("TC"+result.getName()+" is skipped please check",true);
//			}
//
//	public void onTestFailure(ITestResult result) {
//	//	Reporter.log("TC "+result.getName()+"is failed",true);
//		try {
//			Utility1.takeScreenshot(driver, result.getName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//
//}
