package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLead extends LeafTapsWrappers {
	
	public FindLead(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		if(!verifyTitle("Find Leads | opentaps CRM"))
			reportStep("This not a find Lead page", "FAIL");
		
	}
			

	public FindLead enterLeadID(String leadId ){
		
		enterByXpath("//input[@name='id']",leadId);
		
		return this;
		
	}
	
	
	public FindLead enterDeletedLeadID( ) throws InterruptedException{
		
		
		enterByXpath("//input[@name='id']",getLeadID());
		return this;
		
	}

	public FindLead enterMergedLeadToCheck(String leadId1){
		
		enterByXpath("//input[@name='id']",leadId1);
		return this;
		
	}
		
	public FindLead clickFindLeadButton() throws InterruptedException{
		
					
		clickByXpath("//button[text()='Find Leads']");
		
		Thread.sleep(3000);
		return this;	
				
	}
	
	
	public ViewLead clickLeadIDlink(String leadId){
		
		clickByLink(leadId);
		
		return new ViewLead(driver,test);
	}	
	
	public FindLead verifyNoRecordsFound(){
		
		
		verifyTextByXpath("//div[contains(text(),'No record')]","No records to display");
		
		return new FindLead(driver,test);
				
	}
	
	public FindLead clickPhoneField(){
		
		clickByLink("Phone");
		return this;
	}
	
	public FindLead enterPhoneCountryCode(String phoneCountryCode ){
		
		enterByName("phoneCountryCode",phoneCountryCode);
		return this;
	}
	
	public FindLead enterPhoneAreaCode(String phoneAreaCode ){
		
		enterByName("phoneAreaCode",phoneAreaCode);
		return this;
	}
	
	public FindLead enterPhoneNumber(String phoneNumber ){
		
		enterByName("phoneNumber",phoneNumber);
		return this;
	}
	
	
	public String getLeadID() throws InterruptedException{
		
		Thread.sleep(1000);
		String LeadID=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		return LeadID;
							
	}
	
	public ViewLead clickFirstResultingLeadID() throws InterruptedException{
		
		
		//String leadId=getLeadID();
		clickByLink(getLeadID());
		 
		
		return new ViewLead(driver, test);
		
	}
	
	public String getLeadFirstName(){
			
			String name=getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
			
			return name;			
			
		}
	
	public FindLead enterLeadFirstName() {
		
		enterByXpath("(//input[@name='firstName'])[3]",getLeadFirstName());
		
		return this;
	}	
		
	public ViewLead clickLeadFirstName(){
		
	  clickByLinkNoSnap(getLeadFirstName());
	  
	  return new ViewLead(driver, test);
		
	}
	
	
	
		
		
	}
	 
	
	
	

