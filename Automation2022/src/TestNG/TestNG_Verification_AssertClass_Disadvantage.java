package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verification_AssertClass_Disadvantage {

	//Hard Assert
	@Test
	public void test() {
		String expResult = "good morning";
		String actResult = "good night";
		boolean result = false;
		
		//verification 1
		Assert.assertNotEquals(actResult, expResult, "Verification 1: act & exp result is same");
		
		//Verification 2
		Assert.assertEquals(actResult, expResult,"Verification 2: act & exp reult is different");
		
		//Verification 3
		Assert.assertTrue(result, "Verification 3: result is false");
		
		//Output:
		//java.lang.AssertionError: Verification 2: act & exp reult is different expected [good morning] but found [good night]

	}
}
