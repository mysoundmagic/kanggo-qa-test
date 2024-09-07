package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomPerbaikiBangunanPerusahaan {

	public By perbaikiBangunanPerusahaanText = By.xpath("//*[@id='__next']//section[1]/div[2]/h2");

	public void assertTextHeaderPerush(WebDriver driver) {
		String textBangPerush = driver.findElement(perbaikiBangunanPerusahaanText).getText();
		assertEquals(textBangPerush, "Kelola Bangunan Bisnis dengan Nyaman Bersama Kanggo");
	}

}
