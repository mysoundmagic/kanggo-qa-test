package testScript;

import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObjectModel.pomIndex;
import PageObjectModel.pomPerbaikiBangunanKonsumen;
import lib.setup;

public class testkanggoKonsumen extends setup{

	@Test
	public void testScriptKanggo() {
		pomIndex pomInd = new pomIndex();
		pomPerbaikiBangunanKonsumen pomBaikBangKonsumen = new pomPerbaikiBangunanKonsumen();

		/* TODO: open Perbaiki Bangunan - Untuk Konsumen */
		pomInd.pilihMenuHeader(driver, wait, 2);
		pomBaikBangKonsumen.assertionTextHeaderPage(driver);
		pomBaikBangKonsumen.assertTextSolusiKonsumen(driver);		
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
