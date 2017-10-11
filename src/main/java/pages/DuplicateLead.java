package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLead extends LeafTapsWrappers{
	
	
	public DuplicateLead(RemoteWebDriver driver,ExtentTest test ){
		this.driver=driver;
		this.test=test;
		if(!verifyTitle("Duplicate Lead | opentaps CRM"))
			
			reportStep("this is not duplicate lead page", "Fail");
					
	}
	
	
	public  ViewLead clickCreateLead(){
		
		clickByName("submitButton");
		
		return new ViewLead(driver, test);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
