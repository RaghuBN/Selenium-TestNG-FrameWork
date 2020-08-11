package annotationPart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	@Test
	public void App() {
		System.setProperty("webdriver.ie.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\IE\\IE 64\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());

		// driver.close();
	}

	@Test
	public void Bal() {
		System.setProperty("webdriver.ie.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\IE\\IE 32\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		System.out.println(driver.getTitle());

		// driver.close();
	}

	@Test
	public void Cat() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.quit();

	}
	
	@Test
	public void Cat1() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.quit();

	}

	@Test
	public void Dog() {

		System.setProperty("webdriver.gecko.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\FireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
