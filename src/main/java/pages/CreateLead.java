package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLead extends LeafTapsWrappers {
	
	
	
public CreateLead(RemoteWebDriver driver,ExtentTest test){
	
	this.driver = driver;
	 this.test = test;
	
	 if(!verifyTitle("Create Lead | opentaps CRM"))	
		 reportStep("This is not create page", "FAIL");
	 
}


public CreateLead enterCompanyName (String companyName){
	
	enterById("createLeadForm_companyName",companyName);
		
	return this;	
		
}


public CreateLead enterFirstName(String firstName){
	
	enterById("createLeadForm_firstName",firstName);
	return this;

}
public CreateLead enterSurName (String surName){	
	
	enterById("createLeadForm_lastName",surName);

	return this;
}

public ViewLead clickLeadSubmit(){
	
	clickByName("submitButton");

	return new ViewLead(driver,test);
	
}
}
	
	

	


