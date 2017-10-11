package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class LeafTapsPage extends LeafTapsWrappers {

	
	public LeafTapsPage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("My Home | opentaps CRM"))			
		reportStep("This is not the leaftaps page", "Fail");
		
				
	}

	public CreateLead clickCreateLead() {
		// TODO Auto-generated method stub
		
		clickByLink("Create Lead");
		return new CreateLead(driver, test);
		
	}
	
	
	public Lead clickLead(){
		
		
		clickByLinkNoSnap("Leads");
		return new Lead(driver,test);
		
		
	}	
	
	
	
}
