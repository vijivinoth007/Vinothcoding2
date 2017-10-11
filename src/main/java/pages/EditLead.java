package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLead extends LeafTapsWrappers {
	
	
	public EditLead(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		
		
		if(!verifyTitle("opentaps CRM"))
			reportStep("This is not the Edit lead page", "fail");
			
		}
	
	
	public EditLead enterCompanyName(String companyName) {
		
		enterById("updateLeadForm_companyName",companyName);
				
		return this;
			
	}
	
	public ViewLead clickUpdateButton() {
		
		clickByName("submitButton");
		return new ViewLead(driver,test);
		
		
	}
	
	
		
	}

