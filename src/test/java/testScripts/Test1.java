package testScripts;

import org.testng.annotations.Test;

import com.guru99demo.helper.assertions.AssertionHelper;
import com.guru99demo.testBase.TestBase;

public class Test1 {
	
	@Test
	public void login(){
		AssertionHelper.makeTrue();	
	}
	
	@Test
	public void login1(){
		System.err.println("hello world");
	}
}
