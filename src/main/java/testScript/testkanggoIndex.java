package testScript;

import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObjectModel.pomIndex;
import lib.setup;

public class testkanggoIndex extends setup{

	@Test
	public void testScriptKanggo() {
		pomIndex pomInd = new pomIndex();
		
		/* TODO: open index page */
		pomInd.pilihMenuHeader(driver, wait, 1);
		pomInd.assertionHomeHeaderText(driver);
	}
		
	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			Date dateError = new Date();
			System.out.println("TEST FAILED - need check, error time: " + dateError);
		}
		
		if(result.getStatus() == ITestResult.SUCCESS)
	    {
	        System.out.println("passed **********");
	    }
		driver.quit();
	}
}
