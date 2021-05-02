package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage {
	WebDriver driver;
	public ContactUsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how=How.ID, using="firstName")
	WebElement firstNameField;
	@FindBy(how=How.ID, using="lastName")
	WebElement lastNameField;
	@FindBy(how=How.ID, using="email")
	WebElement emailField;
	@FindBy(how=How.ID, using="mobile")
	WebElement mobileField;
	@FindBy(how=How.XPATH, using="//input[@type='text'and @name='emirate']")
	WebElement selectEmirate;
	@FindBy(how=How.XPATH, using="(//div[@class='InputSelect_dropdown__3i6yF']//ul)[1]/li")
	List<WebElement> emirateList;
	@FindBy(how=How.XPATH, using="//input[@type='text'and @name='reason']")
	WebElement selectReason;
	@FindBy(how=How.XPATH, using="(//div[@class='InputSelect_dropdown__3i6yF']//ul)[2]/li")
	List<WebElement> contactReasonList;
	@FindBy(how=How.XPATH, using="//input[@type='text'and @name='category']")
	WebElement categoryField;
	@FindBy(how=How.XPATH, using="(//div[@class='InputSelect_dropdown__3i6yF']//ul)[3]/li")
	List<WebElement> categoryList;
	@FindBy(how=How.ID, using="recaptcha-anchor")
	WebElement recaptchabox;
	
	public void selectYourEmirate(String youremirate)
	{	
		selectEmirate.sendKeys(youremirate);
		selectEmirate.sendKeys(Keys.ENTER);	
	}
	public String getSelectedEmirate()
	{
		return selectEmirate.getAttribute("value");
	}
	public int getEmirateSize()
	{
		return emirateList.size();
	}
	public boolean getCategoryfieldStatus()
	{
		return categoryField.isEnabled();
	}
	public void selectContactReason(String yourcontactreason)
	{
		selectReason.sendKeys(yourcontactreason);
		selectReason.sendKeys(Keys.ENTER);
	}
	public String getSelectedReason()
	{
		return selectReason.getAttribute("value");
	}
	public int getContactReasonSize()
	{
		return contactReasonList.size();
	}
	public int getCategorySize()
	{
		return categoryList.size();
	}
	
	public void setFirstname(String FirstName)
	{
		firstNameField.sendKeys(FirstName);
	}
	public void setLastName(String LastName)
	{
		lastNameField.sendKeys(LastName);
	}
	public void setEmail(String email)
	{
		emailField.sendKeys(email);
	}
	public void setMobileNumber(String mobile)
	{
		mobileField.sendKeys(mobile);
	}
	public void clickRecaptchaBox()
	{
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(recaptchabox));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", recaptchabox);
		Actions act=new Actions(driver);
		act.moveToElement(recaptchabox).click().build().perform();
		recaptchabox.click();
	}
	
	
}
