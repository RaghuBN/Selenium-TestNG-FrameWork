package annotationPart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo1 {

	WebDriver driver;
	String baseUrl = "http://automationpractice.com/index.php";

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void VarifyPageTitle() {
		driver.get(baseUrl);
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Search - My Store");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
