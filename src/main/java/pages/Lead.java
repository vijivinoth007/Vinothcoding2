package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class Lead extends LeafTapsWrappers {
	
	public Lead(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("My Leads | opentaps CRM" ))
			
			reportStep("This is not a Lead page ", "FAIL");
		
		
	}
	
	public FindLead clickFindLead(){
		
		
		clickByLinkNoSnap("Find Leads");
		return new FindLead(driver,test);
				
	}
	
	public MergeLead clickMergeLead(){
		
		clickByLink("Merge Leads");
		
		return new MergeLead(driver,test);
	}
	
	
	
	
	
	

}
