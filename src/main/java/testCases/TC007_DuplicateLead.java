package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DuplicateLead;
import pages.FindLead;
import pages.HomePage;
import pages.Lead;
import pages.LeafTapsPage;
import pages.LoginPage;
import pages.ViewLead;
import wrappers.LeafTapsWrappers;

public class TC007_DuplicateLead extends LeafTapsWrappers {
	
	
	@BeforeClass
	public void testDetails(){
		
		testCaseName="TC0067";
		testDescription="To duplicate lead";
		category="smoke";
		authors="vinoth";
		browserName="chrome";
		dataSheetName="TC007";
		
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName,String passWord ) throws InterruptedException{
		
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin();
		
		new HomePage(driver, test)
		.clickCRMlink();
		
		new LeafTapsPage(driver, test)
		.clickLead();
		
		new Lead(driver, test)
		.clickFindLead()
		.enterLeadFirstName()
		.clickFindLeadButton()
		.clickLeadFirstName();
		
		
		new ViewLead(driver,test)
		.clickDuplicateLead();
		
		new DuplicateLead(driver,test)
		.clickCreateLead();
		
		new ViewLead(driver, test)
		.clickFindLeadfromViewLead();
		
		
		new FindLead(driver, test)
		.enterLeadFirstName()
		.clickFindLeadButton()
		.clickLeadFirstName();
		
		new ViewLead(driver, test)
		.verifyFirstName();
		
		
		

	}
	
	

}
