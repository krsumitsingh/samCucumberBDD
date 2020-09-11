package testScripts;

import org.testng.annotations.Test;

import com.guru99demo.testBase.TestBase;

public class TestScreenShot extends TestBase {

	@Test
	public void testscreen1(){
		
		driver.get("http://makeseleniumeasy.com/dataprovider-concept-in-testng/");
		captureScreen("first screen", driver);
	}
	@Test
	public void testscreen2(){
		
		driver.get("https://www.lambdatest.com/blog/");
		captureScreen("second screen", driver);
	}
	
}
