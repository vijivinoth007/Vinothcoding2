package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLead extends LeafTapsWrappers{

	
	public ViewLead(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
				
	}
	
	public EditLead clickEditLead(){
		clickByLink("Edit");
		
		return new EditLead(driver,test);
	}
	
	
	public ViewLead verifyCompanyName(String companyName){
	verifyTextContainsById("viewLead_companyName_sp",companyName);
		return this;
		
		
	}
	
	public FindLead clickFindLeadfromViewLead(){
		
		clickByLink("Find Leads");
		
		return new FindLead(driver,test);	
				
	}
	
	public Lead deleteLead(){
		
		clickByLinkNoSnap("Delete");
		
		return new Lead(driver, test);
		
		
	}
	
	
	 
	public DuplicateLead clickDuplicateLead() {
		
		clickByLinkNoSnap("Duplicate Lead");
		
		return new DuplicateLead(driver, test);
		
		}
	
	public String getFirstname(){
		
		String name=getTextById("viewLead_firstName_sp");
		return name;

	}
	
	public ViewLead verifyFirstName(){
		
		FindLead find=new FindLead(driver, test);
		
		String name2= find.getLeadFirstName();
		String name1=getFirstname();
		
		if(name1==name2){
			
			System.out.println("The duplicated name Matches"+name2);
		 
		}
		return this;
				
		
	}
	
	
	
}
