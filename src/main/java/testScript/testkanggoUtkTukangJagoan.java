package testScript;

import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObjectModel.pomCiptakanPekerjaan;
import PageObjectModel.pomIndex;
import lib.setup;

public class testkanggoUtkTukangJagoan extends setup{

	@Test
	public void testScriptKanggo() {
		pomIndex pomInd = new pomIndex();
		pomCiptakanPekerjaan pomCiptakanPekerjaan = new pomCiptakanPekerjaan();
		
		/* TODO: open Perbaiki Bangunan - Untuk Tukang Jagoan */
		pomInd.pilihMenuHeader(driver, wait, 4);
		pomCiptakanPekerjaan.assertTextHeaderCiptPekerja(driver);
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
