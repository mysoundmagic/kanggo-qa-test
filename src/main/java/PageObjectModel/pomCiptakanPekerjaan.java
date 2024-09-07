package PageObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomCiptakanPekerjaan {
	
	public By perbaikiBangunanTukgJagoanText = By.xpath("//*[@class='layoutContainer']/section[1]/div[3]");
	
	public void assertTextHeaderCiptPekerja(WebDriver driver) {
		String textBangTkgJag = driver.findElement(perbaikiBangunanTukgJagoanText).getText();
		assertEquals(textBangTkgJag, "Tukang Jagoan Banyak Keuntungannya");
	}
	
}
