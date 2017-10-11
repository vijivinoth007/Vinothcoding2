package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.HomePage;
import pages.LeafTapsPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers {
	
	
	@BeforeClass
	public void testDetails(){
		
		testCaseName = "TC003_createLead";
		testDescription = "To create a lead";
		category = "Smoke";
		authors = "vinoth";
		browserName = "chrome";
		dataSheetName = "TC003";		
		
				
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadCase(String userName,String passWord,String companyName,String firstName,String surName){
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin();
		
		new HomePage(driver, test)
		.clickCRMlink();
		
		new LeafTapsPage(driver, test)
		.clickCreateLead();
		
		new CreateLead(driver,test)
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterSurName(surName)
		.clickLeadSubmit();
		
	}

}
