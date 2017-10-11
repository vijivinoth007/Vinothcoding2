package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.HomePage;
import pages.Lead;
import pages.LeafTapsPage;
import pages.LoginPage;
import pages.MergeFindLead;
import pages.MergeLead;
import pages.ViewLead;
import wrappers.LeafTapsWrappers;

public class TC005_MergeLead extends LeafTapsWrappers {
	
	@BeforeClass
	public void testDetails(){
		

		testCaseName="TC005";
		testDescription="To Merge lead";
		category="smoke";
		authors="vinoth";
		browserName="chrome";
		dataSheetName="TC005";
		
	}

	
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName,String passWord,String leadId1,String leadId2 ) throws InterruptedException{
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin();
		
		new HomePage(driver,test)
		.clickCRMlink();
		
		new LeafTapsPage(driver,test)
		.clickLead();
		
		new Lead(driver, test)
		.clickMergeLead();
		
		new MergeLead(driver,test)
		.clickFromLeadID()
		.swithToLastWindowForMergeLead();
		
		new MergeFindLead(driver,test)
		.enterLeadIDForMergeLead1(leadId1)
		.clickFindLeadButton()
		.clickLeadIDlinkForMergeLead1(leadId1)
		.switchToParentWindowforMergeLead();
		
		
		new MergeLead(driver,test)
		.clickToLeadID()
		.swithToLastWindowForMergeLead();
		
		new MergeFindLead(driver,test)
		.enterLeadIDForMergeLead2(leadId2)
		.clickFindLeadButton()
		.clickLeadIDlinkForMergeLead2(leadId2)
		.switchToParentWindowforMergeLead();

		new MergeLead(driver,test)
		.clickMergeLead()
		.chooseAlertYes();
		
		new ViewLead(driver,test)
		.clickFindLeadfromViewLead();
		
		new FindLead(driver,test)
		.enterMergedLeadToCheck(leadId1)
		.clickFindLeadButton()
		.verifyNoRecordsFound();
		
		
		
		
		
		
	}
}
