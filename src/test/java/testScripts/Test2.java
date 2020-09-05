package testScripts;

import org.testng.annotations.Test;

import com.guru99demo.helper.assertions.AssertionHelper;
import com.guru99demo.testBase.TestBase;

public class Test2 extends TestBase {
	
	@Test
	public void login(){
		AssertionHelper.makeTrue();	
	}
	@Test
	public void login4(){
		AssertionHelper.fail();
	
	}
	
	@Test
	public void login5(){
		AssertionHelper.makeTrue();	
	}
	
	@Test
	public void login6(){
		AssertionHelper.fail();
	}
	

}
