package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pomIndex {
	
    public void waitLoaded(WebDriverWait wait) {
        wait.until((ExpectedCondition<Boolean>) drv ->
            ((JavascriptExecutor) drv).executeScript("return document.readyState").equals("complete"));
    }

	/* header Menu */
	public By beranda = By.xpath("//*[@id='__next']//nav/a[1]");
	public By h2TextBeranda = By.xpath("//*[@id='__next']//section/div/div/h2");
	public By perbaikiBangunan = By.xpath("//*[@id='__next']//nav/div[1]/button[1]");
	public By perbaikiBangunanKonsumen = By.xpath("//*[@id='__next']//nav/div[1]/div[1]/div[1]/a[1]");
	public By perbaikiBangunanPerusahaan = By.xpath("//*[@id='__next']//nav/div[1]/div[1]/div[1]/a[2]");
	public By perbaikiBangunanTukgJagoan = By.xpath("//*[@id='__next']//nav/div[1]/div[1]/div[1]/a[3]");
	public By ciptakanPekerjaan = By.xpath("//*[@id='__next']//nav/a[2]");
	public By inilahKanggo = By.xpath("//*[@id='__next']//nav/a[3]");
	public By hubKami = By.xpath("//*[@id='__next']//section[1]/div[7]/a");
	
	public void pilihMenuHeader(WebDriver driver, WebDriverWait wait, int menu) {
		waitLoaded(wait);
		switch (menu) {
		case 1:
			wait.until(ExpectedConditions.visibilityOfElementLocated(beranda));
			driver.findElement(beranda).click();
			break;
		case 2:
			driver.findElement(perbaikiBangunan).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			driver.findElement(perbaikiBangunanKonsumen).click();
			waitLoaded(wait);
			break;
		case 3:
			driver.findElement(perbaikiBangunan).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			driver.findElement(perbaikiBangunanPerusahaan).click();
			waitLoaded(wait);
			break;
		case 4:
			driver.findElement(perbaikiBangunan).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			driver.findElement(perbaikiBangunanTukgJagoan).click();
			waitLoaded(wait);
			break;
		case 5:
			driver.findElement(ciptakanPekerjaan).click();
			waitLoaded(wait);
			break;
		case 6:
			driver.findElement(inilahKanggo).click();
			
			break;
		}
	}
	
	public void assertionHomeHeaderText(WebDriver driver) {
		System.out.println(driver.getTitle());
		String textBeranda = driver.findElement(h2TextBeranda).getText();
		assertEquals(textBeranda, "Bersama, Kita Ciptakan\n"
				+ "Jutaan Pekerjaan untuk Tukang");
	}
}
