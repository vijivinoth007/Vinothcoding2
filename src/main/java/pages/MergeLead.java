package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLead extends LeafTapsWrappers {

	
	public MergeLead(RemoteWebDriver driver,ExtentTest test){
		
		this.driver=driver;
		this.test=test;		
	}
	
	
	public MergeLead clickFromLeadID(){
		
		clickByXpath("(//img[@alt='Lookup'])[1]");		
				
		return this;		
	}
		
		
	public MergeFindLead swithToLastWindowForMergeLead(){
		
		switchToLastWindow();
		
		return new MergeFindLead(driver,test);	
	}
	
	public MergeLead clickToLeadID(){
		
		clickByXpath("(//img[@alt='Lookup'])[2]");
		
		return this;				
		
	}
	
	
	public MergeLead clickMergeLead(){
		
		clickByLinkNoSnap("Merge");
		
		return this;
	}
	
	public ViewLead chooseAlertYes() throws InterruptedException{
		
		Thread.sleep(3000);
		acceptAlert();
		
		return new ViewLead(driver,test);
		
	}
	
	
	
}
