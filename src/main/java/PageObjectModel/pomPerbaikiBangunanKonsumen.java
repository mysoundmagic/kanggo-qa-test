package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pomPerbaikiBangunanKonsumen {
	
	public By locatorSolusiKonsumen = By.xpath("//*[@id='__next']//section[2]/div[5]/div");
	private List<String> expectedTextSolusiKonsumen = Arrays.asList("Jagoan Cat", "Jagoan Keramik", "Jagoan Listrik");
	
	public By perbaikiBangunanKonsumentText = By.xpath("//*[@id='__next']//section/div/h2");
	
	public void assertionTextHeaderPage(WebDriver driver) {
		System.out.println(driver.getTitle());
		String textBangKons = driver.findElement(perbaikiBangunanKonsumentText).getText();
		assertEquals(textBangKons, "Semua Perbaikan Rumah Beres Bersama Kanggo");
	}
		
	public void assertTextSolusiKonsumen(WebDriver driver) {	
		List<WebElement> locatorTextSolKonsumenString = driver.findElements(locatorSolusiKonsumen);
		
		if (locatorTextSolKonsumenString.size() != expectedTextSolusiKonsumen.size()) {
			throw new AssertionError("Jumlah Locator dan expected text tidak sama");
		}
		
		for (int i = 0; i < locatorTextSolKonsumenString.size(); i++) {
			WebElement solusiKonsumenWebEle = locatorTextSolKonsumenString.get(i).findElement(By.xpath("./div[2]/div"));
			String text = solusiKonsumenWebEle.getText();
			
			if (!text.equals(expectedTextSolusiKonsumen.get(i))) {
                throw new AssertionError("Teks tidak sesuai untuk elemen ke-" + (i + 1) + ". Diharapkan: " + expectedTextSolusiKonsumen.get(i) + ", Ditemukan: " + text);
            }
		}
	}
	
}
