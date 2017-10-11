package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeFindLead extends LeafTapsWrappers{
	
	public MergeFindLead (RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if(!verifyTitle("Find Leads"))
			reportStep("This not a merge-find Lead page", "FAIL");
		
	}
				
	
	public MergeFindLead enterLeadIDForMergeLead1(String leadId1 ){
		
		enterByXpath("//input[@name='id']",leadId1);
		return this;
		
	}
	
	public MergeFindLead enterLeadIDForMergeLead2(String leadId2 ){
	
	enterByXpath("//input[@name='id']",leadId2);
	return this;
	
}
		
	public MergeFindLead clickFindLeadButton() throws InterruptedException{
		
					
		clickByXpath("//button[text()='Find Leads']");
		
		Thread.sleep(3000);
		return this;	
				
	}
	
	
	public MergeLead switchToParentWindowforMergeLead() throws InterruptedException
	{
		
		Thread.sleep(2000);
		switchToParentWindow();
		
		return new MergeLead(driver,test);
		
	}
	
	
	
	
	public MergeFindLead clickLeadIDlinkForMergeLead1(String leadId1){
		
		clickByLinkNoSnap(leadId1);
		
		return this;
	}
	
	public MergeFindLead clickLeadIDlinkForMergeLead2(String leadId2){
		
		clickByLinkNoSnap(leadId2);
		
		return this;
	}
	
	
	public FindLead verifyNoRecordsFound(){
		
		
		verifyTextByXpath("//div[contains(text(),'No record')]","No records to display");
		
		return new FindLead(driver,test);
		
		
	}
}



