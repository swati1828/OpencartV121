package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement txt_confmsg;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement lnk_logout;
	
	public boolean isMyAccountExist()
	{
		try
		{
			return(txt_confmsg.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}

	}
	public void click_logOut()
	{
		lnk_logout.click();
	}
}
