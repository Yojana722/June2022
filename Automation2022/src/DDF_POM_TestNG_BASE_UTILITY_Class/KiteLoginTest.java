package DDF_POM_TestNG_BASE_UTILITY_Class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest extends Base {

	KiteLoginPage1 login1;
	KiteLoginPage2 login2;
	KiteHomePage home;
	KiteLogOutPage logOut;

	@BeforeClass
	public void openBrowser() throws IOException {
		browserOpen();
		login1 = new KiteLoginPage1(driver);
		login2 = new KiteLoginPage2(driver);
		home = new KiteHomePage(driver);
		logOut = new KiteLogOutPage(driver);

	}

	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException {
		login1.setKiteLoginPage1Username(Utility.getTestData(0, 0));
		login1.setKiteLoginPage1Password(Utility.getTestData(0, 1));
		login1.clickKiteLoginPage1LoginBtn();

		login2.setKiteLoginPage2PIN(Utility.getTestData(0, 2));
		login2.clickKiteLoginPage2();

	}

	@Test
	public void test() throws EncryptedDocumentException, IOException {
		String expResult = Utility.getTestData(0, 3);
		String actResult = home.verifiyKitehomePageUserId();

		Assert.assertEquals(actResult, expResult, "act & exp result is different");
	}

	@AfterMethod
	public void logOut(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {//2
			int TCID = 200;
			Utility.captureScreenshot(driver, TCID);
		}
		
		home.clickKiteHomePageUserId();
		logOut.clickKiteLogOutPageLogOutBtn();
	}

	@AfterClass
	public void closeBowser() {
		driver.quit();

	}

}
