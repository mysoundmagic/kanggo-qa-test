package lib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class setup {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	@Parameters({"url"})
	public void setUp(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get(url);
	}
}
