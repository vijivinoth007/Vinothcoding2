package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class HomePage extends LeafTapsWrappers {
	
	public HomePage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		 this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home Page", "FAIL");
		}		
	}
	
	
	public HomePage verifyLoginName(String text){
		verifyTextContainsByXpath("//h2[text()[contains(.,'Demo')]]", text);
		return this;
	}
	
	
	public LoginPage clickLogOut(){
		clickByClassName("decorativeSubmit");
		return new LoginPage(driver, test);
		
	}
	public LeafTapsPage clickCRMlink(){
			
		clickByLink("CRM/SFA");
		
		return new LeafTapsPage(driver,test);
	}
		
	}
	
	
	
	
	
	
	
	
	
	


