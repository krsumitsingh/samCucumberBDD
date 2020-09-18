package testScripts;

import org.testng.annotations.Test;

import com.guru99demo.helper.assertions.AssertionHelper;
import com.guru99demo.testBase.TestBase;

public class Test2 extends TestBase {
	
	@Test
	public void login4(){
		AssertionHelper.fail();
	}

	@Test
	public void login5(){
		System.out.println("Man who knew too much");
	}

}
