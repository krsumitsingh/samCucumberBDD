package com.guru99demo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.guru99demo.pages.HomePage;
import com.guru99demo.pages.LoginPage;
import com.guru99demo.testbase.TestBase;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	String loginPageTitle;
	
	
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		TestBase.initialization();
		loginpage = new LoginPage();		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() throws Exception{
		loginPageTitle = loginpage.verifyLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "Guru99 Bank Home Page");
		//Thread.sleep(6000);
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		System.out.println("Browser Closed");
	}
	
	
}