package com.validate;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertDemo {
	
	@Test
	public void softAssertNonStaticMethod() {
		SoftAssert softassert = new SoftAssert();
		Reporter.log("before Assert",true);
		softassert.assertSame("abcd", "abcd");
		
		softassert.fail("This is failure");
		
		Reporter.log("After Assert", true);
		Reporter.log("Hello World to SoftAssert", true);
	}

}
