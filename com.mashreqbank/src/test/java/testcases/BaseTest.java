package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;


public class BaseTest {
	WebDriver driver;
public HomePage homepage;
	
	@BeforeClass
	public void browserSetUp()
	{
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		homepage =new HomePage(driver);
	}
	
	@BeforeMethod
	public void mashreqHomePage()
	{
		driver.get("https://www.mashreqbank.com/uae/en/sme/home");
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
