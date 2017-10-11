package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.HomePage;
import pages.Lead;
import pages.LeafTapsPage;
import pages.LoginPage;
import pages.ViewLead;
import wrappers.LeafTapsWrappers;

public class TC006_DeleteLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void testDetails(){
		
		testCaseName="TC006";
		testDescription="To delete lead";
		category="smoke";
		authors="vinoth";
		browserName="chrome";
		dataSheetName="TC006";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String userName,String passWord,String phoneAreaCode,String phoneCountryCode,String phoneNumber ) throws InterruptedException{
		
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin();
		
		new HomePage(driver, test)
		.clickCRMlink();
		
		new LeafTapsPage(driver, test)
		.clickLead();
		
		new Lead(driver, test)
		.clickFindLead();
		
		new FindLead(driver, test)
		.clickPhoneField()
		.enterPhoneAreaCode(phoneAreaCode)
		.enterPhoneCountryCode(phoneCountryCode)
		.enterPhoneNumber(phoneNumber)
		.clickFindLeadButton()
		.clickFirstResultingLeadID();
		
		new ViewLead(driver, test)
		.deleteLead();
		
		new Lead(driver, test)
		.clickFindLead();
		
		new FindLead(driver, test)
		.enterDeletedLeadID()
		.clickFindLeadButton()
		.verifyNoRecordsFound();
		
		

		
		
	}
	

}
