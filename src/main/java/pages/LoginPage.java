package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class LoginPage extends LeafTapsWrappers {
	
	public LoginPage(RemoteWebDriver driver,ExtentTest test){	
		 this.driver = driver;
		 this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Login Page", "FAIL");
		}		
	}
	
	public LoginPage enterUserName(String userName){
		enterById("username", userName);
		return this;
	}
	
	public LoginPage enterPassword(String passWord){
		enterById("password", passWord);
		return this;
	}
	
	public HomePage clickLogin(){
		clickByClassName("decorativeSubmit");		
		//HomePage hp = new HomePage();
		return new HomePage(driver, test);
	}
	
	
	public LoginPage clickLoginForFailure(){
		clickByClassName("decorativeSubmit");		
		//HomePage hp = new HomePage();
		return this;
	}
	
	
	public LoginPage verifyErrorMessage(String text){
		verifyTextContainsById("errorDiv", text);
		return this;
	}
	
	
	
	

}
