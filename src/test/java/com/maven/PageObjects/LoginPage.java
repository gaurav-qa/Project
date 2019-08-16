package com.maven.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maven.Base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="")
	private static  WebElement loginUsername;
	@FindBy(xpath="")
	private static WebElement loginPassword;
	@FindBy(xpath="")
	private static WebElement loginSubmit;
	
	
	public static void LoginApplication(){
		
		loginUsername.sendKeys(prop.getProperty("userName"));
		loginPassword.sendKeys(prop.getProperty("password"));
		loginSubmit.click();
		log.info("logged in successfully");
	}
}
