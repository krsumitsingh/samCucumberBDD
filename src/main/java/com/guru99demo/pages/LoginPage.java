package com.guru99demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.testbase.TestBase;

public class LoginPage extends TestBase {
	
	//public static WebDriver driver;
	
	//Page Factory-OR
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='LOGIN']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[@class='logo']//img")
	WebElement signInLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);		
	}
	
	//Actions-Functions
	public String verifyLoginPageTitle(){	
		return driver.getTitle();		
	}
	
	public boolean verifyLoginPageImage(){
		return signInLogo.isDisplayed();
	}
	
	public HomePage SignIn(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();	
	}
	
	

}
