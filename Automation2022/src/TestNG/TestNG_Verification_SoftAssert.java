package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssert {

	@Test
	public void test() {
		String expResult = "good morning";
		String actResult = "good night";
		boolean result = false;
		
		SoftAssert soft = new SoftAssert();
		
		//Verification 1
		soft.assertNotEquals(actResult, expResult, "Verification 1: act & exp result is same");
		
		//Verification 2
		soft.assertEquals(actResult, expResult, "Verification 2: act & exp result is different");
		
		//Verification 3
		soft.assertTrue(result, "Verification 3: result is false");
		
		soft.assertAll();
		
		//Output:
		//java.lang.AssertionError: The following asserts failed:
		//Verification 2: act & exp result is different expected [good morning] but found [good night],
		//Verification 3: result is false expected [true] but found [false]

	}
}
