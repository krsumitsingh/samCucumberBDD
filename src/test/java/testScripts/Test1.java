package testScripts;

import org.testng.annotations.Test;

import com.guru99demo.helper.assertions.AssertionHelper;
import com.guru99demo.testBase.TestBase;

public class Test1 extends TestBase {
	
	@Test
	public void login(){
		AssertionHelper.makeTrue();	
	}
	@Test
	public void login1(){
		AssertionHelper.fail();
	
	}
	
	@Test
	public void login2(){
		AssertionHelper.makeTrue();	
	}
	
	@Test
	public void login3(){
		AssertionHelper.fail();
	}
	

}