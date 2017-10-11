package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.EditLead;
import pages.FindLead;
import pages.HomePage;
import pages.Lead;
import pages.LeafTapsPage;
import pages.LoginPage;
import pages.ViewLead;
import wrappers.LeafTapsWrappers;

public class TC004_EditLead extends LeafTapsWrappers {

	
	@BeforeClass
	public void testDetails(){
		
		testCaseName="TC004";
		testDescription="To edit lead";
		category="smoke";
		authors="vinoth";
		browserName="chrome";
		dataSheetName="TC004";

	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String userName,String passWord,String leadId,String companyName) throws InterruptedException{
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin();
		
		new HomePage(driver,test)
		.clickCRMlink();
		
		new LeafTapsPage(driver,test)
		.clickLead();
		
		new Lead(driver,test)
		.clickFindLead();
		
		new FindLead(driver,test)
		.enterLeadID(leadId)
		.clickFindLeadButton()
		.clickLeadIDlink(leadId);
		
		
		new ViewLead(driver,test)
		.clickEditLead();
		
		new EditLead(driver,test)
		.enterCompanyName(companyName)
		.clickUpdateButton();
		
		
		new ViewLead(driver,test)
		.verifyCompanyName(companyName);
		

		
		
		
		
	}
	
	

}
