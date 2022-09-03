package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Test_Class {

	@Test // @ - annotation - summary of method
	public void test() {
		//System.out.println("quantum academy");
		
		//Reporter.log("quantum academy", false);//message will be displayed in report but not in console
		
		Reporter.log("quantum academy", true);//message will be displayed in report as well as in console
		
	}
}
