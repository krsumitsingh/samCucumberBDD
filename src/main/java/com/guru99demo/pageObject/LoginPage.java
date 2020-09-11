package com.guru99demo.pageObject;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99demo.helper.alert.AlertHelper;
import com.guru99demo.helper.assertions.AssertionHelper;
import com.guru99demo.helper.assertions.VerificationHelper;
import com.guru99demo.helper.browserConfiguration.config.ObjectReader;
import com.guru99demo.helper.javaScript.JavaScriptHelper;
import com.guru99demo.helper.logger.LoggerHelper;
import com.guru99demo.helper.wait.WaitHelper;
import com.guru99demo.testBase.TestBase;

public class LoginPage {
	
	private WebDriver driver;
	
	private Logger log = LoggerHelper.getLogger(LoginPage.class);
	
	public String demo_site = "Demo Site";
	
	WaitHelper waithelper;
	JavaScriptHelper javascripthelper;
	VerificationHelper verificationhelper;
	AlertHelper alertHelper;
	
	@FindBy(xpath="//a[text()='Demo Site']")
	WebElement logindemosite;
	
	@FindBy(xpath="//input[contains(@name,'uid')]")
	WebElement userid;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@name,'btnLogin')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logoutBtn;

	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waithelper = new WaitHelper(driver);
		javascripthelper = new JavaScriptHelper(driver);
		verificationhelper = new VerificationHelper(driver);
		TestBase.logExtentReport("Login Page Object Created");
		
	}
	
	public void enterUserID(String userid){
		log.info("user id entered..");
		this.userid.sendKeys(userid);
		TestBase.logExtentReport("entering userid.."+userid);
	}
	
	public void enterPassword(String password ){
		log.info("password entered..");
		this.password.sendKeys(password);
		TestBase.logExtentReport("entering password.."+password);
	}
	
	public void clickloginBtn(WebElement element){
		log.info("login button clicked..");		
		javascripthelper.clickElement(element);
		TestBase.logExtentReport("login button clicked..");
	}
	
	public void clickLogoutBtn(WebElement element){
		log.info("logout button clicked..");
		javascripthelper.clickElement(element);	
		TestBase.logExtentReport("logout button clicked..");
	}
	
	
	public String verifyLoginPageText(){
		String text = verificationhelper.getTextFromElement(logindemosite);	
		AssertionHelper.verifyText(text, demo_site);
		return text;
		
	}
	
	public HomePage loginToApplication(String userid, String password){
		enterUserID(userid);
		enterPassword(password);
		clickloginBtn(loginBtn);
		return new HomePage(driver);
		
	}
	
	/*public void logout(){
		javascripthelper.scrollIntoViewAndClick(logoutBtn);
		log.info("clicked on logout link");
		//waithelper.setImplicitWait(ObjectReader.reader.getImpliciteWait(),TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//boolean status=alertHelper.isAlertPresent();
		//AssertionHelper.updateTestStatus(status);
		alertHelper.acceptAlert();
		waithelper.waitForElement(logindemosite, ObjectReader.reader.getExplicitWait());
	}*/
		
	
	
	

}
