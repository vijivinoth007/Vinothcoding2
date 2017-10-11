package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_LoginFailure extends LeafTapsWrappers {

	@BeforeClass
	public void testDetails(){
	
		testCaseName = "TC001_Login(Negative)";
		testDescription = "Testing Negative Functionality";
		category = "Smoke";
		authors = "Bala";
		browserName = "chrome";
		dataSheetName = "TC002";
		
	}
	
	@Test(dataProvider="fetchData")
	public void loginFailure(String UName, String Pwd, String ErrMsg){
		new LoginPage(driver, test)
		.enterUserName(UName)
		.enterPassword(Pwd)
		.clickLoginForFailure()
		.verifyErrorMessage(ErrMsg);
		
		
		
	}
}
