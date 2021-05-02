package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH, using="//div[@class='leftLinks']")
	WebElement navigationBar;
	@FindBy(how=How.XPATH, using="//div[@class='leftLinks']/ul//li/a")
	List<WebElement> navigationLink;
	@FindBy(how=How.CLASS_NAME, using="newsBox")
	WebElement mashreqNews;
	@FindBy(how=How.XPATH, using="//a[@title='Contact us']")
	WebElement contactUsLink;
	
	public boolean getNavigationBarVisibility()
	{
		return navigationBar.isDisplayed();
	}
	public int getNavigationBarSize()
	{
		 int menuSize=navigationLink.size();
		 return menuSize;
	}
	public boolean mashreqNewBox()
	{
		return mashreqNews.isDisplayed();
	}
	public boolean contactUsLink()
	{
		return contactUsLink.isDisplayed();
	}
	public ContactUsPage clickContactUsLink()
	{
		contactUsLink.click();
		return new ContactUsPage(driver);
	}
	
}
